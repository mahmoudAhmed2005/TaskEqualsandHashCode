package TaskRealPerson;


import TaskReal.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        //level 4

        Set<Person> person = new HashSet<>();
        person.add( new Person(1,"mah@198"));
        person.add( new Person(2,"ali@234"));
        person.add( new Person(1,"mah@198"));

        System.out.println(person.size());










    }
}