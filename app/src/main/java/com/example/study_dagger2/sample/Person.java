package com.example.study_dagger2.sample;

public class Person {

    Driveable driveable;

    Person(Driveable driveable){
        this.driveable = driveable;
    }

    public void goToPlay(){
        System.out.println("出门玩耍：" + driveable.drive());
    }

    public static void main(String[] args) {
        Person person = new Person(new Bike());
        //Person person = new Person(new Car());
        //Person person = new Person(new Train());
        person.goToPlay();
    }
}
