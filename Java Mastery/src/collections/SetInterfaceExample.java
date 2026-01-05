package collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        /*
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
        */

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(13);
        set1.add(17);
        set1.add(18);
        set1.add(16);
        set1.add(14);

        System.out.println("Set1 = " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(11);
        set2.add(12);
        set2.add(15);
        set2.add(13);
        set2.add(19);
        set2.add(13);

        System.out.println("Set2 = " + set2);

        //Intersection -> retainAll()
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("intersectionSet = " + intersectionSet);

        //Union -> addAll()
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("unionSet = " + unionSet);

        //Difference -> removeAll()
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("differenceSet = " + differenceSet);

    }
}
