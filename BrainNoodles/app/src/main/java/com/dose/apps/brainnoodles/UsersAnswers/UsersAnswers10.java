package com.dose.apps.brainnoodles.UsersAnswers;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers10;

public class UsersAnswers10 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;

    TextView resultViewCON1,resultViewCON2,resultViewCON3,resultViewCON4,resultViewCON5,
            resultViewCON6,resultViewCON7,resultViewCON8,resultViewCON9,resultViewCON10;

    TextView youScored;

    int score10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_answers);

// Introducing intent bundle

        Bundle extras10 = getIntent().getExtras();
        String[] usersAnswers10 = extras10.getStringArray("usersAnswers10");
        String[] isATOF10 = extras10.getStringArray("isATOF10");

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

        score10 = extras10.getInt("score10");
        youScored.setText("  Score: "+score10 + "/10" );

        resultView1.setText("1. " +usersAnswers10[0]);
        resultView2.setText("2. " +usersAnswers10[1]);
        resultView3.setText("3. " +usersAnswers10[2]);
        resultView4.setText("4. " +usersAnswers10[3]);
        resultView5.setText("5. " +usersAnswers10[4]);
        resultView6.setText("6. " +usersAnswers10[5]);
        resultView7.setText("7. " +usersAnswers10[6]);
        resultView8.setText("8. " +usersAnswers10[7]);
        resultView9.setText("9. " +usersAnswers10[8]);
        resultView10.setText("10. " +usersAnswers10[9]);


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

        resultViewCON1.setText(isATOF10[0]);
        resultViewCON2.setText(isATOF10[1]);
        resultViewCON3.setText(isATOF10[2]);
        resultViewCON4.setText(isATOF10[3]);
        resultViewCON5.setText(isATOF10[4]);
        resultViewCON6.setText(isATOF10[5]);
        resultViewCON7.setText(isATOF10[6]);
        resultViewCON8.setText(isATOF10[7]);
        resultViewCON9.setText(isATOF10[8]);
        resultViewCON10.setText(isATOF10[9]);

    }

    public void onButton1Click(View v) {


        if (v.getId() == R.id.testResultsButton) {
            Bundle extras10 = getIntent().getExtras();
            Intent intent10 = new Intent(UsersAnswers10.this, CorrectAnswers10.class);
            intent10.putExtras(extras10);
            startActivity(intent10);
        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers10.this, MainActivity.class));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void shareText(View v){

        Bundle extras10 = getIntent().getExtras();
        score10 = extras10.getInt("score10");

        String text = "I scored "+ score10 + "/10 on T-J. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }



}
