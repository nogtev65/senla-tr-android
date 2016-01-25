package com.kresloeffects.lesson_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String logIn = getIntent().getStringExtra("logIn");
        String password = getIntent().getStringExtra("password");
        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");
        String sex = getIntent().getStringExtra("sex");
        String moreInfo = getIntent().getStringExtra("moreInfo");

        TextView textViewLogIn = (TextView)findViewById(R.id.log_in);
        TextView textViewPassword = (TextView)findViewById(R.id.password);
        TextView textViewFirstName = (TextView)findViewById(R.id.first_name);
        TextView textViewLastName = (TextView)findViewById(R.id.last_name);
        TextView textViewSex = (TextView)findViewById(R.id.sex);
        TextView textViewMoreInfo = (TextView)findViewById(R.id.more_info);

        Button buttonBack = (Button)findViewById(R.id.button_back);

        if(logIn!=null) {
            textViewLogIn.setText(getString(R.string.login) + ": " + logIn);
        }
        if(password!=null) {
            textViewPassword.setText(getString(R.string.password) + ": " + password);
        }
        if(firstName!=null) {
            textViewFirstName.setText(getString(R.string.firs_name) + ": " + firstName);
        }
        if(lastName!=null) {
            textViewLastName.setText(getString(R.string.last_name) + ": " + lastName);
        }
        if(sex!=null) {
            textViewSex.setText(getString(R.string.sex) + ": " + sex);
        }
        if(moreInfo!=null && moreInfo.equals("")){
            textViewMoreInfo.setText(getString(R.string.additional_information)+": "+moreInfo);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
        buttonBack.setOnClickListener(onClickListener);

    }
}
