package com.dose.apps.brainnoodles.CorrectAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers1;


public class CorrectAnswers1 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;




    Button homePageButton, userAnswersButton ;

     String halfQues8 = "They got upset when he took ___ stuff.";
      String[] questions1 =
    {
        "How many half days are in 1 day?", //Array 0
                "4 pears were on sale for $5. How much was each pear?", //Array 1 /
                "What is the temperature right below 0°F?", //Array 2 //
                "How long it take to reach 60 miles if going 60mph?", //Array 3 //
                "How long does it take for Summer to get to the next Summer?", //Array  4
                "What is 100% of 100?", //Array  5//
                "What weighs more. 1 pound of feathers, or 1 pound of metal?", //Array 6 //
                 halfQues8 , //Array 7 //
                "How many licks to get to the center of a tootsie pop?", //Array 8
                "Which statement is true?", //Array 9


    };

    String[] correctA1 = {
            "A. 2", //Array 0
            "B. 1.25", //Array1
            "B. -1°F", //Array 2
            "C. 1 hour", //Array 3
            "A. 12 months", //Array 4
            "A. 100", //Array 5
            "C. They weigh the same", //Array 6
            "A. their",//Array 7
            "C. More than 20", //Array 8
            "B. Dense clouds = less sunlight"// Array 9


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_answers);


   /*
    *Correct answers
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




        resultView1.setText("A1. " +correctA1[0]);
        resultView2.setText("A2. " +correctA1[1]);
        resultView3.setText("A3. " +correctA1[2]);
        resultView4.setText("A4. " +correctA1[3]);
        resultView5.setText("A5. " +correctA1[4]);
        resultView6.setText("A6. " +correctA1[5]);
        resultView7.setText("A7. " +correctA1[6]);
        resultView8.setText("A8. " +correctA1[7]);
        resultView9.setText("A9. " +correctA1[8]);
        resultView10.setText("A10. " +correctA1[9]);


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

        q1View.setText("Q1. "+ questions1[0]);
        q2View.setText("Q2. "+ questions1[1]);
        q3View.setText("Q3. "+ questions1[2]);
        q4View.setText("Q4. "+ questions1[3]);
        q5View.setText("Q5. "+ questions1[4]);
        q6View.setText("Q6. "+ questions1[5]);
        q7View.setText("Q7. "+ questions1[6]);
        q8View.setText("Q8. "+ questions1[7]);
        q9View.setText("Q9. "+ questions1[8]);
        q10View.setText("Q10. "+ questions1[9]);





    }

    public void onButton1Click(View v) {

        if (v.getId() == R.id.userAnswersButton) {


            Bundle extras1 = getIntent().getExtras();
            Intent intent1 = new Intent(CorrectAnswers1.this, UsersAnswers1.class);

            intent1.putExtras(extras1);
            startActivity(intent1);
        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers1.this, MainActivity.class));

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras1 = getIntent().getExtras();
        String score1S = extras1.getString("score1S");

        String text = "I scored "+ score1S + "/10 on T-A. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
    }
