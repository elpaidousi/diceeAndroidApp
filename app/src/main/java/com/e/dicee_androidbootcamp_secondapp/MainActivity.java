package com.e.dicee_androidbootcamp_secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton= findViewById(R.id.roll_button);

        final ImageView leftDice= findViewById(R.id.imageRightDice);

        final ImageView rightDice= findViewById(R.id.imageLeftDice);

        final int[] diceArray= {
                R.drawable.dice1 ,
                R.drawable.dice2 ,
                R.drawable.dice3 ,
                R.drawable.dice4 ,
                R.drawable.dice5 ,
                R.drawable.dice6 };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber= new Random();

                int number=randomNumber.nextInt(6);
                leftDice.setImageResource(diceArray[number]);

                number=randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);



            }
        });



    }
}
