package org.laraib.learnspringframewok.game;

public class SuperContraGame implements IGame {

    @Override
    public void up() {
        System.out.println("Jump two times");
    }

    @Override
    public void down() {
        System.out.println("Go into a hole and move two times");
    }

    @Override
    public void left() {
        System.out.println("Move left and shoot");
    }

    @Override
    public void right() {
        System.out.println("Move right and shoot");
    }

}
