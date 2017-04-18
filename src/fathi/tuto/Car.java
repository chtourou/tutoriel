package fathi.tuto;

public class Car {


    public String color;
    public String marque;

    public Car(String cl, String mq) {
        this.color = cl;
        this.marque = mq;
    }

    public static void main(String[] args) {
        Car MyCar = new Car("White", "Peugeot Expert");


        System.out.println("the marque of car:" + MyCar.marque);
        System.out.println("the color of car:" + MyCar.color);


    }


}

