package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers5;

public class Test5 extends ActionBarActivity {


//Icremented Variables


    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score5 = 0;


    int iZero = 0;

    //Non-incremented variables


    QuizTimer quizTimer;

    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber,textCounter;
    ImageView button1, button2, button3;


    //Questions
    String wXH = "\"w x h\"";
    String exe = "\".exe\"";
    String aU = "\"Au\"";
    String[] questions5 = {
            "Where is Christopher Columbus from?",
            "Which macronutrient is the most energy dense?",
            "In algebra, what does " + wXH + " stand for?",
            exe + " files are limited to which computers?",
            "Which word doesn't belong here?",
            "Does 1.1 + 1.1 = 2.1? (Y for No, N for Yes)",
            "What does " + aU + " stand for in chemistry?",
            "Which is not a mobile phone carrier?",
            "Another name for water is?",
            "Which of the following isn't a palindrome?"
    };

//AnswerButtonA

    String[] answerTextA5 = {
            "Columbus, Ohio", //Array 0
            "Fat", //Array 1
            "Wait times height", //Array 2
            "Windows", //Array 3
            "Fructose", //Array 4
            "Y", //Array 5
            "Gold", // Array 6
            "At&t", //Array 7
            "H2O", //Array 8
            "1991" //Array 9
    };


    //AnswerButtonB

    String[] answerTextB5 = {
            "Italy", //Array 0
            "Protein", //Array 1
            "Width times height", //Array 2
            "Macintosh", //Array 3
            "Glucose", //Array 4
            "N", //Array 5
            "Autumn", //Array 6
            "Samsung", //Array 7
            "H2O2", //Array 8
            "Anna" //Array 9
    };

    //AnswerButtonC

    String[] answerTextC5 = {
            "Columbia", //Array 0
            "Carbohydrate", //Array 1
            "Width times harp", //Array 2
            "Both", //Array 3
            "Sodium chloride", //Array 4
            "Neither is correct", //Array 5
            "Aurora", //Array 6
            "Verizon", //Array 7
            "W20", //Array 8
            "Robert" //Array 9
    };







   //User's Answer Choices


    public String[] usersAnswers5 = {
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


    //Is the user answers true or false


    public String[] isATOF5 = {
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
        answerViewA.setText(answerTextA5[questionIndex]);
        answerViewB.setText(answerTextB5[questionIndex]);
        answerViewC.setText(answerTextC5[questionIndex]);
        questionView.setText(questions5[questionIndex]);

        textCounter = ((TextView)findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 30000, 1000);
        quizTimer.start();


    }

    public void onButton1Click(View v) {
//Button Click Sound



        //Catching the User's answer choices//

            if (v.getId() == R.id.button1) {
                usersAnswers5[iZero] = answerTextA5[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers5[iZero] = answerTextB5[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers5[iZero] = answerTextC5[iZero];
            }



        /*
        *Determining if the users answers are True or False
         */

        if (questionValue == 1){
            if (v.getId() == R.id.button2){
                isATOF5[0] = "True";
                score5++;

            }else {
                isATOF5[0] = "False";
            }
        }

        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF5[1] = "True";
                score5++;

            }else {
                isATOF5[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button2){
                isATOF5[2] = "True";
                score5++;

            }else {
                isATOF5[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button1){
                isATOF5[3] = "True";
                score5++;

            }else {
                isATOF5[3] = "False";
            }
        }

        if (questionValue == 5){
            if (v.getId() == R.id.button3){
                isATOF5[4] = "True";
                score5++;

            }else {
                isATOF5[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button1){
                isATOF5[5] = "True";
                score5++;

            }else {
                isATOF5[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button1){
                isATOF5[6] = "True";
                score5++;

            }else {
                isATOF5[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF5[7] = "True";
                score5++;

            }else {
                isATOF5[7] = "False";
            }
        }

        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF5[8] = "True";
                score5++;

            }else {
                isATOF5[8] = "False";
            }
        }

        if (questionValue == 10){
            if (v.getId() == R.id.button3){
                isATOF5[9] = "True";
                score5++;

            }else {
                isATOF5[9] = "False";
            }
        }


        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions5.length
                )

        {
            questionView.setText(questions5[questionIndex]); // set the text to the next question



        /*
         * set the answerView(s) to the next answer options
         */
            answerViewA.setText(answerTextA5[questionIndex]);
            answerViewB.setText(answerTextB5[questionIndex]);
            answerViewC.setText(answerTextC5[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

//Incrementing Needed to catch users Answers//
            iZero++;
        }
        else {
//Pass intent and stop timer

            quizTimer.cancel();
            String score5S = Integer.toString(score5);

            Intent intent5 = new Intent(Test5.this, UsersAnswers5.class);
            intent5.putExtra("usersAnswers5", usersAnswers5);
            intent5.putExtra("isATOF5", isATOF5);
            intent5.putExtra("score5S", score5S);
            startActivity(intent5);
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