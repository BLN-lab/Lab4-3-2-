package com.example.lab_43_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] imgi={R.drawable.ct1,R.drawable.ct2,R.drawable.ct3,R.drawable.ct4,R.drawable.ct5};
    String[] imgn={"City-1", "City-2", "City-3", "City-4", "City-5"};
    ArrayAdapter adapter;
    Spinner sp;
    Button btn;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.Select);
        btn = findViewById(R.id.btn);
        im = findViewById(R.id.img);
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,imgn);
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=sp.getSelectedItemPosition();
                im.setImageResource(imgi[n]);
            }
        });
    }
}