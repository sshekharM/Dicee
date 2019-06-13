package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
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
        rollButton = (Button) findViewById(R.id.rollButton2);

        final ImageView leftDice;
        leftDice = (ImageView) findViewById(R.id.imageViewDiceLeft);


        final ImageView rightDice;
        rightDice = (ImageView) findViewById(R.id.imageViewDiceRight);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze button has been press");

                Random randomNunberGenerator = new Random();

                int number = randomNunberGenerator.nextInt(6);

                Log.d("Dicee", "The number is :" + number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNunberGenerator.nextInt(5);

                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
