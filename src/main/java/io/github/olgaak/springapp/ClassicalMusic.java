package io.github.olgaak.springapp;

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
