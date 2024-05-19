package behavioral.strategy;

import java.util.List;

public interface PlayNextStrategy {
    Song playNextSong(List<Song> songList);
}
