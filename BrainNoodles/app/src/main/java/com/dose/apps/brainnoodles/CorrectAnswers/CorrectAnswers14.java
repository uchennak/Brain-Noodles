package com.dose.apps.brainnoodles.CorrectAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers14;

/**
 * Created by Uchenna Kamalu
 */

public class CorrectAnswers14 extends Activity {
    protected TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    protected TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    protected TextView youScored;

    String[] questions14 = {
            "What is the chemical symbol for Silver?",
            "Trees absorb ...",
            "Toyota's headquarters are located in ...",
            "The keyboard shortcut to copy on a Mac is.",
            "The keyboard shortcut to paste on a Mac is",
            "The keyboard shortcut to copy on Windows is ...",
            "The keyboard shortcut to paste on a Windows is ...",
            "Avocadoes are actually  ...",
            "Lettuce is actually a ...",
            "Bell peppers are actually ..."

    };
    String[] correctA14 ={
       "A. Ag",
       "C. Both",
       "A. Japan",
       "A. Command + C",
       "B. Command + V",
       "A. Control + C",
       "B. Control + V",
       "A. Fruits",
       "B. Vegetable",
       "A. Fruits"
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

        resultView1.setText("A1. " + correctA14[0]);
        resultView2.setText("A2. " + correctA14[1]);
        resultView3.setText("A3. " + correctA14[2]);
        resultView4.setText("A4. " + correctA14[3]);
        resultView5.setText("A5. " + correctA14[4]);
        resultView6.setText("A6. " + correctA14[5]);
        resultView7.setText("A7. " + correctA14[6]);
        resultView8.setText("A8. " + correctA14[7]);
        resultView9.setText("A9. " + correctA14[8]);
        resultView10.setText("A10. " + correctA14[9]);

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

        q1View.setText("Q1. "+ questions14[0]);
        q2View.setText("Q2. "+ questions14[1]);
        q3View.setText("Q3. "+ questions14[2]);
        q4View.setText("Q4. "+ questions14[3]);
        q5View.setText("Q5. "+ questions14[4]);
        q6View.setText("Q6. "+ questions14[5]);
        q7View.setText("Q7. "+ questions14[6]);
        q8View.setText("Q8. "+ questions14[7]);
        q9View.setText("Q9. "+ questions14[8]);
        q10View.setText("Q10. "+ questions14[9]);
    }

    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras14 = getIntent().getExtras();
            Intent intent14 = new Intent(CorrectAnswers14.this, UsersAnswers14.class);
            intent14.putExtras(extras14);
            startActivity(intent14);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers14.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras14 = getIntent().getExtras();
        int score14 = extras14.getInt("score14");

        String text = "I scored "+ score14 + "/10 on T-N. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
