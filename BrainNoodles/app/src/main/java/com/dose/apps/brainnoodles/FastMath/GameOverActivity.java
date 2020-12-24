package com.dose.apps.brainnoodles.FastMath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;

/**
 * Created by kamalu on 12/28/2017.
 */

public class GameOverActivity extends AppCompatActivity {
    TextView scoreTV, problemsSolvedTV, percentageTV, highScoreTV;
    double scoreDoub, problemsSolvedDoub, percentageDoub, numerPercent;
    int scoreInt, problemsSolvedInt, percentageInt, whichMath;
    static int highScore;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);


    //Initializing TextViews
        scoreTV = ((TextView) findViewById(R.id.score));
        problemsSolvedTV = ((TextView) findViewById(R.id.problemsSolved));
        percentageTV = ((TextView) findViewById(R.id.percentage));
        highScoreTV = ((TextView) findViewById(R.id.highScore));

    //Opening Bundle and assigning values
        Bundle extras = getIntent().getExtras();
        scoreDoub = extras.getInt("scoreDoub");
        problemsSolvedDoub = extras.getInt("problemsSolvedDoub");
        whichMath = extras.getInt("whichMath");


        if (problemsSolvedDoub == 0) {
            setScoresViewsNa();
            calculateHighScore();
        } else {
            setScoresViews();
            calculateHighScore();
        }


    }
    public void setScoresViews(){
        //calculating the accuracy
        percentageDoub = scoreDoub / problemsSolvedDoub * 100;

        //casting doubles to ints (preparing them to being displayed)
        scoreInt = (int) scoreDoub;
        percentageInt =(int) percentageDoub;
        problemsSolvedInt =(int) problemsSolvedDoub;

        //Displaying the score
        percentageTV.setText(percentageInt + "");
        scoreTV.setText(scoreInt + "");
        problemsSolvedTV.setText(problemsSolvedInt + "");
    }

    public void setScoresViewsNa(){
        //Displaying the score
        percentageTV.setText(percentageInt + "");
        scoreTV.setText(scoreInt + "");
        problemsSolvedTV.setText("0");
    }

    public void calculateHighScore(){
        int newHighScore = percentageInt + scoreInt;

        if(newHighScore > highScore){
          highScore = newHighScore;
        }
        highScoreTV.setText("High Score:"+ highScore);
    }

    //Start the game over
    public void retry(View v){

        //Restart
        if (whichMath == 1){
            Intent retryIntent = new Intent(GameOverActivity.this, Math1.class);
            startActivity(retryIntent);
        }
        if (whichMath == 2){
            Intent retryIntent = new Intent(GameOverActivity.this, Math2.class);
            startActivity(retryIntent);
        }
        if (whichMath == 3){
            Intent retryIntent = new Intent(GameOverActivity.this, Math3.class);
            startActivity(retryIntent);
        }
        if (whichMath == 4){
            Intent retryIntent = new Intent(GameOverActivity.this, Math4.class);
            startActivity(retryIntent);
        }
        if (whichMath == 5){
            Intent retryIntent = new Intent(GameOverActivity.this, Math5.class);
            startActivity(retryIntent);
        }
        if (whichMath == 6){
            Intent retryIntent = new Intent(GameOverActivity.this, Math6.class);
            startActivity(retryIntent);
        }

    }
    public void exit(View v){

        // Exit and go to the Main A
        Intent exitIntent = new Intent(GameOverActivity.this, MainActivity.class);
        startActivity(exitIntent);
    }
    public void onBackPressed()
    {

    }
}
