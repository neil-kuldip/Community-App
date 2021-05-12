package com.codepath.example.community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseUser;

public class RegisterActivity extends AppCompatActivity {

    public static final String TAG = "RegisterActivity";
    private EditText etNewUsername;
    private EditText etNewPassword;
    private EditText etNewEmail;
    private Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNewUsername = findViewById(R.id.etNewUsername);
        etNewPassword = findViewById(R.id.etNewPassword);
        etNewEmail = findViewById(R.id.etNewEmail);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
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
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in,R.anim.slide_out_left);
    }
}
