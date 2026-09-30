package org.laraib.learnspringframewok;

import org.laraib.learnspringframewok.game.GameRunner;
import org.laraib.learnspringframewok.game.MarioGame;
import org.laraib.learnspringframewok.game.PacmanGame;
import org.laraib.learnspringframewok.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();

        var gameRunner = new GameRunner(marioGame);

        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(pacmanGame);
        gameRunner.run();
        gameRunner2.run();
        gameRunner3.run();

    }
}
