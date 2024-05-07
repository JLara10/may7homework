package hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Array lists
        ArrayList fruits = new ArrayList();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.remove("Apple");
        System.out.println(fruits);
        System.out.println("============");

        ArrayList cars = new ArrayList();
        cars.add("Lambo");
        cars.add("Ferrari");
        cars.add("Pagani");
        cars.add("Buggati");
        cars.add("McLaren");
        System.out.println(cars);
        cars.remove("McLaren");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.add("Rolls Royce");
        System.out.println(cars);
        System.out.println("============");

        Map<Integer, String> Barcelona = new HashMap<Integer, String>();
        Barcelona.put(10, "Messi");
        Barcelona.put(6, "Xavi");
        Barcelona.put(8, "Iniesta");
        Barcelona.put(9,"Suarez");
        System.out.println(Barcelona);
        Barcelona.replace(6,"Gavi");
        System.out.println(Barcelona);
        System.out.println("============");

        HashSet<String> sports = new HashSet<String>();
        sports.add("Soccer");
        sports.add("Football");
        sports.add("Basketball");
        sports.add("BaseBall");
        System.out.println(sports);
        sports.remove("Basketball");
        System.out.println(sports.contains("Soccer"));

    }
}
