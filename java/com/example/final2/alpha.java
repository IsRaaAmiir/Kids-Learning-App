package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alpha extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);


        setTitle("Alphabets");


        imageButton = findViewById(R.id.img_btn);
        MediaPlayer mediaplayer1 = MediaPlayer.create(this, R.raw.pronunciation_en_a);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer1.start();
            }

        });

        imageButton= findViewById(R.id.imageButton1);
        MediaPlayer mediaplayer2 = MediaPlayer.create(this, R.raw.pronunciation_en_b);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer2.start();
            }

        });


        imageButton = findViewById(R.id.imageButton2);
        MediaPlayer mediaplayer3 = MediaPlayer.create(this, R.raw.pronunciation_en_c);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer3.start();
            }

        });

        imageButton = findViewById(R.id.imageButton4);
        MediaPlayer mediaplayer4 = MediaPlayer.create(this, R.raw.pronunciation_de_d);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer4.start();
            }

        });

        imageButton = findViewById(R.id.imageButton3);
        MediaPlayer mediaplayer5 = MediaPlayer.create(this, R.raw.pronunciation_en_e);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer5.start();
            }
        });


        imageButton = findViewById(R.id.imageButton5);
        MediaPlayer mediaplayer6 = MediaPlayer.create(this, R.raw.pronunciation_en_f);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer6.start();
            }
        });


        imageButton = findViewById(R.id.imageButton6);
        MediaPlayer mediaplayer7 = MediaPlayer.create(this, R.raw.pronunciation_en_g);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer7.start();
            }
        });


        imageButton = findViewById(R.id.imageButton7);
        MediaPlayer mediaplayer8 = MediaPlayer.create(this, R.raw.pronunciation_en_h);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer8.start();
            }
        });


        imageButton = findViewById(R.id.imageButton8);
        MediaPlayer mediaplayer9 = MediaPlayer.create(this, R.raw.pronunciation_en_i);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer9.start();
            }
        });


        imageButton = findViewById(R.id.imageButton9);
        MediaPlayer mediaplayer10 = MediaPlayer.create(this, R.raw.j);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer10.start();
            }
        });



        imageButton = findViewById(R.id.imageButton10);
        MediaPlayer mediaplayer11 = MediaPlayer.create(this, R.raw.k);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer11.start();
            }
        });

        imageButton = findViewById(R.id.imageButton11);
        MediaPlayer mediaplayer12 = MediaPlayer.create(this, R.raw.l);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer12.start();
            }
        });

        imageButton = findViewById(R.id.imageButton12);
        MediaPlayer mediaplayer13 = MediaPlayer.create(this, R.raw.m);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer13.start();
            }
        });

        imageButton = findViewById(R.id.imageButton13);
        MediaPlayer mediaplayer14 = MediaPlayer.create(this, R.raw.n);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer14.start();
            }
        });
    }


}