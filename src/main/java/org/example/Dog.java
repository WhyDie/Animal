package org.example;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog>{
    private int scaredOfThiefCount = new Random().nextInt(getAge()*getAge()+1);
    public Dog(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    public Dog(String name, LocalDate yearOfBirth, int scaredOfThiefCount) {
        super(name, yearOfBirth);
        this.scaredOfThiefCount = scaredOfThiefCount;
    }
    @Override
    public int compareTo(Dog o) {
        return Integer.compare(scaredOfThiefCount,o.scaredOfThiefCount);
    }

    @Override
    public String toString() {
        return "Dog " +
                getName() +
                " scared of " +
                scaredOfThiefCount +
                " thieves";
    }


}
