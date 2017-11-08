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
    TextView resultTextView;
    TextView pointsTextView;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locatinOfCorrectAnswer;
    int score=0;
    int numberOfQuestions=0;

    public void chooseAnswer(View view) {

        if(view.getTag().toString().equals(Integer.toString(locatinOfCorrectAnswer))) {

                score++;
                resultTextView.setText("Correct!");

        }else {
            resultTextView.setText("Wrong!");
        }
        numberOfQuestions++;

        pointsTextView.setText(Integer.toString(score)+ "/" + Integer.toString(numberOfQuestions));
    }


    public void start(View view) {

        startButton.setVisibility(View.INVISIBLE);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);
        TextView sumTextView = (TextView) findViewById(R.id.sumTextView);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1= (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);

        Random rand = new Random();

        int a = rand.nextInt(21);
        int b = rand.nextInt(21);

        sumTextView.setText(Integer.toString(a) +" + "+ Integer.toString(b));

        locatinOfCorrectAnswer = rand.nextInt(4);

        int incorrectAnswer;

        for(int i=0;i <4; i++) {

            if(i==locatinOfCorrectAnswer) {

                answers.add(a + b);

            }else {

                incorrectAnswer = rand.nextInt(41);
                while(incorrectAnswer == a +  b) {
                    incorrectAnswer = rand.nextInt(41);
                }
                answers.add(incorrectAnswer);

            }

        }
        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));



    }
}
