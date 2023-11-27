package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;

public class PatAnimal {
    private String name;
    private LocalDate yearOfBirth;

    public PatAnimal(String name, LocalDate yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public void sleep(){
        System.out.println(getName() + " sleep");
    }
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(yearOfBirth, currentDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }
}
