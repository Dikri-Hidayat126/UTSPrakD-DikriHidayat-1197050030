package com.example.utsprakd_dikrihidayat_1197050030;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        TextView usernameTV = findViewById(R.id.username_text);
        TextView passwordTV = findViewById(R.id.password_text);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        Log.d("print", "Username = " + username + " dan Password = " + password);
        Log.d("print", String.valueOf(username.equals("dikrihidayat")));
        Log.d("print", String.valueOf(password.equals("1197050030")));
        if (username.equals("dikrihidayat") && password.equals("1197050030")) {
            Log.d("success", "Sukses Login");
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Log.d("failed", "Gagal login");

            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}