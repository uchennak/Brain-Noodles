package com.dose.apps.brainnoodles.UsersAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.CorrectAnswers.CorrectAnswers11;

/**
 * Created by chiozokamalu on 12/7/17.
 */
public class UsersAnswers11 extends ActionBarActivity {
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

        Bundle extras11 = getIntent().getExtras();
        String[] usersAnswers11 = extras11.getStringArray("usersAnswers11");
        String[] isATOF11 = extras11.getStringArray("isATOF11");

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

        String score11S = extras11.getString("score11S");
        youScored.setText("  Score: " + score11S + "/10");


        resultView1.setText("1. " + usersAnswers11[0]);
        resultView2.setText("2. " + usersAnswers11[1]);
        resultView3.setText("3. " + usersAnswers11[2]);
        resultView4.setText("4. " + usersAnswers11[3]);
        resultView5.setText("5. " + usersAnswers11[4]);
        resultView6.setText("6. " + usersAnswers11[5]);
        resultView7.setText("7. " + usersAnswers11[6]);
        resultView8.setText("8. " + usersAnswers11[7]);
        resultView9.setText("9. " + usersAnswers11[8]);
        resultView10.setText("10. " + usersAnswers11[9]);



        resultViewCON1.setText(isATOF11[0]);
        resultViewCON2.setText(isATOF11[1]);
        resultViewCON3.setText(isATOF11[2]);
        resultViewCON4.setText(isATOF11[3]);
        resultViewCON5.setText(isATOF11[4]);
        resultViewCON6.setText(isATOF11[5]);
        resultViewCON7.setText(isATOF11[6]);
        resultViewCON8.setText(isATOF11[7]);
        resultViewCON9.setText(isATOF11[8]);
        resultViewCON10.setText(isATOF11[9]);

    };
    public void onButton1Click(View v) {

        if (v.getId() == R.id.testResultsButton) {
            Bundle extras11 = getIntent().getExtras();
            Intent intent11 = new Intent(UsersAnswers11.this, CorrectAnswers11.class);
            intent11.putExtras(extras11);
            startActivity(intent11);
        }

        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(UsersAnswers11.this, MainActivity.class));
        }

    }
    public void shareText(View v){

        Bundle extras11 = getIntent().getExtras();
        String score11S = extras11.getString("score11S");

        String text = "I scored "+ score11S + "/10 on T-K. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
