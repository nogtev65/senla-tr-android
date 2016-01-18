package com.kresloeffects.lesson04;

import android.util.Log;

/**
 * Created by nogte on 18.01.2016.
 */
public class Calculations {
    private Tree tree;

    public Calculations(){
        this.tree = new Tree();
    }

    protected void getPersonList(){
        for(Person person: tree.getRoot().getPersons()){
            Log.e("", tree.getRoot().getNameDepartmant() + person.getFullName());
        }
    }
}
