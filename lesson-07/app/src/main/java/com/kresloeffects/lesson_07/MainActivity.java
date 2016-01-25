package com.kresloeffects.lesson_07;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button signIn = (Button)findViewById(R.id.sign_in);
        final Button signUp = (Button)findViewById(R.id.sign_up);
        final Button about = (Button)findViewById(R.id.about);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.sign_in:
                        Intent intent = new Intent(MainActivity.this, SignIn.class);
                        startActivity(intent);
                        break;
                    case R.id.sign_up:
                        Intent intent1 = new Intent(MainActivity.this, SignUp.class);
                        startActivity(intent1);
                        break;
                    case R.id.about:
                        Uri uri = Uri.parse("http://developer.android.com/intl/ru/index.html");
                        Intent openUrl = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(openUrl);
                        break;
                }
            }
        };
        signIn.setOnClickListener(onClickListener);
        signUp.setOnClickListener(onClickListener);
        about.setOnClickListener(onClickListener);
    }
}
