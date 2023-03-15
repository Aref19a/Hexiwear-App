package com.example.hexiwear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class Bank1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank1);

        ProgressBar simpleProgressBar=(ProgressBar) findViewById(R.id.progressBar2); // initiate the progress bar
        simpleProgressBar.setMax(100); // 100 maximum value for the progress value
        simpleProgressBar.setProgress(50); // 50 default progress value for the progress bar
    }

}