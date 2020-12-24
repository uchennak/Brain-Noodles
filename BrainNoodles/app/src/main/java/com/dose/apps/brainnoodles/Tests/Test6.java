package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers6;

public class Test6 extends ActionBarActivity {


         /*
  *Icremented Variables
  */

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score6 = 0;


    int iZero = 0;

    //Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber,textCounter;
    ImageView button1, button2, button3;

    /*
    *Questions Array
    */
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
            "Superman is from the planet....?", //Array 8
            "Mercedes-Benz headquarters is in which country?", //Array 9
    };

     /*
    *Button A
     */


    String[] answerTextA6 = {
            "Bicep",  //Array 0
            "Ker-nohl", //Array 1
            "05:30", //Array 2
            "Sheeps", //Array 3
            "Dripping Apps", //Array 4
            "Ants", //Array 5
            "Rankine", //Array 6
            "Cell membrane", //Array 7
            "Kypton", //Array 8
            "France" //Array 9
    };
     /*
    *Button B
     */


    String[] answerTextB6 = {
            "Tricep",  //Array 0
            "Cahl-in-ohl", //Array 1
            "17:00", //Array 2
            "Sheep", //Array 3
            "Tripping Apps", //Array 4
            "Anteaters", //Array 5
            "Celsius", //Array 6
            "Cell wall", //Array 7
            "Kryptonite", //Array 8
            "Germany" //Array 9
    };

     /*
    *Button C
     */


    String[] answerTextC6 = {
            "Forearm",  // Array 0
            "Kahl-in-ohl", // Array 1
            "17:30", // Array 2
            "Both A and B", // Array 3
            "DoseApps", // Array 4
            "Humans", // Array 5
            "Ohms", // Array 6
            "Nucleus", //Array 7
            "Kryp", //Array 8
            "USA"  //Array 9
    };

/*
    *User's Answer Choices
     */

    public String[] usersAnswers6 = {
            "", //Array 0
            "", //Array 1
            "", //Array 2
            "", //Array 3
            "", //Array 4
            "", //Array 5
            "", //Array 6
            "", //Array 7
            "", //Array 8
            "" //Array 9
    };

     /*
    * Is the user answers true or false
     */

    public String[] isATOF6 = {
            "", //Array 0
            "", //Array 1
            "", //Array 2
            "", //Array 3
            "", //Array 4
            "", //Array 5
            "", //Array 6
            "", //Array 7
            "", //Array 8
            "", //Array 9
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_page);

        // Button Initializations //

        button1 = ((ImageView) findViewById(R.id.button1));
        button2 = ((ImageView) findViewById(R.id.button2));
        button3 = ((ImageView) findViewById(R.id.button3));

        // TextView Initializations //


        answerViewA = ((TextView) findViewById(R.id.textView1));
        answerViewB = ((TextView) findViewById(R.id.textView2));
        answerViewC = ((TextView) findViewById(R.id.textView3));
        questionView = ((TextView) findViewById(R.id.questionView));
        questionView2 = ((TextView) findViewById(R.id.questionView2));
        questionNumber = (TextView) findViewById(R.id.questionNumber);

        String questionValueS = Integer.toString(questionValue);
        questionNumber.setText("Question " + questionValueS + ".");
        answerViewA.setText(answerTextA6[questionIndex]);
        answerViewB.setText(answerTextB6[questionIndex]);
        answerViewC.setText(answerTextC6[questionIndex]);
        questionView.setText(questions6[questionIndex]);

        textCounter = ((TextView)findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 29000, 1000);
        quizTimer.start();


    }

    public void onButton1Click(View v) {
        //Button Click Sound(Add this later)


        //Catching the User's answer choices//

            if (v.getId() == R.id.button1) {
                usersAnswers6[iZero] = answerTextA6[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers6[iZero] = answerTextB6[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers6[iZero] = answerTextC6[iZero];
            }

        /*
        *Determining if the users answers are True or False
         */


        if (questionValue == 1){
            if (v.getId() == R.id.button3){
                isATOF6[0] = "True";
                score6++;

            }else {
                isATOF6[0] = "False";
            }
        }

        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF6[1] = "True";
                score6++;

            }else {
                isATOF6[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button3){
                isATOF6[2] = "True";
                score6++;

            }else {
                isATOF6[2] = "False";
            }
        }

        if (questionValue == 4){
            if (v.getId() == R.id.button2){
                isATOF6[3] = "True";
                score6++;

            }else {
                isATOF6[3] = "False";
            }
        }

        if (questionValue == 5){
            if (v.getId() == R.id.button3){
                isATOF6[4] = "True";
                score6++;

            }else {
                isATOF6[4] = "False";
            }
        }

        if (questionValue == 6){
            if (v.getId() == R.id.button3){
                isATOF6[5] = "True";
                score6++;

            }else {
                isATOF6[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button3){
                isATOF6[6] = "True";
                score6++;

            }else {
                isATOF6[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF6[7] = "True";
                score6++;

            }else {
                isATOF6[7] = "False";
            }
        }

        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF6[8] = "True";
                score6++;

            }else {
                isATOF6[8] = "False";
            }
        }

        if (questionValue == 10){
            if (v.getId() == R.id.button2){
                isATOF6[9] = "True";
                score6++;

            }else {
                isATOF6[9] = "False";
            }
        }


        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions6.length) {

            //set the text to the next question
            questionView.setText(questions6[questionIndex]);

            //set the answerView(s) to the next answer options
            answerViewA.setText(answerTextA6[questionIndex]);
            answerViewB.setText(answerTextB6[questionIndex]);
            answerViewC.setText(answerTextC6[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//
            iZero++;
        }
        else {

//Pass intent and stop timer

            quizTimer.cancel();
            String score6S = Integer.toString(score6);

            Intent intent6 = new Intent(Test6.this, UsersAnswers6.class);
            intent6.putExtra("usersAnswers6", usersAnswers6);
            intent6.putExtra("isATOF6", isATOF6);
            intent6.putExtra("score6S", score6S);
            startActivity(intent6);
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();

        //Cancel the timer
        quizTimer.cancel();
    }

    @Override
    public void onStop(){
        super.onStop();

        //Pause the timer
        quizTimer.pause();
    }

    @Override
    public void onRestart(){
        super.onRestart();

        //Resume the timer
        quizTimer.resume();
    }
}