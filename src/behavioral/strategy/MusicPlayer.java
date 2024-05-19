package behavioral.strategy;

import java.util.List;

public class MusicPlayer {
    List<Song>songList;
    PlayNextStrategy playNextStrategy;

    public MusicPlayer(List<Song>songList) {
        this.songList = songList;
    }

    public void addSong(Song song) {
      this.songList.add(song);
    }

    public void removeSong(Song song) {
        this.songList.remove(song);
    }

    public void setPlayNextStrategy(PlayNextStrategy playNextStrategy) {
      this.playNextStrategy = playNextStrategy;
    }

    public Song playNext() {
        return playNextStrategy.playNextSong(songList);
    }
}
