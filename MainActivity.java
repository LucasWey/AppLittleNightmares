package com.example.littlenight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button hist;
    private Button map;
    private Button perso;
    private ImageButton secret;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hist = findViewById(R.id.btnhist);

        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, hist.class);
                startActivity(intent);

            }
        });

        map = findViewById(R.id.btnmap);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, map.class);
                startActivity(intent);

            }
        });

        perso = findViewById(R.id.btnperso);

        perso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, perso.class);
                startActivity(intent);

            }
        });

        secret = findViewById(R.id.imageButton2);

        secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, secret.class);
                startActivity(intent);

            }
        });

    }

};