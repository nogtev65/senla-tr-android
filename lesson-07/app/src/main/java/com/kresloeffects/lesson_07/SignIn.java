package com.kresloeffects.lesson_07;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    private EditText editTextLogIn;
    private EditText editTextPassword;
    private Button buttonSignIn;
    private Button buttonBack;

    private String empty;
    private String incorect;

    private static final String KEY_LOG_IN = "logIn";
    private static final String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        editTextLogIn = (EditText)findViewById(R.id.edit_text_log_in);
        editTextPassword = (EditText)findViewById(R.id.edit_text_password);
        buttonSignIn = (Button)findViewById(R.id.button_sign_in);
        buttonBack = (Button)findViewById(R.id.button_back);

        empty = getString(R.string.field_is_empty);
        incorect = getString(R.string.incorrect);

        final String login = "nogtev65";
        final String password = "21011994";

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 switch (view.getId()){
                     case R.id.button_sign_in:
                         if(editTextLogIn.getText().toString().equals(login)){
                             if(editTextPassword.getText().toString().equals(password)){
                                 Intent intent = new Intent(SignIn.this, Info.class)
                                    .putExtra(KEY_LOG_IN, editTextLogIn.getText().toString())
                                    .putExtra(KEY_PASSWORD, editTextPassword.getText().toString());
                                 startActivity(intent);
                             }
                             else{
                                 if(editTextPassword.getText().toString().equals("")){
                                     editTextPassword.setError(empty);
                                 }
                                 else{
                                     editTextPassword.setError(incorect);
                                 }
                             }
                         }
                         else {
                             if(editTextLogIn.getText().toString().equals("")){
                                 editTextLogIn.setError(empty);
                             }
                             else{
                                 editTextLogIn.setError(incorect);
                             }
                         }
                         break;
                     case R.id.button_back:
                         finish();
                         break;
                 }
            }
        };
        buttonSignIn.setOnClickListener(onClickListener);
        buttonBack.setOnClickListener(onClickListener);
    }
}
