package com.dose.apps.brainnoodles.UsersAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers6;


public class UsersAnswers6 extends ActionBarActivity {



    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1, resultViewCON2, resultViewCON3, resultViewCON4, resultViewCON5,
            resultViewCON6, resultViewCON7, resultViewCON8, resultViewCON9, resultViewCON10;

    TextView youScored;

    Button homePageButton, testResultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

//Inserting the Intent's values

        Bundle extras6 = getIntent().getExtras();
        String[] usersAnswers6 = extras6.getStringArray("usersAnswers6");
        String[] isATOF6 = extras6.getStringArray("isATOF6");

        resultView1 = ((TextView) findViewById(R.id.resultView1));
        resultView2 = ((TextView) findViewById(R.id.resultView2));
        resultView3 = ((TextView) findViewById(R.id.resultView3));
        resultView4 = ((TextView) findViewById(R.id.resultView4));
        resultView5 = ((TextView) findViewById(R.id.resultView5));
        resultView6 = ((TextView) findViewById(R.id.resultView6));
        resultView7 = ((TextView) findViewById(R.id.resultView7));
        resultView8 = ((TextView) findViewById(R.id.resultView8));
        resultView9 = ((TextView) findViewById(R.id.resultView9));
        resultView10 = ((TextView) findViewById(R.id.resultView10));

        youScored = ((TextView) findViewById(R.id.youScored));


        String score6S = extras6.getString("score6S");
        youScored.setText("  Score: " + score6S + "/10");


        resultView1.setText("1. " + usersAnswers6[0]);
        resultView2.setText("2. " + usersAnswers6[1]);
        resultView3.setText("3. " + usersAnswers6[2]);
        resultView4.setText("4. " + usersAnswers6[3]);
        resultView5.setText("5. " + usersAnswers6[4]);
        resultView6.setText("6. " + usersAnswers6[5]);
        resultView7.setText("7. " + usersAnswers6[6]);
        resultView8.setText("8. " + usersAnswers6[7]);
        resultView9.setText("9. " + usersAnswers6[8]);
        resultView10.setText("10. " + usersAnswers6[9]);

        // Are User's answers correct or not

        resultViewCON1 = ((TextView) findViewById(R.id.resultViewCON1));
        resultViewCON2 = ((TextView) findViewById(R.id.resultViewCON2));
        resultViewCON3 = ((TextView) findViewById(R.id.resultViewCON3));
        resultViewCON4 = ((TextView) findViewById(R.id.resultViewCON4));
        resultViewCON5 = ((TextView) findViewById(R.id.resultViewCON5));
        resultViewCON6 = ((TextView) findViewById(R.id.resultViewCON6));
        resultViewCON7 = ((TextView) findViewById(R.id.resultViewCON7));
        resultViewCON8 = ((TextView) findViewById(R.id.resultViewCON8));
        resultViewCON9 = ((TextView) findViewById(R.id.resultViewCON9));
        resultViewCON10 = ((TextView) findViewById(R.id.resultViewCON10));

        resultViewCON1.setText(isATOF6[0]);
        resultViewCON2.setText(isATOF6[1]);
        resultViewCON3.setText(isATOF6[2]);
        resultViewCON4.setText(isATOF6[3]);
        resultViewCON5.setText(isATOF6[4]);
        resultViewCON6.setText(isATOF6[5]);
        resultViewCON7.setText(isATOF6[6]);
        resultViewCON8.setText(isATOF6[7]);
        resultViewCON9.setText(isATOF6[8]);
        resultViewCON10.setText(isATOF6[9]);

    };


    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras6 = getIntent().getExtras();
            Intent intent6 = new Intent(UsersAnswers6.this, CorrectAnswers6.class);
            intent6.putExtras(extras6);
            startActivity(intent6);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers6.this, MainActivity.class));
        }

    }

    public void shareText(View v){

        Bundle extras6 = getIntent().getExtras();
        String score6S = extras6.getString("score6S");

        String text = "I scored "+ score6S + "/10 on T-F. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
