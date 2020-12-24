package com.dose.apps.brainnoodles.CorrectAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers12;

/**
 * Created by chiozokamalu on 12/13/17.
 */
public class CorrectAnswers12 extends Activity {
    protected TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    protected TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    protected TextView youScored;
    String W = "\"W\"";
//Questions

    String[] questions12 = {
            "Spiciness is measured in ... ",  //Array 0
            "An Acronym is an ..?",  //Array
            "Islands are created by ...",  //Array 2
            "What is 1+(-1)?",  //Array 3
            "What is -2 x -2?",  //Array 4
            "How many syllables does " + W + " have?",  //Array 5
            "Is the sun a star?", //Array 6
            "Is the moon a star?", //Array 7
            "Killer whales are actually...", //Array 8
            "Whales are...", //Array 9

    };
    String[] correctA12={
            "A. Scoville Units",
            "A. Abbreviation",
            "A. Volcanoes",
            "B. 0",
            "B. 4",
            "B. 3",
            "B. Yes",
            "B. No",
            "A. Dolphins",
            "A. Mammals"

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

        resultView1.setText("A1. " + correctA12[0]);
        resultView2.setText("A2. " + correctA12[1]);
        resultView3.setText("A3. " + correctA12[2]);
        resultView4.setText("A4. " + correctA12[3]);
        resultView5.setText("A5. " + correctA12[4]);
        resultView6.setText("A6. " + correctA12[5]);
        resultView7.setText("A7. " + correctA12[6]);
        resultView8.setText("A8. " + correctA12[7]);
        resultView9.setText("A9. " + correctA12[8]);
        resultView10.setText("A10. " + correctA12[9]);


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

        q1View.setText("Q1. "+ questions12[0]);
        q2View.setText("Q2. "+ questions12[1]);
        q3View.setText("Q3. "+ questions12[2]);
        q4View.setText("Q4. "+ questions12[3]);
        q5View.setText("Q5. "+ questions12[4]);
        q6View.setText("Q6. "+ questions12[5]);
        q7View.setText("Q7. "+ questions12[6]);
        q8View.setText("Q8. "+ questions12[7]);
        q9View.setText("Q9. "+ questions12[8]);
        q10View.setText("Q10. "+ questions12[9]);

    }
    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras12 = getIntent().getExtras();
            Intent intent12 = new Intent(CorrectAnswers12.this, UsersAnswers12.class);
            intent12.putExtras(extras12);
            startActivity(intent12);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers12.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras12 = getIntent().getExtras();
        int score12 = extras12.getInt("score12");

        String text = "I scored "+ score12 + "/10 on T-L. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
