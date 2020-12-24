package com.dose.apps.brainnoodles.UsersAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers9;

public class UsersAnswers9 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1,resultViewCON2,resultViewCON3,resultViewCON4,resultViewCON5,
            resultViewCON6,resultViewCON7,resultViewCON8,resultViewCON9,resultViewCON10;

    TextView youScored;

    int score9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

// Introducing intent bundle

        Bundle extras9 = getIntent().getExtras();
        String[] usersAnswers9 = extras9.getStringArray("usersAnswers9");
        String[] isATOF9 = extras9.getStringArray("isATOF9");

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

// Displaying the users answers

        score9 = extras9.getInt("score9");
        youScored.setText("  Score: "+score9 + "/10" );

        resultView1.setText("1. " +usersAnswers9[0]);
        resultView2.setText("2. " +usersAnswers9[1]);
        resultView3.setText("3. " +usersAnswers9[2]);
        resultView4.setText("4. " +usersAnswers9[3]);
        resultView5.setText("5. " +usersAnswers9[4]);
        resultView6.setText("6. " +usersAnswers9[5]);
        resultView7.setText("7. " +usersAnswers9[6]);
        resultView8.setText("8. " +usersAnswers9[7]);
        resultView9.setText("9. " +usersAnswers9[8]);
        resultView10.setText("10. " +usersAnswers9[9]);


// Displaying True or False


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

        resultViewCON1.setText(isATOF9[0]);
        resultViewCON2.setText(isATOF9[1]);
        resultViewCON3.setText(isATOF9[2]);
        resultViewCON4.setText(isATOF9[3]);
        resultViewCON5.setText(isATOF9[4]);
        resultViewCON6.setText(isATOF9[5]);
        resultViewCON7.setText(isATOF9[6]);
        resultViewCON8.setText(isATOF9[7]);
        resultViewCON9.setText(isATOF9[8]);
        resultViewCON10.setText(isATOF9[9]);

    }


    public void onButton1Click(View v) {


        if (v.getId() == R.id.testResultsButton) {
            Bundle extras9 = getIntent().getExtras();
            Intent intent9 = new Intent(UsersAnswers9.this, CorrectAnswers9.class);
            intent9.putExtras(extras9);
            startActivity(intent9);
        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers9.this, MainActivity.class));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void shareText(View v){

        Bundle extras9 = getIntent().getExtras();
        score9 = extras9.getInt("score9");

        String text = "I scored "+ score9 + "/10 on T-I. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }



}
