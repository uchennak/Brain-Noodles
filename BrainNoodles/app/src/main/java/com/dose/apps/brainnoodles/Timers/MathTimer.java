package com.dose.apps.brainnoodles.Timers;

import android.content.Intent;
import android.widget.TextView;

import com.dose.apps.brainnoodles.FastMath.GameOverActivity;
import com.dose.apps.brainnoodles.FastMath.Math1;
import com.dose.apps.brainnoodles.FastMath.Math2;
import com.dose.apps.brainnoodles.FastMath.Math3;
import com.dose.apps.brainnoodles.FastMath.Math4;
import com.dose.apps.brainnoodles.FastMath.Math5;
import com.dose.apps.brainnoodles.FastMath.Math6;

/**
 * Created by kamalu on 1/4/2018.
 */

public class MathTimer extends CountDownTimerPauseable {
    TextView textCounter;
    int score, problemsSolved,whichMath;

    public MathTimer(TextView textCounter, long millisInFuture, long countDownInterval) {
    super(millisInFuture,countDownInterval);
        this.textCounter=textCounter;

    }

    @Override
    public void onTick(long millisUntilFinished) {
        textCounter.setText(String.valueOf(millisUntilFinished / 1000));
    }

    @Override
    public void onFinish() {

        Intent gameOverIntent = new Intent(textCounter.getContext(), GameOverActivity.class);
        gameOverIntent.putExtra("scoreDoub", score);
        gameOverIntent.putExtra("problemsSolvedDoub", problemsSolved);

        if(textCounter.getContext() instanceof Math1){
            whichMath = 1;
            gameOverIntent.putExtra("whichMath", whichMath);
        }
        if(textCounter.getContext() instanceof Math2){
            whichMath = 2;
            gameOverIntent.putExtra("whichMath", whichMath);
        }
        if(textCounter.getContext() instanceof Math3){
            whichMath = 3;
            gameOverIntent.putExtra("whichMath", whichMath);
        }
        if(textCounter.getContext() instanceof Math4){
            whichMath = 4;
            gameOverIntent.putExtra("whichMath", whichMath);
        }
        if(textCounter.getContext() instanceof Math5){
            whichMath = 5;
            gameOverIntent.putExtra("whichMath", whichMath);
        }
        if(textCounter.getContext() instanceof Math6){
            whichMath = 6;
            gameOverIntent.putExtra("whichMath", whichMath);
        }

        textCounter.getContext().startActivity(gameOverIntent);
    }
    //Keep track of the scores
    public void recordScore(int score,int problemsSolved){
        this.problemsSolved = problemsSolved;
        this.score = score;
    }

}
