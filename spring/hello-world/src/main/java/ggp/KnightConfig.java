package ggp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ggp.knights.*;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new RescueDamselQuest();
    }

}
