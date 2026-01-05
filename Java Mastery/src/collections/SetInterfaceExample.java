package collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> animalsSet = new HashSet<>();
        animalsSet.add("Cat");
        animalsSet.add("Dog");
        animalsSet.add("Cow");
        animalsSet.add("Lion");
        animalsSet.add("Ant");
        animalsSet.add("Dog");

        System.out.println("animalsSet = " + animalsSet);
        System.out.println("Size of animalsSet = " + animalsSet.size());
        animalsSet.remove("Cow");
        System.out.println("animalsSet = " + animalsSet);
        System.out.println("Contains Sheep ? " + animalsSet.contains("Sheep"));
    }
}
