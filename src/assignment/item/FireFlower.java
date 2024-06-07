// file: FireFlower.java
package assignment.item;

public class FireFlower implements Item {
    public FireFlower() {
        System.out.println("FireFlower is created");
    }

    @Override
    public String effect() {
        return "spitting fire";
    }
}
