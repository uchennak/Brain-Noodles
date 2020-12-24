package com.dose.apps.brainnoodles.UsersAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers13;

/**
 * Created by chiozokamalu on 12/15/17.
 */
public class UsersAnswers13 extends Activity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1, resultViewCON2, resultViewCON3, resultViewCON4, resultViewCON5,
            resultViewCON6, resultViewCON7, resultViewCON8, resultViewCON9, resultViewCON10;

    TextView youScored;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

//Inserting the Intent's values

        Bundle extras13 = getIntent().getExtras();
        String[] usersAnswers13 = extras13.getStringArray("usersAnswers13");
        String[] isATOF13 = extras13.getStringArray("isATOF13");

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

        String score13S = extras13.getString("score13S");
        youScored.setText("  Score: " + score13S + "/10");


        resultView1.setText("1. " + usersAnswers13[0]);
        resultView2.setText("2. " + usersAnswers13[1]);
        resultView3.setText("3. " + usersAnswers13[2]);
        resultView4.setText("4. " + usersAnswers13[3]);
        resultView5.setText("5. " + usersAnswers13[4]);
        resultView6.setText("6. " + usersAnswers13[5]);
        resultView7.setText("7. " + usersAnswers13[6]);
        resultView8.setText("8. " + usersAnswers13[7]);
        resultView9.setText("9. " + usersAnswers13[8]);
        resultView10.setText("10. " + usersAnswers13[9]);


        resultViewCON1.setText(isATOF13[0]);
        resultViewCON2.setText(isATOF13[1]);
        resultViewCON3.setText(isATOF13[2]);
        resultViewCON4.setText(isATOF13[3]);
        resultViewCON5.setText(isATOF13[4]);
        resultViewCON6.setText(isATOF13[5]);
        resultViewCON7.setText(isATOF13[6]);
        resultViewCON8.setText(isATOF13[7]);
        resultViewCON9.setText(isATOF13[8]);
        resultViewCON10.setText(isATOF13[9]);

    };
    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras13 = getIntent().getExtras();
            Intent intent13 = new Intent(UsersAnswers13.this, CorrectAnswers13.class);
            intent13.putExtras(extras13);
            startActivity(intent13);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers13.this, MainActivity.class));
        }

    }
    public void shareText(View v){

        Bundle extras13 = getIntent().getExtras();
        String score13S = extras13.getString("score13S");

        String text = "I scored "+ score13S + "/10 on T-M. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}

