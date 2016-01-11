package com.example.vit.lesson_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Извините, что работа сделана не до конца, просто возникли проблемы с реализацией наследования(пониманием реализации).
 */

class GameManager
{
    Grid grid = new Grid();
}

class Grid
{
    int Horizontal;
    int Vertical;
    Cell cells[][] = new Cell[Horizontal][Vertical];
}

class Cell extends Grid
{
    Vector2 position = new Vector2();
    int CellState;
    boolean mined;
    boolean OpenNear;
    int BombsNear;

    //Code

    void SetNextState()
    {

    }
    void OpenNearCells()
    {

    }
    void ShowBombsNear()
    {

    }
}

class Vector2
{
    int PosX;
    int posY;
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Greeting Gre = new Greeting();
        Gre.sayHello();
    }
}

class Greeting
{
    void sayHello()
    {
        android.util.Log.e("Tag","Hello World");
    }
}
