package io.github.olgaak.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("io.github.olgaak.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
