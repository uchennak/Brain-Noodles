package com.dose.apps.brainnoodles.CorrectAnswers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers11;

/**
 * Created by chiozokamalu on 12/7/17.
 */
public class CorrectAnswers11 extends Activity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    /*  Questions  */

    String[] questions11 = {"Bananas are ripe when...",
            "Energy can never be......",
            "People who uses both left and right hands are...",
            "What is the name of the galaxy we live in?",
            "Is a tomato a fruit?",
            "Onions make you cry because of..",
            "College rule notebooks have more lines per page than wide rule.",
            "What is Barack Obama's middle name?",
            "Donald Trump's slogan is...",
            "What level is this?"
    };
    String[] correctA11={"B. Yellow",
            "A. Destroyed",
            "A. Ambidextrous",
            "A. Milky Way",
            "B. Of Course",
            "B. Released gas",
            "B. True",
            "B. Hussein",
            "A. Make America great again",
            "C. T-K"

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

        resultView1.setText("A1. " + correctA11[0]);
        resultView2.setText("A2. " + correctA11[1]);
        resultView3.setText("A3. " + correctA11[2]);
        resultView4.setText("A4. " + correctA11[3]);
        resultView5.setText("A5. " + correctA11[4]);
        resultView6.setText("A6. " + correctA11[5]);
        resultView7.setText("A7. " + correctA11[6]);
        resultView8.setText("A8. " + correctA11[7]);
        resultView9.setText("A9. " + correctA11[8]);
        resultView10.setText("A10. " + correctA11[9]);

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

        q1View.setText("Q1. "+ questions11[0]);
        q2View.setText("Q2. "+ questions11[1]);
        q3View.setText("Q3. "+ questions11[2]);
        q4View.setText("Q4. "+ questions11[3]);
        q5View.setText("Q5. "+ questions11[4]);
        q6View.setText("Q6. "+ questions11[5]);
        q7View.setText("Q7. "+ questions11[6]);
        q8View.setText("Q8. "+ questions11[7]);
        q9View.setText("Q9. "+ questions11[8]);
        q10View.setText("Q10. "+ questions11[9]);

    }
    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras11 = getIntent().getExtras();
            Intent intent11 = new Intent(CorrectAnswers11.this, UsersAnswers11.class);
            intent11.putExtras(extras11);
            startActivity(intent11);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers11.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras11 = getIntent().getExtras();
        int score11 = extras11.getInt("score11");

        String text = "I scored "+ score11 + "/10 on T-K. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}
