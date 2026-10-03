package org.laraib.learnspringframewok.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner  {

    private final IGame game;


    public GameRunner(@Qualifier("SuperContraGameQualifier") IGame game) {
        this.game = game;
    }


    public void run() {
        System.out.println("\n Running game..." + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
