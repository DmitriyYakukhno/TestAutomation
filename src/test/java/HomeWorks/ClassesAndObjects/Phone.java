package HomeWorks.ClassesAndObjects;

import org.jetbrains.annotations.NotNull;

public class Phone {
    long number;
    String model;
    double weight;

    public void receiveCall(String name){
        System.out.println("Calls " + name);
    }

    public void getNumber(@NotNull Phone name){
        System.out.println(name.number);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "Nokia";
        phone1.number = 1990002131L;
        phone1.weight = 150.5;

        Phone phone2 = new Phone();
        phone2.model = "Samsung";
        phone2.number = 2990002131L;
        phone2.weight = 140.0;

        Phone phone3 = new Phone();
        phone3.model = "Asus";
        phone3.number = 3990002131L;
        phone3.weight = 130.2;

        System.out.println("HomeWorks.ClassesAndObjects.Phone " + phone1.model + ", weight " + phone1.weight + "g, number " + phone1.number);
        System.out.println("HomeWorks.ClassesAndObjects.Phone " + phone2.model + ", weight " + phone2.weight + "g, number " + phone2.number);
        System.out.println("HomeWorks.ClassesAndObjects.Phone " + phone3.model + ", weight " + phone3.weight + "g, number " + phone3.number + "\n");

        phone1.receiveCall("Mike");
        phone2.receiveCall("Nick");
        phone3.receiveCall("Julia\n");

        phone1.getNumber(phone1);
        phone2.getNumber(phone2);
        phone3.getNumber(phone3);

    }

    public Phone(long number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){};

}

