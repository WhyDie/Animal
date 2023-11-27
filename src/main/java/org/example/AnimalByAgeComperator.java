package org.example;

import java.util.Comparator;

public class AnimalByAgeComperator implements Comparator<PatAnimal> {
    private Order order;

    public AnimalByAgeComperator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        return Integer.compare(o2.getAge(),o1.getAge());
    }

}
