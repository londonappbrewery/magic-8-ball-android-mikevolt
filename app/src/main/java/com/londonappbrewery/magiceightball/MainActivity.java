package com.londonappbrewery.magiceightball;

import android.media.Image;
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

        //first assign your button name to a button declare button
        Button ask_button;
        //next assign your button to the image
        ask_button = (Button) findViewById(R.id.ask_button);

        //create an object and assign the eightball image
        final ImageView image_eightBall = (ImageView) findViewById(R.id.image_eightBall);

        //create an array of images

        final int [] ballArray = {
                R.drawable.ball1, //ask again later index o
                R.drawable.ball2, // no index 1
                R.drawable.ball3, //yes index 2
                R.drawable.ball4, //i have no idea index 3
                R.drawable.ball5 // the answer is yes  index 4
        };

        // when doing this type new then On then hit tab and it will fill out the rest
        //create a listener on click
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magicEightBall", "The ask message has been clicked"); //printing out when clicked

                //create random number object and assign number variable to it
                Random randomNumberGenerator = new Random();

                //creating a number variable and assigning it to our keyword then using keyword from object to assign built in java method
                int number = randomNumberGenerator.nextInt(5);
                Log.d("magicEightBall", "Random number is: " + number);

                //last step to assign the image to the array and the array to the number var
                image_eightBall.setImageResource(ballArray[number]);



            }
        });

    };

}

