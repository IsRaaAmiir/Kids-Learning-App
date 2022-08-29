package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class clothesactivity extends AppCompatActivity {
    ImageButton imagebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothesactivity);


        setTitle("Clothes");

        imagebutton = findViewById(R.id.shirt);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this , R.raw.shirt);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        imagebutton = findViewById(R.id.vest);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this , R.raw.vest);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });


        imagebutton = findViewById(R.id.dress);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.dress);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });

        imagebutton = findViewById(R.id.jacket);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this , R.raw.jacket);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });

        imagebutton = findViewById(R.id.jeans);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this , R.raw.jeans);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });


        imagebutton = findViewById(R.id.skirt);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this , R.raw.skirt);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer8.start();
            }
        });

        imagebutton = findViewById(R.id.suit);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.suit);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer9.start();
            }
        });


        imagebutton = findViewById(R.id.shoes);
        MediaPlayer mediaPlayer0 = MediaPlayer.create(this , R.raw.shoes);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer0.start();
            }
        });

        imagebutton = findViewById(R.id.pants);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this , R.raw.pants);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer6.start();
            }
        });


        imagebutton = findViewById(R.id.sneakers);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.sneakers);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer11.start();
            }
        });
        imagebutton = findViewById(R.id.shorts);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this , R.raw.shorts);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer7.start();
            }
        });


    }
}