package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class coloursactivity extends AppCompatActivity {
    ImageButton blueimg;
    ImageButton redimg;
    ImageButton greenimg;
    ImageButton yellowimg;
    ImageButton pinkimg;
    ImageButton purpleimg;
    ImageButton blackimg;
    ImageButton orangeimg;
    ImageButton greyimg;
    ImageButton brwnimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloursactivity);


        setTitle("Colours");

        blueimg = findViewById(R.id.blue);
        MediaPlayer mediaPlayerblue=MediaPlayer.create(this,R.raw.blue);

        blueimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerblue.start();
            }
        });

        redimg = findViewById(R.id.red);
        MediaPlayer mediaPlayerred=MediaPlayer.create(this,R.raw.red);

        redimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerred.start();
            }
        });

        greenimg = findViewById(R.id.green);
        MediaPlayer mediaPlayergreen=MediaPlayer.create(this,R.raw.green);

        greenimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayergreen.start();
            }
        });

        yellowimg = findViewById(R.id.yellow);
        MediaPlayer mediaPlayeryellow=MediaPlayer.create(this,R.raw.yellow);

        yellowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayeryellow.start();
            }
        });

        pinkimg = findViewById(R.id.pink);
        MediaPlayer mediaPlayerpink=MediaPlayer.create(this,R.raw.pink);

        pinkimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerpink.start();
            }
        });

        purpleimg = findViewById(R.id.purple);
        MediaPlayer mediaPlayerpurple=MediaPlayer.create(this,R.raw.purple);

        purpleimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerpurple.start();
            }
        });

        blackimg = findViewById(R.id.black);
        MediaPlayer mediaPlayerblack=MediaPlayer.create(this,R.raw.black);

        blackimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerblack.start();
            }
        });

        orangeimg = findViewById(R.id.orange);
        MediaPlayer mediaPlayerorange=MediaPlayer.create(this,R.raw.orange);

        orangeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerorange.start();
            }
        });

        greyimg = findViewById(R.id.grey);
        MediaPlayer mediaPlayergrey=MediaPlayer.create(this,R.raw.grey);

        greyimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayergrey.start();
            }
        });

        brwnimg = findViewById(R.id.brown);
        MediaPlayer mediaPlayerbrown=MediaPlayer.create(this,R.raw.pronunciation_en_brown);

        brwnimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerbrown.start();
            }
        });
    }
}