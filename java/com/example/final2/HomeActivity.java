package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    ImageView coloursbtnn;
    ImageView animalsbtnn;
    ImageView alphabetsbtnn;
    ImageView numbersbtnn;
    ImageView fruitsbtnn;
    ImageView clothesbtnn;
    ImageView shapesbtnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");

        coloursbtnn = (ImageView) findViewById(R.id.color);
        animalsbtnn = (ImageView) findViewById(R.id.animal);
        alphabetsbtnn = (ImageView) findViewById(R.id.alpha);
        numbersbtnn = (ImageView) findViewById(R.id.num);
        fruitsbtnn = (ImageView) findViewById(R.id.fruit);
        clothesbtnn = (ImageView) findViewById(R.id.clothes);
        shapesbtnn = (ImageView) findViewById(R.id.shapes);


        animalsbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openanimalsactivity();
            }
        });


        coloursbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencoloursactivity();
            }
        });


        clothesbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openclothesactivity();
            }
        });

        alphabetsbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalpha();
            }
        });

        shapesbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openshapes();
            }
        });
        numbersbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennumber();
            }
        });

        fruitsbtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfruits();
            }
        });

    }


    public void opencoloursactivity() {

        Intent colorsintent = new Intent(HomeActivity.this, coloursactivity.class);
        startActivity(colorsintent);
    }

    public void openanimalsactivity() {
        Intent animalsintent = new Intent(HomeActivity.this, animalsactivity.class);
        startActivity(animalsintent);
    }

    public void openclothesactivity() {
        Intent clothesintent = new Intent(HomeActivity.this, clothesactivity.class);
        startActivity(clothesintent);

    }

    public void openalpha() {
        Intent alphaintent = new Intent(HomeActivity.this, alpha.class);
        startActivity(alphaintent);
    }
    public void openshapes () {
        Intent shapesintent = new Intent(HomeActivity.this, shapes.class);
        startActivity(shapesintent);
    }
    public void opennumber () {
        Intent numberintent = new Intent(HomeActivity.this, numders.class);
        startActivity(numberintent);
    }
        public void openfruits() {
            Intent fruitsintent = new Intent(HomeActivity.this, fruitsactivity.class);
            startActivity(fruitsintent);
        }
    }
