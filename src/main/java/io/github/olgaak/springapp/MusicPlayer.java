package io.github.olgaak.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    private Music classicalMusic;
//
//    @Autowired
//    private Music rockMusic;

    private List<Music> musicList;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initializing player");
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
//        Music selectedMusic;
//        switch (genre) {
//            case CLASSICAL:
//                selectedMusic = classicalMusic;
//                break;
//            case ROCK:
//                selectedMusic = rockMusic;
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + genre);
//        }
        int index = getRandomInt(musicList.size());
        playSong(musicList.get(index));


    }


    public int getVolume() {
        return volume;
    }

    public void playSong(Music selectedMusic) {

        if (selectedMusic != null) {
            List<String> musicList = selectedMusic.getSong();
            int index = getRandomInt(musicList.size());
            System.out.println("Playing " + musicList.get(index));
        }
    }

    private int getRandomInt(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }
}
