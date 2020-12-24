package com.dose.apps.brainnoodles.CorrectAnswers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers7;

public class CorrectAnswers7 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;


//Questions Array

    String corndog = "\"corndog\"";
    String pi = "\"pi\"";
    String thisNumber = "\"2.840\"";
    String questions7[] ={
            "What is Cinco de Mayo?",  //Array 0
            "Which snake is venomous?",  //Array 1
            "Which formula converts Fahrenheit to Celcius?", //  Array 2
            "2 negatives makes a...?", //Array 3
            " A negative an a positive makes a...?", //Array 4
            "Which word is not "+ corndog +" unscrambled?", //Array 5
            "Round "+ thisNumber + " to the nearest tenth", //Array 6
            "Which one of these is not "+pi , //Array 7
            "What fruit does SpongeBob live in?", //Array 8
            "Acceleration is ...?" //Array 9

    };


    String[] correctA7 = {
            "A. The 5th of May",
            "C. Chain Viper",
            "C. C = (°F − 32) x 5/9",
            "B. Positive",
            "C. Negative",
            "C. orcgnodb",
            "A. 2.8",
            "C. Blueberry pie",
            "C. Pineapple",
            "B. The rate that speed is increasing",
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



        resultView1.setText("A1. " + correctA7[0]);
        resultView2.setText("A2. " + correctA7[1]);
        resultView3.setText("A3. " + correctA7[2]);
        resultView4.setText("A4. " + correctA7[3]);
        resultView5.setText("A5. " + correctA7[4]);
        resultView6.setText("A6. " + correctA7[5]);
        resultView7.setText("A7. " + correctA7[6]);
        resultView8.setText("A8. " + correctA7[7]);
        resultView9.setText("A9. " + correctA7[8]);
        resultView10.setText("A10. " + correctA7[9]);


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

        q1View.setText("Q1. "+ questions7[0]);
        q2View.setText("Q2. "+ questions7[1]);
        q3View.setText("Q3. "+ questions7[2]);
        q4View.setText("Q4. "+ questions7[3]);
        q5View.setText("Q5. "+ questions7[4]);
        q6View.setText("Q6. "+ questions7[5]);
        q7View.setText("Q7. "+ questions7[6]);
        q8View.setText("Q8. "+ questions7[7]);
        q9View.setText("Q9. "+ questions7[8]);
        q10View.setText("Q10. "+ questions7[9]);

    }
    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras7 = getIntent().getExtras();
            Intent intent7 = new Intent(CorrectAnswers7.this, UsersAnswers7.class);
            intent7.putExtras(extras7);
            startActivity(intent7);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers7.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras7 = getIntent().getExtras();
        int score7 = extras7.getInt("score7");

        String text = "I scored "+ score7 + "/10 on T-G. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
