package com.kresloeffects.lesson_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class SignUp extends AppCompatActivity {

    private EditText editTextLogIn;
    private EditText editTextPassword;
    private EditText editTextRepeatPassword;
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextMoreInfo;

    private CheckBox checkBox;

    private RadioGroup radioGroup;

    private Button buttonSignUp;
    private Button buttonBack;

    private String empty;
    private String incorect;
    private String less4;
    private String less8;

    private static final String KEY_LOG_IN = "logIn";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_FIRST_NAME = "logIn";
    private static final String KEY_LAST_NAME = "password";
    private static final String KEY_MORE_INFO = "logIn";
    private static final String KEY_SEX = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextLogIn = (EditText) findViewById(R.id.edit_text_log_in);
        editTextPassword = (EditText) findViewById(R.id.edit_text_password);
        editTextRepeatPassword = (EditText)findViewById(R.id.edit_text_repeat_password);
        editTextFirstName = (EditText)findViewById(R.id.edit_text_first_name);
        editTextLastName = (EditText)findViewById(R.id.edit_text_last_name);
        editTextMoreInfo = (EditText)findViewById(R.id.edit_text_more_info);

        checkBox = (CheckBox)findViewById(R.id.check_box_accept);

        radioGroup =(RadioGroup)findViewById(R.id.radio_group);

        buttonSignUp = (Button)findViewById(R.id.button_sign_up);
        buttonBack = (Button)findViewById(R.id.button_back);

        empty = getString(R.string.field_is_empty);
        incorect = getString(R.string.incorrect);
        less4 = getString(R.string.less_then_four);
        less8 = getString(R.string.less_then_eight);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean allCheck = true;

                String logInText;
                String passwordText;
                String repeatPasswordText;
                String firstNameText;
                String lastNameText;
                String moreInfoText;

                logInText = editTextLogIn.getText().toString();
                passwordText = editTextPassword.getText().toString();
                repeatPasswordText = editTextRepeatPassword.getText().toString();
                firstNameText = editTextFirstName.getText().toString();
                lastNameText = editTextLastName.getText().toString();
                moreInfoText = editTextMoreInfo.getText().toString();

                switch (view.getId()){
                    case R.id.button_sign_up:
                        allCheck = true;
                        if(logInText.equals("")){
                            editTextLogIn.setError(empty);
                            allCheck = false;
                        }
                        else{
                            if(logInText.length()<4){
                                editTextLogIn.setError(less4);
                                allCheck = false;
                            }
                        }

                        if(passwordText.equals("")){
                            editTextPassword.setError(empty);
                            allCheck = false;
                        }
                        else{
                            if(passwordText.length()<8){
                                editTextPassword.setError(less8);
                                allCheck = false;
                            }
                        }

                        if(repeatPasswordText.equals("")){
                            editTextRepeatPassword.setError(empty);
                            allCheck = false;
                        }
                        else{
                            if(repeatPasswordText.equals(passwordText)){

                            }
                            else{
                                editTextRepeatPassword.setError(incorect);
                                allCheck = false;
                            }
                        }
                        if(firstNameText.equals("")) {
                            editTextFirstName.setError(empty);
                            allCheck = false;
                        }
                        if(lastNameText.equals("")) {
                            editTextLastName.setError(empty);
                            allCheck = false;
                        }
                        if(allCheck){
                            Intent intent = new Intent(SignUp.this, Info.class)
                                .putExtra(KEY_LOG_IN, logInText)
                                .putExtra(KEY_PASSWORD, passwordText)
                                .putExtra(KEY_FIRST_NAME, firstNameText)
                                .putExtra(KEY_LAST_NAME, lastNameText)
                                .putExtra(KEY_MORE_INFO, moreInfoText);

                            if(radioGroup.getCheckedRadioButtonId()==R.id.man){
                                intent.putExtra(KEY_SEX, getString(R.string.man));
                            }
                            if(radioGroup.getCheckedRadioButtonId()==R.id.woman){
                                intent.putExtra(KEY_SEX, getString(R.string.woman));
                            }
                            if(radioGroup.getCheckedRadioButtonId()==R.id.other){
                                intent.putExtra(KEY_SEX, getString(R.string.other));
                            }

                            startActivity(intent);
                        }
                        break;
                    case R.id.button_back:
                        finish();
                        break;
                    case R.id.check_box_accept:
                        buttonSignUp.setEnabled(checkBox.isChecked());
                }

            }
        };
        buttonSignUp.setOnClickListener(onClickListener);
        checkBox.setOnClickListener(onClickListener);
        buttonBack.setOnClickListener(onClickListener);

    }
}
