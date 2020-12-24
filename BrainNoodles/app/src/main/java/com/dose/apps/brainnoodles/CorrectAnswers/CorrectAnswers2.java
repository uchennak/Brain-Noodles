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
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers2;


public class CorrectAnswers2 extends ActionBarActivity {
    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;


    Button homePageButton, userAnswersButton;

    String[] questions2 = {"Sound is measured in?", //Array 0
            "What is the freezing point of water?", //Array 1
            "What is the boiling point of water?", //Array 2
            "Where is the Eiffel Tower located?", //Array 3
            "Which of the following are all primary colors?", //Array 4
            "Which statement makes more sense?", //Array 5
            "Which fraction is the greatest?", //Array 6
            "The plural form of Goose is?", //Array 7
            "Baking soda is?", //Array 8
            "Which should you do first when going to drive a car?" //Array 9
    };

    String[] correctA2 = {
            "B. Decibels", //Array 0
            "A. 32°F", //Array 1
            "A. 212°F", //Array 2
            "A. France", //Array 3
            "C. Red, Blue, and Yellow", //Array 4
            "A. Quotient is to division", //Array 5
            "C. 100/1", //Array 6
            "B. Geese", //Array 7
            "A. A base", //Array 8
            "B. Check mirrors" //Array 9

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



        resultView1.setText("A1. " +correctA2[0]);
        resultView2.setText("A2. " +correctA2[1]);
        resultView3.setText("A3. " +correctA2[2]);
        resultView4.setText("A4. " +correctA2[3]);
        resultView5.setText("A5. " +correctA2[4]);
        resultView6.setText("A6. " +correctA2[5]);
        resultView7.setText("A7. " +correctA2[6]);
        resultView8.setText("A8. " +correctA2[7]);
        resultView9.setText("A9. " +correctA2[8]);
        resultView10.setText("A10. " +correctA2[9]);

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

        q1View.setText("Q1. "+ questions2[0]);
        q2View.setText("Q2. "+ questions2[1]);
        q3View.setText("Q3. "+ questions2[2]);
        q4View.setText("Q4. "+ questions2[3]);
        q5View.setText("Q5. "+ questions2[4]);
        q6View.setText("Q6. "+ questions2[5]);
        q7View.setText("Q7. "+ questions2[6]);
        q8View.setText("Q8. "+ questions2[7]);
        q9View.setText("Q9. "+ questions2[8]);
        q10View.setText("Q10. "+ questions2[9]);

 }

    public void onButton1Click(View v) {
     
        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras2 = getIntent().getExtras();
            Intent intent2 = new Intent(CorrectAnswers2.this, UsersAnswers2.class);

            intent2.putExtras(extras2);
            startActivity(intent2);

        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers2.this, MainActivity.class));

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }public void shareText(View v){

        Bundle extras2 = getIntent().getExtras();
        String score2S = extras2.getString("score2S");

        String text = "I scored "+ score2S + "/10 on T-B. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }
    }

