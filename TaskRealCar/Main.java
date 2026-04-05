package TaskRealCar;


import TaskRealPerson.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        //level 4

        Map<Car,String> car = new HashMap();
        car.put( new Car(1,"red"),"ahmed");
        car.put( new Car(2,"black"), "mahmoud");
        car.put( new Car(1,"red"), "ahmed");

        System.out.println(car.size());










    }
}