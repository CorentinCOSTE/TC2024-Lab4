package com.example.macbookpro.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Vibration_Activity;
    Button Proximity_Activity;
    Button SMS_Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibration_Activity = (Button) findViewById(R.id.button2);
        Proximity_Activity = (Button) findViewById(R.id.button3);
        SMS_Activity = (Button) findViewById(R.id.button);

        Vibration_Activity.setOnClickListener(this);
        Proximity_Activity.setOnClickListener(this);
        SMS_Activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button2:
                intent = new Intent(this, VibrationActivity.class);
                startActivity(intent);
                break;

            case R.id.button3:
                intent = new Intent(this, ProximityActivity.class);
                startActivity(intent);
                break;

            case R.id.button:
                intent = new Intent(this, SMSActivity.class);
                startActivity(intent);
        }
    }
}
