package com.kresloeffects.lesson04;

import java.util.ArrayList;
/**
 * Created by nogte on 18.01.2016.
 */
public class Departmant {
    private String name;
    private ArrayList<Departmant> childDepartmant = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();

    public Departmant(String name){
        this.name=name;
    }
    protected void addChildDepartmant(Departmant childDep){
        childDepartmant.add(childDep);
    }
    protected void addPerson(String firstName, String lastName, int age, int cash){
        persons.add(new Person(firstName,lastName,age,cash));
    }
    protected String getNameDepartmant(){
        return this.name;
    }
    protected ArrayList<Departmant> getChildDepartmant(){
        return childDepartmant;
    }
    protected ArrayList<Person> getPersons(){
        return persons;
    }
}
