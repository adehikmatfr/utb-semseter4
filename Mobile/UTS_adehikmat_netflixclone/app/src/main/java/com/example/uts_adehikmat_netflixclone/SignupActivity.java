package com.example.uts_adehikmat_netflixclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final EditText editTextName = findViewById(R.id.name);
        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button signUpButton = findViewById(R.id.buttonSignUp);
        final TextView textViewSignUp = findViewById(R.id.textViewSignUp);

        signUpButton.setOnClickListener(view -> {
            Log.d("SigningActivity", "Sign up clicked!");
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            String name = editTextName.getText().toString().trim();

            if (!email.equals("") && !password.equals("") && !name.equals("")) {
                showToast("Signup Successful");
                Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            } else {
                showToast("Invalid Email or Password or Name");
            }
        });

        textViewSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(SignupActivity.this, SigningActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private void showToast(String message) {
        Toast.makeText(SignupActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}