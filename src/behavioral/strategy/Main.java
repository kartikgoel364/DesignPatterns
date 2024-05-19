package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("1", "So1", "A1", "AL1", 5);
        Song song2 = new Song("2", "So2", "A2", "AL2", 4);
        Song song3 = new Song("3", "So3", "A3", "AL3", 2);
        Song song4 = new Song("4", "So4", "A4", "AL4", 3);
        Song song5 = new Song("5", "So5", "A5", "AL5", 6);
        Song song6 = new Song("6", "So6", "A6", "AL6", 7);

        ArrayList<Song> songList = new ArrayList<>(List.of(new Song[]{
                song1,
                song2,
                song3,
                song4,
                song5,
                song6
        }));

        MusicPlayer musicPlayer = new MusicPlayer(songList);

        PlayNextStrategy serialStrategy = new SerialStrategy();
        PlayNextStrategy randomStrategy = new RandomStrategy();
        PlayNextStrategy repeatStrategy = new RepeatStrategy(song3);

        musicPlayer.setPlayNextStrategy(serialStrategy);
        Song s1 = musicPlayer.playNext();
        Song s2 = musicPlayer.playNext();
        Song s3 = musicPlayer.playNext();
        Song s4 = musicPlayer.playNext();
        Song s5 = musicPlayer.playNext();
        Song s6 = musicPlayer.playNext();
        Song s7 = musicPlayer.playNext();
        Song s8 = musicPlayer.playNext();
        Song s9 = musicPlayer.playNext();

        System.out.println(s1.getName() + " <<-->> " + s2.getName() + " <<-->> " +
                s3.getName() + " <<-->> " + s4.getName() + " <<-->> " +
                s5.getName() + " <<-->> " + s6.getName() + " <<-->> " +
                s7.getName() + " <<-->> " + s8.getName() + " <<-->> " +
                s9.getName());

        musicPlayer.setPlayNextStrategy(repeatStrategy);
        Song s10 = musicPlayer.playNext();
        Song s11 = musicPlayer.playNext();
        Song s12 = musicPlayer.playNext();

        System.out.println(s10.getName() + " <<-->> " + s11.getName() + " <<-->> " + s12.getName());

        musicPlayer.setPlayNextStrategy(randomStrategy);
        Song s13 = musicPlayer.playNext();
        Song s14 = musicPlayer.playNext();
        Song s15 = musicPlayer.playNext();
        Song s16 = musicPlayer.playNext();
        Song s17 = musicPlayer.playNext();
        Song s18 = musicPlayer.playNext();
        Song s19 = musicPlayer.playNext();
        Song s20 = musicPlayer.playNext();

        System.out.println(s13.getName() + " <<-->> " + s14.getName() + " <<-->> " + s15.getName() +
                " <<-->> " + s16.getName() + " <<-->> " + s17.getName() + " <<-->> "
                + s18.getName() + " <<-->> " + s19.getName() + " <<-->> " + s20.getName());
    }
}