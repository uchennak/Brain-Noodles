package com.dose.apps.brainnoodles.CorrectAnswers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers10;

public class CorrectAnswers10 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

//Questions
    String[] questions10 = {
            "Which body of water doesn't contain freshwater?",  //Array 0
            "Who created the lightbulb?",  //Array
            "Audio is another term for....?",  //Array 2
            "3 strikes and you're...?",  //Array 3
            "Grapes grow on a ...?",  //Array 4
            "Raisins are dried up...",  //Array 5
            "On a graph, the x-axis goes ....", //Array 6
            "On a graph, the x-axis goes ...", //Array 7
            "On a graph, the y-axis goes ....", //Array 8
            "On a graph, the y-axis goes ...", //Array 9

    };

//Answers
    String[] correctA10= {
        "B. Ocean ",
        "A. Thomas Edison",
        "A. Sound",
        "A. Out",
        "A. Vine",
        "C. Grapes",
        "A. Left-right",
        "A. Horizontally",
        "C. Down-Up",
        "B. Vertically"

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

        resultView1.setText("A1. " + correctA10[0]);
        resultView2.setText("A2. " + correctA10[1]);
        resultView3.setText("A3. " + correctA10[2]);
        resultView4.setText("A4. " + correctA10[3]);
        resultView5.setText("A5. " + correctA10[4]);
        resultView6.setText("A6. " + correctA10[5]);
        resultView7.setText("A7. " + correctA10[6]);
        resultView8.setText("A8. " + correctA10[7]);
        resultView9.setText("A9. " + correctA10[8]);
        resultView10.setText("A10. " + correctA10[9]);

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

        q1View.setText("Q1. "+ questions10[0]);
        q2View.setText("Q2. "+ questions10[1]);
        q3View.setText("Q3. "+ questions10[2]);
        q4View.setText("Q4. "+ questions10[3]);
        q5View.setText("Q5. "+ questions10[4]);
        q6View.setText("Q6. "+ questions10[5]);
        q7View.setText("Q7. "+ questions10[6]);
        q8View.setText("Q8. "+ questions10[7]);
        q9View.setText("Q9. "+ questions10[8]);
        q10View.setText("Q10. "+ questions10[9]);

    }


    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras10 = getIntent().getExtras();
            Intent intent10 = new Intent(CorrectAnswers10.this, UsersAnswers10.class);
            intent10.putExtras(extras10);
            startActivity(intent10);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers10.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras10 = getIntent().getExtras();
        int score10 = extras10.getInt("score10");

        String text = "I scored "+ score10 + "/10 on T-J. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}


