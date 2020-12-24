package com.dose.apps.brainnoodles.CorrectAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers13;


public class CorrectAnswers13 extends Activity {
    protected TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    protected TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    protected TextView youScored;
    String questions13[] = {
            "What is 1+1?",
            "What is the answer from the previous question?",
            "What is -1 - 1?",
            "What is the answer from the previous question?",
            "What is 2 x 2?",
            "What is 2^2?",
            "What is 2^3?",
            "What is (2^2)+(2^2)",
            "What is the answer from the previous question?",
            "Is this the last question?"};

    String[] correctA13 = {
            "B. 2",
            "B. 2",
            "B. -2",
            "B. -2",
            "A. 4",
            "A. 4",
            "A. 8",
            "A. 8",
            "A. 8",
            "A. Yes"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_answers);

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

        resultView1.setText("A1. " + correctA13[0]);
        resultView2.setText("A2. " + correctA13[1]);
        resultView3.setText("A3. " + correctA13[2]);
        resultView4.setText("A4. " + correctA13[3]);
        resultView5.setText("A5. " + correctA13[4]);
        resultView6.setText("A6. " + correctA13[5]);
        resultView7.setText("A7. " + correctA13[6]);
        resultView8.setText("A8. " + correctA13[7]);
        resultView9.setText("A9. " + correctA13[8]);
        resultView10.setText("A10. " + correctA13[9]);

//Questions
        q1View = ((TextView) findViewById(R.id.q1View));
        q2View = ((TextView) findViewById(R.id.q2View));
        q3View = ((TextView) findViewById(R.id.q3View));
        q4View = ((TextView) findViewById(R.id.q4View));
        q5View = ((TextView) findViewById(R.id.q5View));
        q6View = ((TextView) findViewById(R.id.q6View));
        q7View = ((TextView) findViewById(R.id.q7View));
        q8View = ((TextView) findViewById(R.id.q8View));
        q9View = ((TextView) findViewById(R.id.q9View));
        q10View = ((TextView) findViewById(R.id.q10View));

        q1View.setText("Q1. "+ questions13[0]);
        q2View.setText("Q2. "+ questions13[1]);
        q3View.setText("Q3. "+ questions13[2]);
        q4View.setText("Q4. "+ questions13[3]);
        q5View.setText("Q5. "+ questions13[4]);
        q6View.setText("Q6. "+ questions13[5]);
        q7View.setText("Q7. "+ questions13[6]);
        q8View.setText("Q8. "+ questions13[7]);
        q9View.setText("Q9. "+ questions13[8]);
        q10View.setText("Q10. "+ questions13[9]);

    }
    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras13 = getIntent().getExtras();
            Intent intent13 = new Intent(CorrectAnswers13.this, UsersAnswers13.class);
            intent13.putExtras(extras13);
            startActivity(intent13);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers13.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras13 = getIntent().getExtras();
        int score13 = extras13.getInt("score13");

        String text = "I scored "+ score13 + "/10 on T-M. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
