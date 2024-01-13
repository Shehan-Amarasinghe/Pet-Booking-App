package com.example.pet_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        CardView exit = findViewById(R.id.cardCatExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CatActivity.this,HomeActivity.class));
            }
        });

        CardView exoticshorthair = findViewById(R.id.cardexoticshorthair);
        exoticshorthair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CatActivity.this,CatDetailsActivity.class);
                it.putExtra("title","exoticshorthair");
                startActivity(it);
            }
        });

        CardView siamese = findViewById(R.id.cardsiamese);
        siamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CatActivity.this,CatDetailsActivity.class);
                it.putExtra("title","siamese");
                startActivity(it);
            }
        });

        CardView british = findViewById(R.id.cardbritish);
        british.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CatActivity.this,CatDetailsActivity.class);
                it.putExtra("title","british");
                startActivity(it);
            }
        });

        CardView birman = findViewById(R.id.cardbirman);
        birman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CatActivity.this,CatDetailsActivity.class);
                it.putExtra("title","birman");
                startActivity(it);
            }
        });

        CardView persian = findViewById(R.id.cardpersian);
        persian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CatActivity.this,CatDetailsActivity.class);
                it.putExtra("title","persian");
                startActivity(it);
            }
        });
    }
}