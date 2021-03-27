package io.github.olgaak.springapp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        return Arrays.asList("Come as you are", "Yellow Submarine");
    }
}
