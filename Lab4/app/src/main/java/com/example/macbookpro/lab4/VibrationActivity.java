package com.example.macbookpro.lab4;

import android.content.Intent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;
import android.view.View;

public class VibrationActivity extends AppCompatActivity {

    Button Vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        Vibrate = (Button) findViewById(R.id.button);


        Vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long pattern[]={0,200,100,300,400};
                Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(pattern, -1);
            }
        });
    }
}
