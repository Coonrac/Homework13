package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[6];
        person[0] = new Person("Валентин", 25);
        person[1] = new Person("Валентин", 42);
        person[2] = new Person("Ян", 31);
        person[3] = new Person("Дмитрий", 30);
        person[4] = new Person("Алексей", 74);
        person[5] = new Person("Борис", 85);

        Arrays.sort(person, new PersonSuperComparator());
        for(Person persons: person)
            System.out.printf(String.valueOf(persons));
    }
}

class Person{
    private String name;
    private int age;
    public Person (String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Имя: " +  name + ", " + "возраст: " + String.valueOf(age) + "\n";
    }
}

class PersonSuperComparator implements Comparator<Person>{

    public int compare(Person o1, Person o2) {
        int ret = o1.getName().compareTo(o2.getName());
        if(ret != 0)
            return ret;
        return o1.getAge() - o2.getAge();
    }
}