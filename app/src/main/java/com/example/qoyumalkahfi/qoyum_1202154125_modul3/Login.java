package com.example.qoyumalkahfi.qoyum_1202154125_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);
    }

    public void masuk(View view) {
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        if(usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
            Toast.makeText(getApplicationContext(), "Anda Berhasil Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        } else if(usernameKey.equals("admin") && passwordKey.equals("123")){
            Toast.makeText(getApplicationContext(), "Anda Login Sebagai Admin", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("Anda Tidak Bisa Login").setNegativeButton("OK", null).create().show();
        }

        username.setText("");
        password.setText("");
    }
}
