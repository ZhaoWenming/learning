package org.zwm.templateMethod;

public class Main {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        game = new Basketball();
        game.play();
    }
}
