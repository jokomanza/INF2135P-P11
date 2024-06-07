// file: Mario.java
package assignment;

import assignment.item.Item;

public class Mario {
    private Item item;

    public Mario() {
        System.out.println("Hi, I'm Mario");
    }

    public void jump() {
        if (item == null) {
            System.out.println("Mario is jumping");
        } else {
            String effect = item.effect();
            System.out.println("Mario is jumping with " + effect);
        }
    }

    public void eat(Item item) {
        this.item = item;

        String[] names = item.toString().split("\\.");
        String itemName = names[names.length - 1];
        System.out.println("Mario is eating " + itemName);
    }
}
