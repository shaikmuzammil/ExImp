package com.example.asynctasktext.eximp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        read=(TextView)findViewById(R.id.read);
        String values=getIntent().getStringExtra("key");
        read.setText(values);

    }
}
