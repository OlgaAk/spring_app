package io.github.olgaak.springapp;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private int volume;

    public void doMyInit(){
        System.out.println("Doing initialisation");
    }
    public void doMyDestroy(){
        System.out.println("Doing destruction");
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for(Music music : musicList){
            System.out.println("Playing " + music.getSong());
        }

    }

    public int getVolume() {
        return volume;
    }
}
