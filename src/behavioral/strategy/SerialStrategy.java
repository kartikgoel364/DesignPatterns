package behavioral.strategy;

import java.util.List;

public class SerialStrategy implements PlayNextStrategy {
    int currentIndex = 0;

    @Override
    public Song playNextSong(List<Song> songList) {
      int playlistSize = songList.size();
      if(playlistSize == 0) return null;
      currentIndex = currentIndex % playlistSize;
      return songList.get(currentIndex++);
    }
}
