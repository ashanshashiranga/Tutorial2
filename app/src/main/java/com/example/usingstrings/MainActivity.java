package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         TextView txtView2 = findViewById(R.id.textView2);
         txtView2.setText(R.string.Msg2);



        Log.i("Lifecycle", "OnCreate() invoked");

    }

    @Override
    public void onStart() {

        super.onStart();
        Log.i("Lifecycle", "OnStart() invoked");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "OnRestart() invoked");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle", "OnResume() invoked");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i("Lifecycle", "onPause() invoked");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.i("Lifecycle", "onStop() invoked");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("Lifecycle", "onDestroy() invoked");
    }




}