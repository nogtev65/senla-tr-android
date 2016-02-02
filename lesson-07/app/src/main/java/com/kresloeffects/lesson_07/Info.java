package com.kresloeffects.lesson_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    private TextView textViewLogIn;
    private TextView textViewPassword;
    private TextView textViewFirstName;
    private TextView textViewLastName;
    private TextView textViewSex;
    private TextView textViewMoreInfo;

    private String logInText;
    private String passwordText;
    private String firstNameText;
    private String lastNameText;
    private String moreInfoText;
    private String sexText;


    private static final String KEY_LOG_IN = "logIn";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_FIRST_NAME = "logIn";
    private static final String KEY_LAST_NAME = "password";
    private static final String KEY_MORE_INFO = "logIn";
    private static final String KEY_SEX = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String logIn = getIntent().getStringExtra(KEY_LOG_IN);
        String password = getIntent().getStringExtra(KEY_PASSWORD);
        String firstName = getIntent().getStringExtra(KEY_FIRST_NAME);
        String lastName = getIntent().getStringExtra(KEY_LAST_NAME);
        String sex = getIntent().getStringExtra(KEY_SEX);
        String moreInfo = getIntent().getStringExtra(KEY_MORE_INFO);

        TextView textViewLogIn = (TextView)findViewById(R.id.log_in);
        TextView textViewPassword = (TextView)findViewById(R.id.password);
        TextView textViewFirstName = (TextView)findViewById(R.id.first_name);
        TextView textViewLastName = (TextView)findViewById(R.id.last_name);
        TextView textViewSex = (TextView)findViewById(R.id.sex);
        TextView textViewMoreInfo = (TextView)findViewById(R.id.more_info);

        logInText = getString(R.string.login);
        passwordText = getString(R.string.password);
        firstNameText = getString(R.string.firs_name);
        lastNameText = getString(R.string.last_name);
        moreInfoText= getString(R.string.additional_information);
        sexText = getString(R.string.sex);

        Button buttonBack = (Button)findViewById(R.id.button_back);

        if(logIn!=null) {
            textViewLogIn.setText(logInText + ": " + logIn);
        }
        if(password!=null) {
            textViewPassword.setText(passwordText + ": " + password);
        }
        if(firstName!=null) {
            textViewFirstName.setText(firstNameText + ": " + firstName);
        }
        if(lastName!=null) {
            textViewLastName.setText(lastNameText + ": " + lastName);
        }
        if(sex!=null) {
            textViewSex.setText(sexText + ": " + sex);
        }
        if(moreInfo!=null && moreInfo.equals("")){
            textViewMoreInfo.setText(moreInfoText+": "+moreInfo);
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
