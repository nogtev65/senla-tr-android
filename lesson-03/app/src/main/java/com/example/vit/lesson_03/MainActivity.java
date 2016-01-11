package com.example.vit.lesson_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.e("TAG", "FizzBuzz");
        FizzBuzz();
        android.util.Log.e("TAG", "FizzBuzzWoof");
        FizzBuzzWoof();
        android.util.Log.e("TAG", "Multiples of 3 and 5");
        Multiples();
    }

    void FizzBuzz()

    {
        for(int i = 1; i<=100; i++)
        {
           if(i%3==0 && i%5!=0)
           {
               android.util.Log.e("TAG", "Fizz");
           }

            else if(i%5==0 && i%3!=0)
            {
                android.util.Log.e("TAG", "Buzz");
            }

            else if (i%5==0 && i%3==0)
           {
               android.util.Log.e("TAG", "FizzBuzz");
           }
            else
           {
               android.util.Log.e("TAG", String.valueOf(i));
           }
        }
    }

    void FizzBuzzWoof()
    {
        for(int i = 1; i<=100; i++)
        {
            if(i%3==0 && i%5!=0 && i%7!=0)
            {
                android.util.Log.e("TAG", "Fizz");
            }

            else if(i%3!=0 && i%5==0 && i%7!=0)
            {
                android.util.Log.e("TAG", "Buzz");
            }
            else if(i%3!=0 && i%5!=0 && i%7==0)
            {
                android.util.Log.e("TAG", "Woof");
            }

            else if (i%3==0 && i%5==0 && i%7!=0)
            {
                android.util.Log.e("TAG", "FizzBuzz");
            }
            else if (i%3==0 && i%5!=0 && i%7==0)
            {
                android.util.Log.e("TAG", "FizzWoof");
            }
            else if (i%3!=0 && i%5==0 && i%7==0)
            {
                android.util.Log.e("TAG", "BuzzWoof");
            }
            else if (i%3==0 && i%5==0 && i%7==0)
            {
                android.util.Log.e("TAG", "FizzBuzzWoof");
            }
            else
            {
                android.util.Log.e("TAG", String.valueOf(i));
            }
        }
    }

    void Multiples()
    {
        int Sum = 0;
        for(int i = 1; i<=1000; i++)
        {
            if(i%3==0 || i%5==0)
            {
                Sum = Sum + i;
            }
        }
        android.util.Log.e("TAG", "Sum = " + String.valueOf(Sum));
    }
}
