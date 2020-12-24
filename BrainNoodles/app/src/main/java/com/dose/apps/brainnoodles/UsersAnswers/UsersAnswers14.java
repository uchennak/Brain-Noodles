package com.dose.apps.brainnoodles.UsersAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers14;
import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers13;

public class UsersAnswers14 extends Activity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1, resultViewCON2, resultViewCON3, resultViewCON4, resultViewCON5,
            resultViewCON6, resultViewCON7, resultViewCON8, resultViewCON9, resultViewCON10;

    TextView youScored;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

        //Opening the bundle and assigning passed over objects
        Bundle extras14 = getIntent().getExtras();
        String[] usersAnswers14 = extras14.getStringArray("usersAnswers14");
        String[] isATOF14 = extras14.getStringArray("isATOF14");

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

        String score14S = extras14.getString("score14S");
        youScored.setText("  Score: " + score14S + "/10");


        resultView1.setText("1. " + usersAnswers14[0]);
        resultView2.setText("2. " + usersAnswers14[1]);
        resultView3.setText("3. " + usersAnswers14[2]);
        resultView4.setText("4. " + usersAnswers14[3]);
        resultView5.setText("5. " + usersAnswers14[4]);
        resultView6.setText("6. " + usersAnswers14[5]);
        resultView7.setText("7. " + usersAnswers14[6]);
        resultView8.setText("8. " + usersAnswers14[7]);
        resultView9.setText("9. " + usersAnswers14[8]);
        resultView10.setText("10. " + usersAnswers14[9]);


        resultViewCON1.setText(isATOF14[0]);
        resultViewCON2.setText(isATOF14[1]);
        resultViewCON3.setText(isATOF14[2]);
        resultViewCON4.setText(isATOF14[3]);
        resultViewCON5.setText(isATOF14[4]);
        resultViewCON6.setText(isATOF14[5]);
        resultViewCON7.setText(isATOF14[6]);
        resultViewCON8.setText(isATOF14[7]);
        resultViewCON9.setText(isATOF14[8]);
        resultViewCON10.setText(isATOF14[9]);

    };
    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras14 = getIntent().getExtras();
            Intent intent14 = new Intent(UsersAnswers14.this, CorrectAnswers14.class);
            intent14.putExtras(extras14);
            startActivity(intent14);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers14.this, MainActivity.class));
        }

    }

    public void shareText(View v){

        //Opening bundle and assigning values
        Bundle extras14 = getIntent().getExtras();
        String score14S = extras14.getString("score14S");

        String text = "I scored "+ score14S + "/10 on T-N. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
