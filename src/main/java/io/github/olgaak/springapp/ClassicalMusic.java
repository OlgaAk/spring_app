package io.github.olgaak.springapp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("Symphony N9", "Moonlight sonata");
    }
}
