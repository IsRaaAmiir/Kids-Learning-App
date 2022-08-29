package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fruitsactivity extends AppCompatActivity {
    ImageButton imagebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsactivity);
        setTitle("Fruits");

        imagebutton = findViewById(R.id.apple);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this , R.raw.apple);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        imagebutton = findViewById(R.id.avocado);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this , R.raw.avocado);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });

        imagebutton = findViewById(R.id.mango);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this , R.raw.mango);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });

        imagebutton = findViewById(R.id.blueberry);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this , R.raw.blueberry);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });

        imagebutton = findViewById(R.id.strawberry);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this , R.raw.strawberry);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });

        imagebutton = findViewById(R.id.rasperry);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this , R.raw.raspberry);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer6.start();
            }
        });

        imagebutton = findViewById(R.id.cherry);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this , R.raw.cherry);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer7.start();
            }
        });

        imagebutton = findViewById(R.id.grapes);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this , R.raw.grapes);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer8.start();
            }
        });

        imagebutton = findViewById(R.id.orangeee);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this , R.raw.forange);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer9.start();
            }
        });

        imagebutton = findViewById(R.id.kiwi);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this , R.raw.kiwi);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer10.start();
            }
        });

        imagebutton = findViewById(R.id.pomegranate);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this , R.raw.pomegranate);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer11.start();
            }
        });

        imagebutton = findViewById(R.id.pineapple);
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this , R.raw.pineapple);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer12.start();
            }
        });

        imagebutton = findViewById(R.id.banana);
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this , R.raw.banana);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer13.start();
            }
        });

        imagebutton = findViewById(R.id.watermelon);
        MediaPlayer mediaPlayer14 = MediaPlayer.create(this , R.raw.watermelon);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer14.start();
            }
        });

    }
}