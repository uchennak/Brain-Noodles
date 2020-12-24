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
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers3;

public class UsersAnswers3 extends ActionBarActivity {
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

//Inserting the Intent's values

        Bundle extras3 = getIntent().getExtras();
        String[] usersAnswers3 = extras3.getStringArray("usersAnswers3");
        String[] isATOF3 = extras3.getStringArray("isATOF3");

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


        String score3S = extras3.getString("score3S");
        youScored.setText("  Score: "+score3S + "/10" );

        resultView1.setText("1. " +usersAnswers3[0]);
        resultView2.setText("2. " +usersAnswers3[1]);
        resultView3.setText("3. " +usersAnswers3[2]);
        resultView4.setText("4. " +usersAnswers3[3]);
        resultView5.setText("5. " +usersAnswers3[4]);
        resultView6.setText("6. " +usersAnswers3[5]);
        resultView7.setText("7. " +usersAnswers3[6]);
        resultView8.setText("8. " +usersAnswers3[7]);
        resultView9.setText("9. " +usersAnswers3[8]);
        resultView10.setText("10. " +usersAnswers3[9]);

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

        resultViewCON1.setText(isATOF3[0]);
        resultViewCON2.setText(isATOF3[1]);
        resultViewCON3.setText(isATOF3[2]);
        resultViewCON4.setText(isATOF3[3]);
        resultViewCON5.setText(isATOF3[4]);
        resultViewCON6.setText(isATOF3[5]);
        resultViewCON7.setText(isATOF3[6]);
        resultViewCON8.setText(isATOF3[7]);
        resultViewCON9.setText(isATOF3[8]);
        resultViewCON10.setText(isATOF3[9]);

    }
    public void onButton1Click(View v) {

      if (v.getId() == R.id.testResultsButton) {
            Bundle extras3 = getIntent().getExtras();
            Intent intent3 = new Intent(UsersAnswers3.this, CorrectAnswers3.class);
            intent3.putExtras(extras3);
            startActivity(intent3);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers3.this, MainActivity.class));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras3 = getIntent().getExtras();
        String score3S = extras3.getString("score3S");

        String text = "I scored "+ score3S + "/10 on T-C. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
