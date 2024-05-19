package behavioral.strategy;

import java.util.List;

public class RandomStrategy implements PlayNextStrategy {
    @Override
    public Song playNextSong(List<Song> songList) {
        // Less probability for collision
        int randomIndex = (int) (Math.random() * songList.size());
        return songList.get(randomIndex);
    }
}
