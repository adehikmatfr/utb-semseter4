package com.example.uts_adehikmat_netflixclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SigningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button signInButton = findViewById(R.id.buttonSignIn);
        final TextView textViewSignUp = findViewById(R.id.textViewSignUp);

        signInButton.setOnClickListener(view -> {
            Log.d("SigningActivity", "Sign in clicked!");
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            if (email.equals("ade@gmail.com") && password.equals("password123")) {
                showToast("Login Successful");
                Intent intent = new Intent(SigningActivity.this, HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            } else {
                showToast("Invalid Email or Password");
            }
        });

        textViewSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(SigningActivity.this, SignupActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private void showToast(String message) {
        Toast.makeText(SigningActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}