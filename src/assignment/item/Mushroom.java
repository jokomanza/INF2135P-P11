// file: Mushroom.java
package assignment.item;

public class Mushroom implements Item {
    public Mushroom() {
        System.out.println("Mushroom is created");
    }

    @Override
    public String effect() {
        return "bigger body";
    }
}
