package org.example;

import java.util.*;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat murca = new Cat("murca", LocalDate.of(2008,1,14));
        Cat tom = new Cat("tom",LocalDate.of(2010,4,29));
        List<Cat> cats = new ArrayList<>(List.of(murca,tom));
        Collections.sort(cats);
        for(Cat cat : cats){
            System.out.println(cat);
        }
        Dog shuric = new Dog("shuric",LocalDate.of(2005,9,9));
        List<Dog> dogs = new ArrayList<>(List.of(shuric));
        Collections.sort(dogs);
        for(Dog dog : dogs){
            System.out.println(dog);
        }
        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComperator(Order.DESCENDING));
        for(PatAnimal animal : rancho){
            System.out.println(animal.getName() + " " + animal.getAge() + " years" );
        }
    }
}