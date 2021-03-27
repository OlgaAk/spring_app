package io.github.olgaak.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("io.github.olgaak.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public Music classicalMusic(){
        return ClassicalMusic.getClassicalMusic();
    }
    @Bean
    public Music rockMusic(){
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(),rockMusic());
    }
}
