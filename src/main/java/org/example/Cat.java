package org.example;

import java.time.LocalDate;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{
    private int caughtMiceCount = new Random().nextInt(getAge()*getAge()+1);
    public Cat(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    public Cat(String name, LocalDate yearOfBirth, int coughtMiceCount) {
        super(name, yearOfBirth);
        this.caughtMiceCount = coughtMiceCount;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(caughtMiceCount,o.caughtMiceCount);
    }

    @Override
    public String toString() {
        return "Cat " +
                getName() +
                " caught " +
                caughtMiceCount +
                " mice";
    }
}
