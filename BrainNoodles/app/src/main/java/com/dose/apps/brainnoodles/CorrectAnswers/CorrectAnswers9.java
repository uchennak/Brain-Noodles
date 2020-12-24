package com.dose.apps.brainnoodles.CorrectAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers9;

public class CorrectAnswers9 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;



    //Questions
    String zucchini = "\"zucchini\"";
    String sugar = "\"sugar\"";
    String[] questions9 = {
            "You bend over and coins fall out of your chest pocket. What should you do next?",
            "Which day comes 2 days after Saturday?",
            "Which definition explains cohesion?",
            "Which definition explains adhesion",
            "Is " +zucchini+ " the correct spelling of "+zucchini+"? (Y for no, N for yes)",
            "What is spanish for "+sugar+"?",
            "What is the capital of Idaho?",
            "Idaho is located on which region of the USA?",
            "What are the 4 cardinal directions?",
            "What are the 4 intermediate directions?",

    };

    String[] correctA9 = {
            "B. Close zipper then pickup coins",
            "C. Monday",
            "A. Similar matter sticking together",
            "B. Dissimilar matter sticking together",
            "A. N",
            "C. Azúcar",
            "A. Boise",
            "A. Midwest",
            "A. North, South, East, West",
            "A. Northwest, Southwest, Northeast, Southeast"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_answers);

//User's answers

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

        resultView1.setText("A1. " + correctA9[0]);
        resultView2.setText("A2. " + correctA9[1]);
        resultView3.setText("A3. " + correctA9[2]);
        resultView4.setText("A4. " + correctA9[3]);
        resultView5.setText("A5. " + correctA9[4]);
        resultView6.setText("A6. " + correctA9[5]);
        resultView7.setText("A7. " + correctA9[6]);
        resultView8.setText("A8. " + correctA9[7]);
        resultView9.setText("A9. " + correctA9[8]);
        resultView10.setText("A10. " + correctA9[9]);

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

        q1View.setText("Q1. "+ questions9[0]);
        q2View.setText("Q2. "+ questions9[1]);
        q3View.setText("Q3. "+ questions9[2]);
        q4View.setText("Q4. "+ questions9[3]);
        q5View.setText("Q5. "+ questions9[4]);
        q6View.setText("Q6. "+ questions9[5]);
        q7View.setText("Q7. "+ questions9[6]);
        q8View.setText("Q8. "+ questions9[7]);
        q9View.setText("Q9. "+ questions9[8]);
        q10View.setText("Q10. "+ questions9[9]);

    }
    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras9 = getIntent().getExtras();
            Intent intent9 = new Intent(CorrectAnswers9.this, UsersAnswers9.class);
            intent9.putExtras(extras9);
            startActivity(intent9);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers9.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras9 = getIntent().getExtras();
        int score9 = extras9.getInt("score9");

        String text = "I scored "+ score9 + "/10 on T-I. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
