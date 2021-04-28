package com.codepath.example.community;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    private String APPLICATION_ID = "X37oGqf5ofljIrr5KYfOQjqg5kchEJUj4sKVMRn6";
    private String CLIENT_KEY = "CopU5Ai7h1bhgS9bm7jCNgL2hzUT9966p0OBlqS5";
    @Override
    public void onCreate() {
        super.onCreate();

        // Connects to the back4app server
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(APPLICATION_ID)
                .clientKey(CLIENT_KEY)
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
