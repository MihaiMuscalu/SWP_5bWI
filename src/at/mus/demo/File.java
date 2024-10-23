package at.mus.demo;

import java.time.LocalDate;

public class File {
    private String name;
    private LocalDate creationDate;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.creationDate = LocalDate.now();
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public long getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

}
