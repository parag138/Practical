package com.example.tushar.spinnerimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView i1;
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (Spinner) findViewById(R.id.spin);
        i1 = (ImageView) findViewById(R.id.image);
        s.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i)
        {
            case 0 : i1.setImageResource(R.drawable.pic1);
                    break;
            case 1 : i1.setImageResource(R.drawable.pic2);
                break;
            case 2 : i1.setImageResource(R.drawable.pic3);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
