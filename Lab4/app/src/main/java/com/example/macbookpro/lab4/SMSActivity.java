package com.example.macbookpro.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.telephony.SmsManager;
import android.view.View;

public class SMSActivity extends AppCompatActivity {

    EditText number;
    EditText text;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        send = findViewById(R.id.button4);
        number = findViewById(R.id.editText);
        text = findViewById(R.id.editText2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();

                smsManager.sendTextMessage(number.getText().toString(), null, text.getText().toString(), null, null);
            }
        });
    }
}
