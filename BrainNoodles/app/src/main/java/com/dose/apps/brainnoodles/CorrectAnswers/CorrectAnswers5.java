package com.dose.apps.brainnoodles.CorrectAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers5;


public class CorrectAnswers5 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;

    //Questions Array

    //Questions
    String wXH = "\"w x h\"";
    String exe = "\".exe\"";
    String aU = "\"Au\"";
    String[] questions5 = {
            "Where is Christopher Columbus from?",
            "Which macronutrient is the most energy dense?",
            "In algebra, what does " + wXH + " stand for?",
            exe + "files are limited to which computers?",
            "Which word doesn't belong here?",
            "Does 1.1 + 1.1 = 2.1? (Y for No, N for Yes)",
            "What does " + aU + " stand for in chemistry?",
            "Which is not a mobile phone carrier?",
            "Another name for water is?",
            "Which of the following isn't a palindrome?"
    };

    String[] correctA5 = {
            "B. Italy",
            "A. Fat",
            "B. Width times height",
            "A. Windows",
            "C. Sodium chloride",
            "A. Y (no)",
            "A. Gold",
            "B. Samsung",
            "A. H20",
            "C. Robert"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_answers);

   /*
    *User's answers
   */

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



        resultView1.setText("A1. " + correctA5[0]);
        resultView2.setText("A2. " + correctA5[1]);
        resultView3.setText("A3. " + correctA5[2]);
        resultView4.setText("A4. " + correctA5[3]);
        resultView5.setText("A5. " + correctA5[4]);
        resultView6.setText("A6. " + correctA5[5]);
        resultView7.setText("A7. " + correctA5[6]);
        resultView8.setText("A8. " + correctA5[7]);
        resultView9.setText("A9. " + correctA5[8]);
        resultView10.setText("A10. " + correctA5[9]);


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

        q1View.setText("Q1. "+ questions5[0]);
        q2View.setText("Q2. "+ questions5[1]);
        q3View.setText("Q3. "+ questions5[2]);
        q4View.setText("Q4. "+ questions5[3]);
        q5View.setText("Q5. "+ questions5[4]);
        q6View.setText("Q6. "+ questions5[5]);
        q7View.setText("Q7. "+ questions5[6]);
        q8View.setText("Q8. "+ questions5[7]);
        q9View.setText("Q9. "+ questions5[8]);
        q10View.setText("Q10. "+ questions5[9]);


    }
    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras5 = getIntent().getExtras();
            Intent intent5 = new Intent(CorrectAnswers5.this, UsersAnswers5.class);
            intent5.putExtras(extras5);
            startActivity(intent5);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers5.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras5 = getIntent().getExtras();
        String score5S = extras5.getString("score5S");

        String text = "I scored "+ score5S + "/10 on T-E. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

    }

