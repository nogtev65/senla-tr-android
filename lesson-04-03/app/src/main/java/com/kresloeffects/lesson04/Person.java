package com.kresloeffects.lesson04;

/**
 * Created by nogte on 18.01.2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int cashInMounth;

    public Person(String firstName, String lastName,int age, int cashInMounth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cashInMounth = cashInMounth;
    }

    protected String getFullName(){
        return firstName + " " + lastName;
    }
    protected int getAge(){
        return age;
    }
    protected int getCashInMounth(){
        return cashInMounth;
    }

}
