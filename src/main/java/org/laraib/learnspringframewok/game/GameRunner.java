package org.laraib.learnspringframewok.game;

public class GameRunner  {

    private final IGame game;


    public GameRunner(IGame game) {
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
