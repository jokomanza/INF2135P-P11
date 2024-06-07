// file: Main.java
package assignment;

import assignment.item.FireFlower;
import assignment.item.Mushroom;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.jump();

        spacer();

        FireFlower fireFlower = new FireFlower();
        Mushroom mushroom = new Mushroom();

        spacer();

        mario.eat(fireFlower);
        mario.jump();

        spacer();

        mario.eat(mushroom);
        mario.jump();
    }

    private static void spacer() {
        System.out.println();
    }
}
