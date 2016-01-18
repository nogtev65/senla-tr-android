package com.kresloeffects.lesson_041;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateAndSelect();
        generateSumm();
        generateAndSummNumbers();
    }

    void generateAndSelect(){
        Random rnd = new Random();
        int random = rnd.nextInt(899)+100;
        int array[]= new int[3];
        int max=0;
        array[2]=random%10;
        array[1] = (random/10)%10;
        array[0]=random/100;

        for(int i: array){
            if(i>max){
                max=i;
            }
        }
        android.util.Log.e("Tag", String.valueOf(max));
        android.util.Log.e("Tag", String.valueOf(random));
    }
    void generateSumm(){
        int array[]= new int[3];
        Random rnd = new Random();
        for(int i: array){
            i = rnd.nextInt(899)+100;
            android.util.Log.e("Number", String.valueOf(i));
        }
        int summ=0;
        for(int j: array){
            summ +=j/100;
        }
        android.util.Log.e("Summ", String.valueOf(summ));
    }
    void generateAndSummNumbers(){
        Random rnd = new Random();
        int random = rnd.nextInt(899)+100;
        int array[]= new int[3];
        int summ=0;
        array[2]=random%10;
        array[1] = (random/10)%10;
        array[0]=random/100;

        for(int i: array){
            summ+=i;
        }
        android.util.Log.e("Tag", String.valueOf(summ));
        android.util.Log.e("Tag", String.valueOf(random));
    }
}
