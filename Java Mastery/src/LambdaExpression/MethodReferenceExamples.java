package LambdaExpression;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        /*
        List<String> animals = Arrays.asList("Cat", "Cow", "Dog", "Horse");
        //Consumer<String> animalConsumer = animal -> System.out.println(animal);
        Consumer<String> animalConsumer = System.out::println;
        animals.forEach(animalConsumer);
        */

        List<String> animals = Arrays.asList("Cat", "Cow", "Dog", "Horse");
        animals.forEach(animal -> {
            if(animal.startsWith("C")){
                System.out.println(animal);
            }
        });

        // Static method reference
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        Integer result = stringIntegerFunction.apply("123");
        System.out.println(result);

        // Method reference via an object
        String str = "hello";
//        Supplier<String> stringSuplier = () -> str.toUpperCase();
        Supplier<String> stringSuplier = str::toUpperCase;
        System.out.println(stringSuplier.get());

        // Calling a constructor of a class
        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        ArrayList<String> myList = arrayListSupplier.get();


    }
}
