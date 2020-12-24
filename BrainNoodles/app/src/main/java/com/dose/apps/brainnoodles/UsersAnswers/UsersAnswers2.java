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
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers2;


public class UsersAnswers2 extends ActionBarActivity {

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

        Bundle extras2 = getIntent().getExtras();
        String[] usersAnswers2 = extras2.getStringArray("usersAnswers2");
        String[] isATOF2 = extras2.getStringArray("isATOF2");

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



        String score2S = extras2.getString("score2S");
        youScored.setText("  Score: "+score2S + "/10" );

        resultView1.setText("1. " +usersAnswers2[0]);
        resultView2.setText("2. " +usersAnswers2[1]);
        resultView3.setText("3. " +usersAnswers2[2]);
        resultView4.setText("4. " +usersAnswers2[3]);
        resultView5.setText("5. " +usersAnswers2[4]);
        resultView6.setText("6. " +usersAnswers2[5]);
        resultView7.setText("7. " +usersAnswers2[6]);
        resultView8.setText("8. " +usersAnswers2[7]);
        resultView9.setText("9. " +usersAnswers2[8]);
        resultView10.setText("10. " +usersAnswers2[9]);

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

        resultViewCON1.setText(isATOF2[0]);
        resultViewCON2.setText(isATOF2[1]);
        resultViewCON3.setText(isATOF2[2]);
        resultViewCON4.setText(isATOF2[3]);
        resultViewCON5.setText(isATOF2[4]);
        resultViewCON6.setText(isATOF2[5]);
        resultViewCON7.setText(isATOF2[6]);
        resultViewCON8.setText(isATOF2[7]);
        resultViewCON9.setText(isATOF2[8]);
        resultViewCON10.setText(isATOF2[9]);

    }
    public void onButton1Click(View v) {


       if (v.getId() == R.id.testResultsButton) {
            Bundle extras2 = getIntent().getExtras();
            Intent intent2 = new Intent(UsersAnswers2.this, CorrectAnswers2.class);
            intent2.putExtras(extras2);
            startActivity(intent2);
        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers2.this, MainActivity.class));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras2 = getIntent().getExtras();
        String score2S = extras2.getString("score2S");

        String text = "I scored "+ score2S + "/10 on T-B. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
