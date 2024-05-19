package behavioral.strategy;

public class Song {
   String id;
   String name;
   String artist;
   String album;
   int duration;

    public Song(String id, String name, String artist, String album, int duration) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
}
