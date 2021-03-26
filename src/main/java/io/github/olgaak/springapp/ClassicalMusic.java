package io.github.olgaak.springapp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Symphony N9";
    }
}
