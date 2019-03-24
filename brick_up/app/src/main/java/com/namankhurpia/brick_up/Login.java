package com.namankhurpia.brick_up;

import android.content.Intent;
import android.media.Image;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextInputLayout email,pass;
    String email_s,mystr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        ImageButton login,signup;


        email=(TextInputLayout) findViewById(R.id.username);
        pass=(TextInputLayout) findViewById(R.id.password);

        mystr = "rahul";

        login=(ImageButton) findViewById(R.id.login);
        signup=(ImageButton)findViewById(R.id.signup);



          login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    email_s=email.getEditText().getText().toString();

                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Login.this, Community.class);
                        startActivity(i);


                }
            });


          signup.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
                  Intent i = new Intent(Login.this, HomeScreen.class);
                  startActivity(i);

              }
          });

    }
}

