package io.github.olgaak.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    private List<Music> musicList;
    private int volume;

//    @Autowired
//    public MusicPlayer( Music music){
//        this.music = music;
//    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }

    public int getVolume() {
        return volume;
    }

    public void playSong() {
        System.out.println("Playing " + music.getSong());
    }
}
