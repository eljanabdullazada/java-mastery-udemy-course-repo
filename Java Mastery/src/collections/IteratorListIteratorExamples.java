package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorListIteratorExamples {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        int i = 1;
        while(i < 51){
            numbersList.add(i);
            i++;
        }

        System.out.println("numbersList: " + numbersList);

        //Iterator
        Iterator<Integer> iterator = numbersList.iterator();

        while(iterator.hasNext()){
            if(iterator.next() % 3 != 0){
                iterator.remove();
            }
        }
        System.out.println("newNumbersList: " + numbersList);
    }
}
