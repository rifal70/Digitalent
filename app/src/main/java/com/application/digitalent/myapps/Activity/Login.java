package com.application.digitalent.myapps.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.application.digitalent.myapps.R;

public class Login extends AppCompatActivity {
Button login,register;
EditText user,pass;
String username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btn_login);
        register = findViewById(R.id.btn_register);
        user = findViewById(R.id.txt_username);
        pass = findViewById(R.id.txt_password);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("user") && pass.getText().toString().equals("pass123")){
                    Intent intent = new Intent(Login.this, Home.class);
                    finish();
                    startActivity(intent);
                }else{
                    android.widget.Toast.makeText(Login.this, "Username or password wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                finish();
                startActivity(intent);
            }
        });


    }




    @Override
    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent setIntent = new Intent(Intent.ACTION_MAIN);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
    }
}
