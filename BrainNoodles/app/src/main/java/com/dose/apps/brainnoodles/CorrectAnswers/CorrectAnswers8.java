package com.dose.apps.brainnoodles.CorrectAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers8;

public class CorrectAnswers8 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;

//Questions Array

    String p = "\"P\"";
    String o = "\"O\"";
    String j = "\"J\"";
    String q = "\"Q\"";
    String w = "\"W\"";


    String questions8[] = {
            "Which letter comes before " + p +"?",  //Array 0
            "Which letter comes after " + o +"?",  //Array 1
            "Which letter comes after " + q +"?", //  Array 2
            "Which letter comes before " + w + "?", //Array 3
            "Which letter comes after " + j + "?", //Array 4
            "Which of these numbers come right before 0.02?", //Array 5
            "Which of these numbers come right after 44 x 0?", //Array 6
            "Which of these numbers come right before 0.01? ", //Array 7
            "Which Question number were you on before this one?", //Array 8
            "Which level is this?" //Array 9
    };
    String[] correctA8 = {
            "A. O",
            "C. P",
            "A. R",
            "B. V",
            "A. K",
            "A. 0.01",
            "C. 0.01",
            "A. 0",
            "A. 8",
            "A. T-H",
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



        resultView1.setText("A1. " + correctA8[0]);
        resultView2.setText("A2. " + correctA8[1]);
        resultView3.setText("A3. " + correctA8[2]);
        resultView4.setText("A4. " + correctA8[3]);
        resultView5.setText("A5. " + correctA8[4]);
        resultView6.setText("A6. " + correctA8[5]);
        resultView7.setText("A7. " + correctA8[6]);
        resultView8.setText("A8. " + correctA8[7]);
        resultView9.setText("A9. " + correctA8[8]);
        resultView10.setText("A10. " + correctA8[9]);


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

        q1View.setText("Q1. "+ questions8[0]);
        q2View.setText("Q2. "+ questions8[1]);
        q3View.setText("Q3. "+ questions8[2]);
        q4View.setText("Q4. "+ questions8[3]);
        q5View.setText("Q5. "+ questions8[4]);
        q6View.setText("Q6. "+ questions8[5]);
        q7View.setText("Q7. "+ questions8[6]);
        q8View.setText("Q8. "+ questions8[7]);
        q9View.setText("Q9. "+ questions8[8]);
        q10View.setText("Q10. "+ questions8[9]);

    }
    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras8 = getIntent().getExtras();
            Intent intent8 = new Intent(CorrectAnswers8.this, UsersAnswers8.class);
            intent8.putExtras(extras8);
            startActivity(intent8);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers8.this, MainActivity.class));

        }
    }
    public void shareText(View v){

        Bundle extras8 = getIntent().getExtras();
        int score8 = extras8.getInt("score8");

        String text = "I scored "+ score8 + "/10 on T-H. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}