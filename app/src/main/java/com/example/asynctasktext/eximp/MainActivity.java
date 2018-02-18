package com.example.asynctasktext.eximp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        ed3=(EditText)findViewById(R.id.ed3);
    }

    public void send(View view) {
        String value=ed1.getText().toString();
         Intent in=new Intent(MainActivity.this,Main2Activity.class);
        in.putExtra("key",value);
        startActivity(in);
    }

    public void link(View view) {
        String links=ed2.getText().toString();
        Uri uri=Uri.parse("https://" + links);
        Intent i= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

    public void dial(View view) {
        String no=ed3.getText().toString();
        Uri uri=Uri.parse("tel:"+no);
        Intent in=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(in);
    }
}




