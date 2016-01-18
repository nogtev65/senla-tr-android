package com.kresloeffects.lesson_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultTextView = (TextView)findViewById(R.id.result);
        final EditText firstEditText = (EditText)findViewById(R.id.first_number);
        final EditText secondEditText = (EditText)findViewById(R.id.second_number);
        Button butt = (Button)findViewById(R.id.summ_button);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    sum= Double.valueOf(firstEditText.getText().toString())+ Double.valueOf(secondEditText.getText().toString());
                    resultTextView.setText(String.valueOf(sum));
                } catch (Exception e) {
                    if(firstEditText.getText().toString().equals("") || secondEditText.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Заполните все поля", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Введено недопустимое значение", Toast.LENGTH_SHORT).show();
                    }

                }finally{
                    firstEditText.setText(null);
                    secondEditText.setText(null);
                }

            }
        });
    }
}
