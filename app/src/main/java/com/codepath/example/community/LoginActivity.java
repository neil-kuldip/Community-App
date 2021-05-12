package com.codepath.example.community;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity {

    public static final  String TAG = "LoginActivity";
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        // 3 Things in the LoginActivity: username and password text box and login button
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                loginUser(username, password);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick register button");
                //TODO: Make interest page
                //TODO: Complete register page
                gotoRegister();
            }
        });
    }

    private void gotoRegister() {
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in,R.anim.slide_out_left);
        // Closes login activity after login succeeded
        // After registration complete, takes new user to MainActivity
        finish();
    }

    private void loginUser(String username, String password) {
        Log.i(TAG, "Attempting to login user " + username);

        //Executes the login in the background thread than the main or UI thread
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                // If the request succeeded, exception should be null
                if (e != null) {
                    Log.e(TAG, username + " failed to login in! ", e);
                    Toast.makeText(LoginActivity.this, "Issue with login! ", Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.i(TAG, username + " successfully logged in!");
                Toast.makeText(LoginActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                goMainActivity();
            }
        });
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoom_in, R.anim.slide_up);
        // Closes login activity after login succeeded
        finish();
    }
}