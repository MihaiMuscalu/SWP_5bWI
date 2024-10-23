package at.mus.demo;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private long capacity;
    private List<File> files = new ArrayList<>();

    public SDCard(long capacity) {
        this.capacity = capacity;
    }

    public long getCapacity() {
        return capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public long getFreeSpace() {
        long usedSpace = 0;
        for (File file : files) {
            usedSpace += file.getSize();
        }
        return capacity - usedSpace;
    }

    public void TakePhoto() {
        File photo = new File("Photo " + files.size(), 300);
        if (getFreeSpace() >= photo.getSize()) {
            files.add(photo);
        } else {
            throw new IllegalStateException("Not enough space on card! Please empty card before saving new files");
        }
    }
}
