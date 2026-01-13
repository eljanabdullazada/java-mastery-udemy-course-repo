package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<String, Integer> carsMap = new HashMap<>();

        carsMap.put("Mercedes", 40008);
        carsMap.put("Ferrari", 35000);
        carsMap.put("BMW",30000);
        carsMap.put("BMW",25000);
        carsMap.put("Ford", 20000);


        System.out.println("carsMap = " + carsMap);

        carsMap.remove("Ford");
        carsMap.replace("Mercedes", 35000);

        System.out.println("Last version of carsMap = " + carsMap);

        System.out.println("Price of BMW " + carsMap.get("BMW"));

//        for(String car : carsMap.keySet()){
//            System.out.println("Price of " + car + " is " + carsMap.get(car));
//        }


        for (Map.Entry<String, Integer> mapEntry : carsMap.entrySet()){
            System.out.println("Price of " + mapEntry.getKey() + " is " + mapEntry.getValue());
        }

    }
}
