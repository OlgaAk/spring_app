package io.github.olgaak.springapp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicGenre.CLASSICAL);
        System.out.println(player.getVolume());
        context.close();
    }
}
