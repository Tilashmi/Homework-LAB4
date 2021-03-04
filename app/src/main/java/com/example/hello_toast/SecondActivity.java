package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        textView =findViewById(R.id.show_Toast);
        textView.setText("Hello!");
        textView2=findViewById(R.id.counting_result);
        String value = intent.getStringExtra("Count");
        textView2.setText(value);

    }
}