package com.kresloeffects.lesson_06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String login = "nogtev65";
        final String password = "mama1968";

        final EditText editLogin = (EditText)findViewById(R.id.edit_login);
        final EditText editPassword = (EditText)findViewById(R.id.edit_password);

        final Button buttSignIn = (Button)findViewById(R.id.button_sign_in);
        final Button buttSignUp = (Button)findViewById(R.id.button_sign_up);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editLogin.getText().toString().equals("")){
                    editLogin.setError(getString(R.string.empty_login));
                    return;
                }if (editPassword.getText().toString().equals("")){
                    editPassword.setError(getString(R.string.empty_pasword));
                    return;
                }

                switch (view.getId()){
                    case R.id.button_sign_in:
                        if(editLogin.getText().equals(login)){
                            if(editPassword.getText().equals(password)) {
                                Toast.makeText(getApplicationContext(), R.string.signed_in, Toast.LENGTH_SHORT).show();
                            }else{
                                editPassword.setError("Не верный пароль");
                                editPassword.setText(null);
                            }
                        }else{
                            editLogin.setError("Не верный Login");
                            editPassword.setText(null);
                            editPassword.setText(null);
                        }
                        break;
                    case R.id.button_sign_up:
                        Toast.makeText(getApplicationContext(), R.string.signed_up, Toast.LENGTH_SHORT).show();
                        editPassword.setText(null);
                        editPassword.setText(null);
                        break;
                }

            }
        };

        buttSignIn.setOnClickListener(onClickListener);
        buttSignUp.setOnClickListener(onClickListener);
    }
}
