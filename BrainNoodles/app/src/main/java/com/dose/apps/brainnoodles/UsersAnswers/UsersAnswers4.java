package com.dose.apps.brainnoodles.UsersAnswers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers4;


public class UsersAnswers4 extends ActionBarActivity {
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

        Bundle extras4 = getIntent().getExtras();
        String[] usersAnswers4 = extras4.getStringArray("usersAnswers4");
        String[] isATOF4 = extras4.getStringArray("isATOF4");

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

        youScored = ((TextView)findViewById(R.id.youScored));


        String score4S = extras4.getString("score4S");
        youScored.setText("  Score: " +score4S + "/10" );


        resultView1.setText("1. " +usersAnswers4[0]);
        resultView2.setText("2. " +usersAnswers4[1]);
        resultView3.setText("3. " +usersAnswers4[2]);
        resultView4.setText("4. " +usersAnswers4[3]);
        resultView5.setText("5. " +usersAnswers4[4]);
        resultView6.setText("6. " +usersAnswers4[5]);
        resultView7.setText("7. " +usersAnswers4[6]);
        resultView8.setText("8. " +usersAnswers4[7]);
        resultView9.setText("9. " +usersAnswers4[8]);
        resultView10.setText("10. " +usersAnswers4[9]);

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

        resultViewCON1.setText(isATOF4[0]);
        resultViewCON2.setText(isATOF4[1]);
        resultViewCON3.setText(isATOF4[2]);
        resultViewCON4.setText(isATOF4[3]);
        resultViewCON5.setText(isATOF4[4]);
        resultViewCON6.setText(isATOF4[5]);
        resultViewCON7.setText(isATOF4[6]);
        resultViewCON8.setText(isATOF4[7]);
        resultViewCON9.setText(isATOF4[8]);
        resultViewCON10.setText(isATOF4[9]);
}



    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras4 = getIntent().getExtras();
            Intent intent4 = new Intent(UsersAnswers4.this, CorrectAnswers4.class);
            intent4.putExtras(extras4);
            startActivity(intent4);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers4.this, MainActivity.class));
        }

    }

    public void shareText(View v){

        Bundle extras4 = getIntent().getExtras();
        String score4S = extras4.getString("score4S");

        String text = "I scored "+ score4S + "/10 on T-D. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}