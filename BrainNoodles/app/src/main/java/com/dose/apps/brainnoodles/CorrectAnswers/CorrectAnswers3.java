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
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers3;

public class CorrectAnswers3 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;


    String[] questions3 = {
            "Which is the fastest animal?",    //Array 0 (Question 1.) if v.getId() is button A/1

            "Nigeria is a country in?", //Array 1 (Question 2.) if v.getId() is button A/1

            "Which of the following is not a fruit?",  //Array 2 (Question 3.) if v.getId() is button C/3

            "Which of the following is a Mexican dish?", //Array 3 (Question 4.) if v.getId() is button B/2

            "What are synonyms?", //Array 4 (Question 5.) if v.getId() is button A/1

            "Martin Luther King Jr. was an?", //Array 5 (Question 6.) if v.getId() is A/1

            "What is the largest country in South America?", //Array 6 (Question 7.) if v.getId() is B/2

            "The country Ecuador got is name from ..",  //Array 7 (Question 8.) if v.getId is C/3

            "What exercise directly affects the arms?", //Array 8 (Question 9.) if v.getId is B/2

            "Which of the following are all warm colors?", //Array 9 (Question 10.) if v.getId is A/1
    };

    String equator = "\"equator\"";
    String[] correctA3= {
            "A. Cheetah", //Array 0 (Question 1.)
            "A. Africa",  //Array 1 (Question 2.)
            "C. Juicy Fruit",  //Array 2 (Question 3.)
            "B. Enchilada",  //Array 3 (Question 4.)
            "A. Different words with similar meanings",  //Array 4 (Question 5.)
            "A. African American",  //Array 5 (Question 6.)
            "B. Brazil",  //Array 6 (Question 7.)
            "C. The spanish word for " + equator,  //Array 7 (Question 8.)
            "B. Bench press",  //Array 8 (Question 9.)
            "A. Yellow, Red, and Orange"  //Array 9 (Question 10.)
    };@Override
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


        resultView1.setText("A1. " +correctA3[0]);
        resultView2.setText("A2. " +correctA3[1]);
        resultView3.setText("A3. " +correctA3[2]);
        resultView4.setText("A4. " +correctA3[3]);
        resultView5.setText("A5. " +correctA3[4]);
        resultView6.setText("A6. " +correctA3[5]);
        resultView7.setText("A7. " +correctA3[6]);
        resultView8.setText("A8. " +correctA3[7]);
        resultView9.setText("A9. " +correctA3[8]);
        resultView10.setText("A10. " +correctA3[9]);


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

        q1View.setText("Q1. "+ questions3[0]);
        q2View.setText("Q2. "+ questions3[1]);
        q3View.setText("Q3. "+ questions3[2]);
        q4View.setText("Q4. "+ questions3[3]);
        q5View.setText("Q5. "+ questions3[4]);
        q6View.setText("Q6. "+ questions3[5]);
        q7View.setText("Q7. "+ questions3[6]);
        q8View.setText("Q8. "+ questions3[7]);
        q9View.setText("Q9. "+ questions3[8]);
        q10View.setText("Q10. "+ questions3[9]);


    }

    public void onButton1Click(View v) {



        if (v.getId() == R.id.userAnswersButton) {
           Bundle extras3 = getIntent().getExtras();
            Intent intent3 = new Intent(CorrectAnswers3.this, UsersAnswers3.class);
            intent3.putExtras(extras3);
            startActivity(intent3);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers3.this, MainActivity.class));

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras3 = getIntent().getExtras();
        String score3S = extras3.getString("score3S");

        String text = "I scored "+ score3S + "/10 on T-C. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Send with"));
    }

}
