package collections;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        System.out.println("ages : " + ages);

        //Since this list is of type Object it can store different types of elements.
        ArrayList<Object> mixList = new ArrayList<>();
        mixList.add("Eljan");
        mixList.add(10);
        mixList.add(true);
        System.out.println("mixlist : " + mixList);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add(2,"Dog");
        animals.add(1,"Cow");
        System.out.println("animals : " + animals);

        animals.remove(2); // removes the elements at index 2
        System.out.println("animals : " + animals);

        animals.remove("Dog");
        System.out.println("animals : " + animals);

        animals.set(0, "Ant");
        System.out.println("animals : " + animals);

        ArrayList<String> cars = new ArrayList<>();
        System.out.println("size: " + cars.size());
        System.out.println("is cars empty? " + cars.isEmpty());

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ferrari");

        System.out.println("size: " + cars.size());
        System.out.println("is cars empty? " + cars.isEmpty());

        System.out.println("does cars contain Opel? " + cars.contains("Opel")); //false
        System.out.println("does cars contain BMW? " + cars.contains("BMW")); //true


        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Andy");
        names.add("Clark");

        ArrayList<Object> names2 = new ArrayList<>();
        names2.add("Clark");
        names2.add("David");
        names2.add("Andy");

        System.out.println(names.equals(names2)); // false because equals method compares them in order


    }
}
