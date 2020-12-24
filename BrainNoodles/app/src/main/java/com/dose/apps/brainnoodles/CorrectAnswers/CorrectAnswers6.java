package com.dose.apps.brainnoodles.CorrectAnswers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers6;

public class CorrectAnswers6 extends ActionBarActivity {

    TextView resultView1, resultView2, resultView3, resultView4, resultView5,
            resultView6, resultView7, resultView8, resultView9, resultView10;
    TextView q1View, q2View, q3View, q4View, q5View, q6View, q7View, q8View,
            q9View, q10View;
    TextView youScored;

    Button homePageButton, userAnswersButton;


    String colonel = "\"colonel\"";
    String sheep = "\"sheep\"";
    String[] questions6 = {
            "Which body part is closer to the hand?", //Array 0
            "How do you pronounce the word " + colonel + "?", //Array 1
            "What is 5:30 pm in military time?", //Array 2
            "What is the plural form of " + sheep, //Array 3
            "Brain Noodles is owned by?", //Array 4
            "Anthropology is the study of?", //Array 5
            "Which word doesn't belong here?", //Array 6
            "Animal cells don't have a .... ?", //Array 7
            "Superman is from the planet..?", //Array 8
            "Mercedes-Benz headquarters is in which country", //Array 9
    };

    String[] correctA6 = {
      "C. Forearm",
      "A. Ker-nohl",
            "C. 17:30",
            "B. Sheep",
            "C. DoseApps",
            "C. Humans",
            "C. Ohms",
            "B. Cell wall",
            "A. Krypton",
            "B. Germany",
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



        resultView1.setText("A1. " + correctA6[0]);
        resultView2.setText("A2. " + correctA6[1]);
        resultView3.setText("A3. " + correctA6[2]);
        resultView4.setText("A4. " + correctA6[3]);
        resultView5.setText("A5. " + correctA6[4]);
        resultView6.setText("A6. " + correctA6[5]);
        resultView7.setText("A7. " + correctA6[6]);
        resultView8.setText("A8. " + correctA6[7]);
        resultView9.setText("A9. " + correctA6[8]);
        resultView10.setText("A10. " + correctA6[9]);


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

        q1View.setText("Q1. "+ questions6[0]);
        q2View.setText("Q2. "+ questions6[1]);
        q3View.setText("Q3. "+ questions6[2]);
        q4View.setText("Q4. "+ questions6[3]);
        q5View.setText("Q5. "+ questions6[4]);
        q6View.setText("Q6. "+ questions6[5]);
        q7View.setText("Q7. "+ questions6[6]);
        q8View.setText("Q8. "+ questions6[7]);
        q9View.setText("Q9. "+ questions6[8]);
        q10View.setText("Q10. "+ questions6[9]);

}

    public void onButton1Click(View v) {


        if (v.getId() == R.id.userAnswersButton) {
            Bundle extras6 = getIntent().getExtras();
            Intent intent6 = new Intent(CorrectAnswers6.this, UsersAnswers6.class);
            intent6.putExtras(extras6);
            startActivity(intent6);


        }
        if (v.getId() == R.id.homePageButton) {
            startActivity(new Intent(CorrectAnswers6.this, MainActivity.class));

        }
    }

    public void shareText(View v){

        Bundle extras6 = getIntent().getExtras();
        String score6S = extras6.getString("score6S");

        String text = "I scored "+ score6S + "/10 on T-F. What did you get? Download the Brain Noodles App http://bit.ly/1BUun0E";
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra (Intent.EXTRA_TEXT, text);
        intentShare.setType("text/plain");
        startActivity(Intent.createChooser(intentShare, "Share with"));
    }

}
