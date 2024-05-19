package behavioral.strategy;

import java.util.List;

public class RepeatStrategy implements PlayNextStrategy {
    Song repeatSong;

    public RepeatStrategy(Song song) {
      this.repeatSong = song;
    }

    @Override
    public Song playNextSong(List<Song> songList) {
        return repeatSong;
    }
}
