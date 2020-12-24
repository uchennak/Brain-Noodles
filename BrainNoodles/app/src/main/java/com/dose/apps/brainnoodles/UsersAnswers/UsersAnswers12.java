package com.dose.apps.brainnoodles.UsersAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers12;

/**
 * Created by chiozokamalu on 12/13/17.
 */
public class UsersAnswers12 extends Activity {
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

        Bundle extras12 = getIntent().getExtras();
        String[] usersAnswers12 = extras12.getStringArray("usersAnswers12");
        String[] isATOF12 = extras12.getStringArray("isATOF12");

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

        String score12S = extras12.getString("score12S");
        youScored.setText("  Score: " + score12S + "/10");


        resultView1.setText("1. " + usersAnswers12[0]);
        resultView2.setText("2. " + usersAnswers12[1]);
        resultView3.setText("3. " + usersAnswers12[2]);
        resultView4.setText("4. " + usersAnswers12[3]);
        resultView5.setText("5. " + usersAnswers12[4]);
        resultView6.setText("6. " + usersAnswers12[5]);
        resultView7.setText("7. " + usersAnswers12[6]);
        resultView8.setText("8. " + usersAnswers12[7]);
        resultView9.setText("9. " + usersAnswers12[8]);
        resultView10.setText("10. " + usersAnswers12[9]);



        resultViewCON1.setText(isATOF12[0]);
        resultViewCON2.setText(isATOF12[1]);
        resultViewCON3.setText(isATOF12[2]);
        resultViewCON4.setText(isATOF12[3]);
        resultViewCON5.setText(isATOF12[4]);
        resultViewCON6.setText(isATOF12[5]);
        resultViewCON7.setText(isATOF12[6]);
        resultViewCON8.setText(isATOF12[7]);
        resultViewCON9.setText(isATOF12[8]);
        resultViewCON10.setText(isATOF12[9]);

    };
    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras12 = getIntent().getExtras();
            Intent intent12 = new Intent(UsersAnswers12.this, CorrectAnswers12.class);
            intent12.putExtras(extras12);
            startActivity(intent12);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers12.this, MainActivity.class));
        }

    }
    public void shareText(View v){

        Bundle extras12 = getIntent().getExtras();
        String score12S = extras12.getString("score12S");

        String text = "I scored "+ score12S + "/10 on T-L. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
