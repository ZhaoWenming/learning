package org.zwm.templateMethod;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
