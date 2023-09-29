package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
    private TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvMessage=findViewById(R.id.tv_message);
        Bundle parametrosReceived=this.getIntent().getExtras();
        String message=parametrosReceived.getString("message");
        tvMessage.setText(message);
    }
}

