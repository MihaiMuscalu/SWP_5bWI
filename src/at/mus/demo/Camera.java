package at.mus.demo;

public class Camera {

    private int Weight;
    private int Color;
    private int FileSize;

    public Camera(int weight, int color, int fileSize) {
        this.Weight = weight;
        this.Color = color;
        this.FileSize = fileSize;
    }

    public int getWeight() {
        return Weight;
    }

    public int getColor() {
        return Color;
    }

    public int getFileSize() {
        return FileSize;
    }

    public void setWeight(int weight) {
        this.Weight = weight;
    }

    public void setColor(int color) {
        this.Color = color;
    }

    public void setFileSize(int fileSize) {
        this.FileSize = fileSize;
    }

    public void TakePhoto(SDCard sdCard) {
        File photo = new File("Photo " + sdCard.getFiles().size(), 300);
        if (sdCard.getFreeSpace() >= photo.getSize()) {
            sdCard.addFile(photo);
        } else {
            throw new IllegalStateException("Not enough space on card! Please empty card before saving new files");
        }
    }

}
