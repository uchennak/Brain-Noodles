package com.dose.apps.brainnoodles.FastMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.Timers.MathTimer;

import java.util.Random;

/**
 * Created by Uchenna Kamalu
 */

public class Math4 extends Activity {
    int rand1, rand2, randDecider, correctAnswer, falseAnswer, problemsSolved;
    String response, correctAnswerStr;

    MathTimer mathTimer;

    int score;

    Random r;
    TextView randTV1, randTV2, scoreTV, sumTV, problemsSolvedTV, timerTV,operatorTV;
    Button choice1, choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fast_math);
        problemsSolved =0;
        falseAnswer = 1;

//Initializing TextViews

        timerTV = ((TextView) findViewById(R.id.timer));

        randTV1 = ((TextView) findViewById(R.id.rand1));
        randTV2 = ((TextView) findViewById(R.id.rand2));
        sumTV = ((TextView) findViewById(R.id.sum));
        scoreTV = ((TextView) findViewById(R.id.score));
        problemsSolvedTV = ((TextView) findViewById(R.id.problemsSolved));

        operatorTV = ((TextView) findViewById(R.id.operator));
        operatorTV.setText("x");

        choice1 = ((Button) findViewById(R.id.choice1));
        choice2 = ((Button) findViewById(R.id.choice2));

//Initializing a Random
        r = new Random();

//Set the first question
        setRandomProblem();

//Starting the timer
        mathTimer = new MathTimer(timerTV, 30000, 1000);
        mathTimer.start();

// Button Listeners
        choice1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkResponse((Button)v);
                setRandomProblem();

            }
        });
        choice2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkResponse((Button)v);
                setRandomProblem();

            }
        });
    }
    public void checkResponse(Button v) {

//Increment the total amount of problems solved
        problemsSolved++;
        problemsSolvedTV.setText(problemsSolved+"");

//Convert the response and correctAnswer to String in order to compare values
        response = v.getText().toString();
        correctAnswerStr = Integer.toString(correctAnswer);

//If the user clicks the correct answer, increment the score
        if ((response.equals(correctAnswerStr))) {
            score++;
            scoreTV.setText(score+"");
        }

//Keep track of the score within the timer
        mathTimer.recordScore(score,problemsSolved);
    }

    private void setRandomProblem() {

//Assigning random values to ints
        rand1 = r.nextInt(25) + 1;
        rand2 = r.nextInt(25) + 1;
        falseAnswer = r.nextInt(8)+1;
        randDecider = r.nextInt(2) + 1;

//The correctAnswer of the randoms
        correctAnswer = rand1 * rand2;

//Setting the texts of the random values
        randTV1.setText(rand1 + "");
        randTV2.setText(rand2 + "");

//If the random deciding number is 1, set the answer on choice1
        if (randDecider == 1) {
            choice1.setText(correctAnswer + "");
            choice2.setText(correctAnswer + falseAnswer + "");
        }
        //If the random deciding number is 2, set answer on choice2
        else {
            choice1.setText(correctAnswer + falseAnswer + "");
            choice2.setText(correctAnswer + "");
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();

        //Cancel the timer
        mathTimer.cancel();
    }
    @Override
    public void onStop(){
        super.onStop();

        //Pause the timer
        mathTimer.pause();
    }

    @Override
    public void onRestart(){
        super.onRestart();

        //Resume the timer
        mathTimer.resume();
    }
}
