package com.ezzouyn.soukaina.ftthapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name, passwd,email;
    Button signup, logme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.name);
        passwd = findViewById(R.id.password);
        email = findViewById(R.id.email);
        signup = findViewById(R.id.btnRegister);
        logme = findViewById(R.id.btnLinkToLoginScreen);
    }

   public void saveInfo(View view ){
       SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
       SharedPreferences.Editor editor = sharedPref.edit();
       editor.putString("username",name.getText().toString());
       editor.putString("password",passwd.getText().toString());
       editor.putString("useremail",email.getText().toString());
       editor.apply();

   }
   private void register(View view){

   }


}
