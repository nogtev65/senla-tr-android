package com.kresloeffects.lesson_07;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        final String login = "nogtev65";
        final String password = "21011994";

        final EditText editTextLogIn = (EditText)findViewById(R.id.edit_text_log_in);
        final EditText editTextPassword = (EditText)findViewById(R.id.edit_text_password);
        final Button buttonSignIn = (Button)findViewById(R.id.button_sign_in);
        final Button buttonBack = (Button)findViewById(R.id.button_back);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 switch (view.getId()){
                     case R.id.button_sign_in:
                         if(editTextLogIn.getText().toString().equals(login)){
                             if(editTextPassword.getText().toString().equals(password)){
                                 Intent intent = new Intent(SignIn.this, Info.class);
                                 intent.putExtra("logIn", editTextLogIn.getText().toString());
                                 intent.putExtra("password", editTextPassword.getText().toString());
                                 startActivity(intent);
                             }
                             else{
                                 if(editTextPassword.getText().toString().equals("")){
                                     editTextPassword.setError(getString(R.string.field_is_empty));
                                 }
                                 else{
                                     editTextPassword.setError(getString(R.string.incorrect));
                                 }
                             }
                         }
                         else {
                             if(editTextLogIn.getText().toString().equals("")){
                                 editTextLogIn.setError(getString(R.string.field_is_empty));
                             }
                             else{
                                 editTextLogIn.setError(getString(R.string.incorrect));
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
