package Challenge;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double length) {
        this.title = title;
        this.duration = length;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ": " + duration;
    }
}
