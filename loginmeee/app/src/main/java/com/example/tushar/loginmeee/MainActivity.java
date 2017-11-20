package com.example.tushar.loginmeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;
    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText3);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String s1, s2;
        s1 = e1.getText().toString();
        s2= e2.getText().toString();

        if(!s1.equals("")&& !s2.equals(""))
        {
            Intent i1 = new Intent(this,LoginPage.class);
            startActivity(i1);
        }

        else
        {
            Toast.makeText(this,"Invalid username or password",Toast.LENGTH_LONG).show();
        }

    }
}
