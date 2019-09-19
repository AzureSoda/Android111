package com.example.android111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.v(TAG,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"Resume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG,"OnPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG,"OnStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG,"OnDestroy()");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this,"봙mmmmmmmmmm봙!", Toast.LENGTH_LONG).show();
    }

}


