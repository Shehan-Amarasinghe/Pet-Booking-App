package com.example.pet_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        CardView exit = findViewById(R.id.cardDGExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DogActivity.this,HomeActivity.class));
            }
        });

        CardView Labrador = findViewById(R.id.cardLabrador);
        Labrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent it = new Intent(DogActivity.this,DogDetailsActivity.class);
               it.putExtra("title","Labrador");
               startActivity(it);
            }
        });

        CardView germenshephred = findViewById(R.id.cardGermansherpherd);
        germenshephred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DogActivity.this,DogDetailsActivity.class);
                it.putExtra("title","Germen Sherpherd");
                startActivity(it);
            }
        });

        CardView goldenretriever = findViewById(R.id.cardGoldenretriever);
        goldenretriever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DogActivity.this,DogDetailsActivity.class);
                it.putExtra("title","Golden retriever");
                startActivity(it);
            }
        });

        CardView Rottweiler = findViewById(R.id.cardRottweiler);
        Rottweiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DogActivity.this,DogDetailsActivity.class);
                it.putExtra("title","Rottweiler");
                startActivity(it);
            }
        });

        CardView Husky = findViewById(R.id.cardHusky);
        Husky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DogActivity.this,DogDetailsActivity.class);
                it.putExtra("title","Husky");
                startActivity(it);
            }
        });
    }
}