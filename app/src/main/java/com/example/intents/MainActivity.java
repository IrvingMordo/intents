package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnNext;
    private EditText txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext=findViewById(R.id.btn_next);
        txtMessage=findViewById(R.id.txt_message);
        btnNext.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Bundle parametros = new Bundle();
                parametros.putString("message", txtMessage.getText().toString());
                Intent intent = new Intent(MainActivity.this, second.class);
                intent.putExtras(parametros);
                startActivity(intent);
            }
        });
    }
}