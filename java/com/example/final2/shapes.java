package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class shapes extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);


        setTitle("Shapes");
        imageButton = findViewById(R.id.img_btn);
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.pronunciation_en_circle);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.start();
            }

        });

        imageButton1 = findViewById(R.id.imageButton1);
        MediaPlayer mediaplayer1 = MediaPlayer.create(this, R.raw.pronunciation_en_triangle);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer1.start();
            }

        });


        imageButton2 = findViewById(R.id.imageButton2);
        MediaPlayer mediaplayer2 = MediaPlayer.create(this, R.raw.pronunciation_en_diamond);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer2.start();
            }

        });

        imageButton3 = findViewById(R.id.imageButton4);
        MediaPlayer mediaplayer3 = MediaPlayer.create(this, R.raw.pronunciation_en_heart);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer3.start();
            }

        });

        imageButton4 = findViewById(R.id.imageButton3);
        MediaPlayer mediaplayer4 = MediaPlayer.create(this, R.raw.pronunciation_en_square);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer4.start();
            }
        });


        imageButton5 = findViewById(R.id.imageButton5);
        MediaPlayer mediaplayer5 = MediaPlayer.create(this, R.raw.pronunciation_en_rectangle);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer5.start();
            }
        });


        imageButton6 = findViewById(R.id.imageButton6);
        MediaPlayer mediaplayer6 = MediaPlayer.create(this, R.raw.pronunciation_en_star);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer6.start();
            }
        });


        imageButton7 = findViewById(R.id.imageButton7);
        MediaPlayer mediaplayer7 = MediaPlayer.create(this, R.raw.pronunciation_en_oval);

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer7.start();
            }
        });

    }
}