package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(19);
        numbersList.add(11);
        numbersList.add(17);
        numbersList.add(15);
        numbersList.add(39);
        numbersList.add(27);
        numbersList.add(22);

//        Collections.sort(numbersList);
        System.out.println(Collections.binarySearch(numbersList, 17));
        System.out.println(Collections.binarySearch(numbersList, 27));
        System.out.println(Collections.binarySearch(numbersList, 8));
    }
}
