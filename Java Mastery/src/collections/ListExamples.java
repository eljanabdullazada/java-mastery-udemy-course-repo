package collections;

import java.util.ArrayList;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        System.out.println("ages : " + ages);

        //Since this list is of type Object it can store different types of elements.
        ArrayList<Object> mixList = new ArrayList();
        mixList.add("Eljan");
        mixList.add(10);
        mixList.add(true);
        System.out.println("mixlist : " + mixList);
    }
}
