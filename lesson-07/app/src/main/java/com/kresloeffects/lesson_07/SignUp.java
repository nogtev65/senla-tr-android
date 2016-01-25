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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText editTextLogIn = (EditText) findViewById(R.id.edit_text_log_in);
        final EditText editTextPassword = (EditText) findViewById(R.id.edit_text_password);
        final EditText editTextRepeatPassword = (EditText)findViewById(R.id.edit_text_repeat_password);
        final EditText editTextFirstName = (EditText)findViewById(R.id.edit_text_first_name);
        final EditText editTextLastName = (EditText)findViewById(R.id.edit_text_last_name);
        final EditText editTextMoreInfo = (EditText)findViewById(R.id.edit_text_more_info);

        final CheckBox checkBox = (CheckBox)findViewById(R.id.check_box_accept);

        final RadioGroup radioGroup =(RadioGroup)findViewById(R.id.radio_group);

        final Button buttonSignUp = (Button)findViewById(R.id.button_sign_up);
        final Button buttonBack = (Button)findViewById(R.id.button_back);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean allCheck = true;

                switch (view.getId()){
                    case R.id.button_sign_up:
                        allCheck = true;
                        if(editTextLogIn.getText().toString().equals("")){
                            editTextLogIn.setError(getString(R.string.field_is_empty));
                            allCheck = false;
                        }
                        else{
                            if(editTextLogIn.getText().toString().length()<4){
                                editTextLogIn.setError(getString(R.string.less_then_four));
                                allCheck = false;
                            }
                        }

                        if(editTextPassword.getText().toString().equals("")){
                            editTextPassword.setError(getString(R.string.field_is_empty));
                            allCheck = false;
                        }
                        else{
                            if(editTextPassword.getText().toString().length()<8){
                                editTextPassword.setError(getString(R.string.less_then_eight));
                                allCheck = false;
                            }
                        }

                        if(editTextRepeatPassword.getText().toString().equals("")){
                            editTextRepeatPassword.setError(getString(R.string.field_is_empty));
                            allCheck = false;
                        }
                        else{
                            if(editTextRepeatPassword.getText().toString().equals(editTextPassword.getText().toString())){

                            }
                            else{
                                editTextRepeatPassword.setError(getString(R.string.incorrect));
                                allCheck = false;
                            }
                        }
                        if(editTextFirstName.getText().toString().equals("")) {
                            editTextFirstName.setError(getString(R.string.field_is_empty));
                            allCheck = false;
                        }
                        if(editTextLastName.getText().toString().equals("")) {
                            editTextLastName.setError(getString(R.string.field_is_empty));
                            allCheck = false;
                        }
                        if(allCheck){
                            Intent intent = new Intent(SignUp.this, Info.class);
                            intent.putExtra("logIn", editTextLogIn.getText().toString());
                            intent.putExtra("password", editTextPassword.getText().toString());
                            intent.putExtra("firstName", editTextFirstName.getText().toString());
                            intent.putExtra("lastName", editTextLastName.getText().toString());
                            intent.putExtra("moreInfo", editTextMoreInfo.getText().toString());

                            if(radioGroup.getCheckedRadioButtonId()==R.id.man){
                                intent.putExtra("sex", getString(R.string.man));
                            }
                            if(radioGroup.getCheckedRadioButtonId()==R.id.woman){
                                intent.putExtra("sex", getString(R.string.woman));
                            }
                            if(radioGroup.getCheckedRadioButtonId()==R.id.other){
                                intent.putExtra("sex", getString(R.string.other));
                            }

                            startActivity(intent);
                        }
                        break;
                    case R.id.button_back:
                        finish();
                        break;
                    case R.id.check_box_accept:
                        if(checkBox.isChecked()){
                            buttonSignUp.setEnabled(true);
                        }
                        else{
                            buttonSignUp.setEnabled(false);
                        }
                }

            }
        };
        buttonSignUp.setOnClickListener(onClickListener);
        checkBox.setOnClickListener(onClickListener);
        buttonBack.setOnClickListener(onClickListener);

    }
}
