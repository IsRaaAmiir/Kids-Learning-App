package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class numders extends AppCompatActivity {
    ImageButton imagebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numders);


        setTitle("Numbers");

        imagebutton = findViewById(R.id.one);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this , R.raw.one);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });


        imagebutton = findViewById(R.id.two);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this , R.raw.two);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });

        imagebutton = findViewById(R.id.three);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this , R.raw.three);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });

        imagebutton = findViewById(R.id.four);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this , R.raw.four);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });


        imagebutton = findViewById(R.id.five);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this , R.raw.five);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });



        imagebutton = findViewById(R.id.six);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this , R.raw.six);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer6.start();
            }
        });



        imagebutton = findViewById(R.id.seven);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this , R.raw.seven);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer7.start();
            }
        });



        imagebutton = findViewById(R.id.eight);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this , R.raw.eight);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer8.start();
            }
        });



        imagebutton = findViewById(R.id.nine);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this , R.raw.nine);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer9.start();
            }
        });



        imagebutton = findViewById(R.id.ten);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this , R.raw.ten);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer10.start();
            }
        });

        imagebutton = findViewById(R.id.eleven);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this , R.raw.eleven);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer11.start();
            }
        });



        imagebutton = findViewById(R.id.twelve);
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this , R.raw.twelve);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer12.start();
            }
        });


        imagebutton = findViewById(R.id.thirteen);
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this , R.raw.thirteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer13.start();
            }
        });


        imagebutton = findViewById(R.id.fourteen);
        MediaPlayer mediaPlayer14 = MediaPlayer.create(this , R.raw.fourteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer14.start();
            }
        });


        imagebutton = findViewById(R.id.fifteen);
        MediaPlayer mediaPlayer15 = MediaPlayer.create(this , R.raw.fifteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer15.start();
            }
        });

        imagebutton = findViewById(R.id.sixteen);
        MediaPlayer mediaPlayer16 = MediaPlayer.create(this , R.raw.sixteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer16.start();
            }
        });


        imagebutton = findViewById(R.id.seventeen);
        MediaPlayer mediaPlayer17 = MediaPlayer.create(this , R.raw.seventeen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer17.start();
            }
        });


        imagebutton = findViewById(R.id.eighteen);
        MediaPlayer mediaPlayer18 = MediaPlayer.create(this , R.raw.eighteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer18.start();
            }
        });


        imagebutton = findViewById(R.id.nineteen);
        MediaPlayer mediaPlayer19 = MediaPlayer.create(this , R.raw.nineteen);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer19.start();
            }
        });


        imagebutton = findViewById(R.id.twenty);
        MediaPlayer mediaPlayer20 = MediaPlayer.create(this , R.raw.twenty);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer20.start();
            }
        });

    }

}