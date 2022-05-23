package HomeWorks.ClassesAndObjects;

import org.testng.annotations.Test;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("Person move");
    }

    public void talk() {
        System.out.println("Person talk");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Test
    public void newPersons() {
        Person person1 = new Person();
        person1.fullName = "Adam";
        person1.age = 20;

        Person person2 = new Person("Eve", 19);

    }

}
