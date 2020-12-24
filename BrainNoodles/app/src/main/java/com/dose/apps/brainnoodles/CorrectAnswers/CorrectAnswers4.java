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
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers4;

public class CorrectAnswers4 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;

    //Questions Array


    String marsupial = "\"marsupial\"";
    String[] questions4 = {
            "How many letters are in the word " + marsupial + "?", //Array 0 (Question 1.)
            "Which of these animals is a marsupial?", //Array 1 (Question 2.)
            "A whale is a....", //Array 2, Question 3.
            "A horizontal line goes...", //Array 3, Question 4.
            "A synonym of refurbished is?", //Array 4, Question 5.
            "Which of these is not a unit of electricity?", //Array 5, Question 6.
            "A vertical line  ....", //Array 6, Question 7.
            "Which degree takes longer to achieve?", //Array 7, Question 8
            "The chemical symbol for Iron is ...", //Array 8, Question 9
            "What is another name for salt?", //Array 9, Question 10
    };

//Correct Answers

    String[] correctA4 = {
            "C. 9", //Array 0 (Question 1.)
            "A. Kangaroo ",  //Array 1 (Question 2.)
            "A. Mammal ",  //Array 2 (Question 3.)
            "A. Left/Right ",  //Array 3 (Question 4.)
            "B. Restored ",  //Array 4 (Question 5.)
            "A. Gigabyte ",  //Array 5 (Question 6.)
            "B. Goes up/down",  //Array 6 (Question 7.)
            "B. Masters ",  //Array 7 (Question 8.)
            "A. Fe",  //Array 8 (Question 9.)
            "A. Sodium chloride "  //Array 9 (Question 10.)

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



        resultView1.setText("A1. " + correctA4[0]);
        resultView2.setText("A2. " + correctA4[1]);
        resultView3.setText("A3. " + correctA4[2]);
        resultView4.setText("A4. " + correctA4[3]);
        resultView5.setText("A5. " + correctA4[4]);
        resultView6.setText("A6. " + correctA4[5]);
        resultView7.setText("A7. " + correctA4[6]);
        resultView8.setText("A8. " + correctA4[7]);
        resultView9.setText("A9. " + correctA4[8]);
        resultView10.setText("A10. " + correctA4[9]);


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

        q1View.setText("Q1. "+ questions4[0]);
        q2View.setText("Q2. "+ questions4[1]);
        q3View.setText("Q3. "+ questions4[2]);
        q4View.setText("Q4. "+ questions4[3]);
        q5View.setText("Q5. "+ questions4[4]);
        q6View.setText("Q6. "+ questions4[5]);
        q7View.setText("Q7. "+ questions4[6]);
        q8View.setText("Q8. "+ questions4[7]);
        q9View.setText("Q9. "+ questions4[8]);
        q10View.setText("Q10. "+ questions4[9]);


    }
    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras4 = getIntent().getExtras();
            Intent intent4 = new Intent(CorrectAnswers4.this, UsersAnswers4.class);
            intent4.putExtras(extras4);
            startActivity(intent4);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers4.this, MainActivity.class));

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras4 = getIntent().getExtras();
        String score4S = extras4.getString("score4S");

        String text = "I scored "+ score4S + "/10 on T-D. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
}