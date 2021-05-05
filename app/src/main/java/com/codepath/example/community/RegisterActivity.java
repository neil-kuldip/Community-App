package com.codepath.example.community;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseUser;

public class RegisterActivity extends AppCompatActivity {

    public static final String TAG = "RegisterActivity";
    public EditText etNewUsername;
    public EditText etNewPassword;
    public EditText etNewEmail;
    public Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNewUsername = findViewById(R.id.etNewUsername);
        etNewPassword = findViewById(R.id.etNewPassword);
        etNewEmail = findViewById(R.id.etNewEmail);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newUsername = etNewUsername.getText().toString();
                String newPassword = etNewPassword.getText().toString();
                String newEmail = etNewEmail.getText().toString();
                createUser(newUsername, newPassword, newEmail);
            }
        });

    }

    public void createUser(String newUsername, String newPassword, String newEmail) {
        ParseUser user = new ParseUser();
        user.setUsername(newUsername);
        user.setPassword(newPassword);
        user.setEmail(newEmail);

        //Sends user to interest page
        //TODO: Create interest page
    }}
