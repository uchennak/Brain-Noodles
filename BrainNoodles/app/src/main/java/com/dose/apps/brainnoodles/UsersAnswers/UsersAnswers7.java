package com.dose.apps.brainnoodles.UsersAnswers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers7;

public class UsersAnswers7 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1,resultViewCON2,resultViewCON3,resultViewCON4,resultViewCON5,
            resultViewCON6,resultViewCON7,resultViewCON8,resultViewCON9,resultViewCON10;

    TextView youScored;

    Button homePageButton, testResultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

        //Catching intent

        Bundle extras7 = getIntent().getExtras();
        String[] usersAnswers7 = extras7.getStringArray("usersAnswers7");
        String[] isATOF7 = extras7.getStringArray("isATOF7");

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



        int score7 = extras7.getInt("score7");
        youScored.setText("  Score: "+score7 + "/10" );

        resultView1.setText("1. " +usersAnswers7[0]);
        resultView2.setText("2. " +usersAnswers7[1]);
        resultView3.setText("3. " +usersAnswers7[2]);
        resultView4.setText("4. " +usersAnswers7[3]);
        resultView5.setText("5. " +usersAnswers7[4]);
        resultView6.setText("6. " +usersAnswers7[5]);
        resultView7.setText("7. " +usersAnswers7[6]);
        resultView8.setText("8. " +usersAnswers7[7]);
        resultView9.setText("9. " +usersAnswers7[8]);
        resultView10.setText("10. " +usersAnswers7[9]);

         /*
          * Displaying True or False
         */

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

        resultViewCON1.setText(isATOF7[0]);
        resultViewCON2.setText(isATOF7[1]);
        resultViewCON3.setText(isATOF7[2]);
        resultViewCON4.setText(isATOF7[3]);
        resultViewCON5.setText(isATOF7[4]);
        resultViewCON6.setText(isATOF7[5]);
        resultViewCON7.setText(isATOF7[6]);
        resultViewCON8.setText(isATOF7[7]);
        resultViewCON9.setText(isATOF7[8]);
        resultViewCON10.setText(isATOF7[9]);

    }

    public void onButton1Click(View v) {



        if (v.getId() == R.id.testResultsButton) {
            Bundle extras7 = getIntent().getExtras();
            Intent intent7 = new Intent(UsersAnswers7.this, CorrectAnswers7.class);
            intent7.putExtras(extras7);
            startActivity(intent7);
        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers7.this, MainActivity.class));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras7 = getIntent().getExtras();
        int score7 = extras7.getInt("score7");

        String text = "I scored "+ score7 + "/10 on T-G. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
