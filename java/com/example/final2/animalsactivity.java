package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class animalsactivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalsactivity);


        setTitle("Animals");
        imageButton = findViewById(R.id.img_btn);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.pronunciation_en_camel);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });


        imageButton1 = findViewById(R.id.img_btn1);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.pronunciation_en_cow);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                mediaPlayer1.start();
            }
        });



        imageButton2 = findViewById(R.id.img_btn2);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.pronunciation_en_lion);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                mediaPlayer2.start();
            }
        });





        imageButton3 = findViewById(R.id.img_btn3);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.pronunciation_en_panda);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                mediaPlayer3.start();
            }
        });



        imageButton4 = findViewById(R.id.img_btn4);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.pronunciation_en_rabbit);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                mediaPlayer4.start();
            }
        });


        imageButton5 = findViewById(R.id.img_btn5);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.pronunciation_en_turtle);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                mediaPlayer5.start();
            }
        });


        imageButton6 = findViewById(R.id.img_btn6);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.pronunciation_en_bee);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                mediaPlayer6.start();
            }
        });


        imageButton7 = findViewById(R.id.img_btn7);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.pronunciation_en_monkey);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {
                mediaPlayer7.start();
            }
        });


        imageButton8 = findViewById(R.id.img_btn8);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.pronunciation_en_whale);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {
                mediaPlayer8.start();
            }
        });
    }
}