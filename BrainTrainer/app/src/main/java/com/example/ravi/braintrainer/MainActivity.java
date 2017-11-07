package com.example.ravi.braintrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ArrayList<Integer> answers;
    int locatinOfCorrectAnswer;


    public void start(View view) {

        startButton.setVisibility(View.INVISIBLE);
        TextView sumTextView = (TextView) findViewById(R.id.sumTextView);

        Random rand = new Random();

        int a = rand.nextInt(21);
        int b = rand.nextInt(21);

        sumTextView.setText(Integer.toString(a) +" + "+ Integer.toString(b));

        locatinOfCorrectAnswer = rand.nextInt(4);

        for(int i=0;i <4; i++) {

            if(i==locatinOfCorrectAnswer) {

                answers.add(a + b);

            }else {
                answers.add(rand.nextInt(41));
            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);

    }
}
