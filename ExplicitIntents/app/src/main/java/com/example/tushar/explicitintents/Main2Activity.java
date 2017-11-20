package com.example.tushar.explicitintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt = (TextView) findViewById(R.id.textView2);
        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("user");
        txt.setText(s1);
    }
}
