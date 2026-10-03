package org.laraib.learnspringframewok;

import org.laraib.learnspringframewok.game.GameRunner;
import org.laraib.learnspringframewok.game.IGame;
import org.laraib.learnspringframewok.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public IGame game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(IGame game) {
        var runner = new GameRunner(game);
        return runner;
    }

}
