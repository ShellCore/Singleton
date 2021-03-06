package com.shellcore.android.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = User.getUser();
        user.setName("Cesar");
        Log.d(TAG, "onCreate: User: " + user.toString());
    }
}
