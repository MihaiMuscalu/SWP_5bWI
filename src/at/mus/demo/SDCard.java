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

    public void addFile(File file) {
        this.files.add(file);
    }

    public long getFreeSpace() {
        long usedSpace = 0;
        for (File file : files) {
            usedSpace += file.getSize();
        }
        return capacity - usedSpace;
    }

}
