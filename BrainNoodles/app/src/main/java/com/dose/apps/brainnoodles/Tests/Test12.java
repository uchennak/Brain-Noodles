package com.dose.apps.brainnoodles.Tests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers12;

/**
 * Created by chiozokamalu on 12/11/17.
 */
public class Test12 extends Activity {

// Incremented Variables

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score12 = 0;

    int iZero = 0;

//Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;
    String W = "\"W\"";
    ImageView button1, button2, button3;

//Questions

    String[] questions12 = {
            "Spiciness is measured in ... ",  //Array 0
            "An Acronym is an ..?",  //Array
            "Islands are created by ...",  //Array 2
            "What is 1+(-1)?",  //Array 3
            "What is -2 x -2?",  //Array 4
            "How many syllables does " + W + " have?",  //Array 5
            "Is the sun a star?", //Array 6
            "Is the moon a star?", //Array 7
            "Killer whales are actually...", //Array 8
            "Whales are...", //Array 9

    };

//Answers A

    String[] answerTextA12 = {
            "Scoville Units",  //Array 0
            "Abbreviation",  //Array 1
            "Volcanoes",  //Array 2
            "1",  //Array 3
            "-4",  //Array 4
            "2",  //Array 5
            "No", //Array 6
            "Yes", //Array 7
            "Dolphins", //Array 8
            "Mammals" //Array 9

    };

//Answers B

    String[] answerTextB12 = {
            "Scottish Units",  //Array 0
            "Anchorage Acorn",  //Array 1
            "Hurricanes",  //Array 2
            "0",  //Array 3
            "4",  //Array 4
            "3",  //Array 5
            "Yes", //Array 6
            "No", //Array 7
            "Sharks", //Array 8
            "Fish" //Array 9

    };

//Answers C

    String[] answerTextC12 = {
            "Chile Units",  //Array 0
            "African Ostrich",  //Array 1
            "Tornados",  //Array 2
            "-1",  //Array 3
            "-22",  //Array 4
            "4",  //Array 5
            "No", //Array 6
            "Yes", //Array 7
            "Seals", //Array 8
            "Reptiles" //Array 9

    };

//User's Answer Choices


    public String[] usersAnswers12 = {
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

    public String[] isATOF12 = {
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

//Displaying the current question + answer options
        String questionValueS = Integer.toString(questionValue);
        questionNumber.setText("Question " + questionValueS + ".");
        answerViewA.setText(answerTextA12[questionIndex]);
        answerViewB.setText(answerTextB12[questionIndex]);
        answerViewC.setText(answerTextC12[questionIndex]);
        questionView.setText(questions12[questionIndex]);

//The textview where the timer will be
        textCounter = ((TextView) findViewById(R.id.textCounter));

//Starting the timer
        quizTimer = new QuizTimer(textCounter, 30000, 1000);
        quizTimer.start();


    }
    public void onButton1Click(View v) {

//Catching the User's answer choices//
        catchAnswers(v);

//Grade the users answers
        trueOrFalse(v);

//Go to the next Question
        nextQuestion();


    }


    private void trueOrFalse(View v) {
        if (questionValue == 1){
            if (v.getId() == R.id.button1){
                isATOF12[0] = "True";
                score12++;

            }else {
                isATOF12[0] = "False";
            }
        }

        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF12[1] = "True";
                score12++;

            }else {
                isATOF12[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button1){
                isATOF12[2] = "True";
                score12++;

            }else {
                isATOF12[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button2){
                isATOF12[3] = "True";
                score12++;

            }else {
                isATOF12[3] = "False";
            }
        }

        if (questionValue == 5){
            if (v.getId() == R.id.button2){
                isATOF12[4] = "True";
                score12++;

            }else {
                isATOF12[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button2){
                isATOF12[5] = "True";
                score12++;

            }else {
                isATOF12[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button2){
                isATOF12[6] = "True";
                score12++;

            }else {
                isATOF12[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF12[7] = "True";
                score12++;

            }else {
                isATOF12[7] = "False";
            }
        }

        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF12[8] = "True";
                score12++;

            }else {
                isATOF12[8] = "False";
            }
        }

        if (questionValue == 10){
            if (v.getId() == R.id.button1){
                isATOF12[9] = "True";
                score12++;

            }else {
                isATOF12[9] = "False";
            }
        }
    }

    private void catchAnswers(View v) {
        if (v.getId() == R.id.button1) {
            usersAnswers12[iZero] = answerTextA12[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers12[iZero] = answerTextB12[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers12[iZero] = answerTextC12[iZero];
        }
    }
    private void nextQuestion() {

        questionIndex++;
        questionValue++;
        String questionValueS = questionValue + "";


        if (questionIndex < questions12.length){
            questionView.setText(questions12[questionIndex]);


            answerViewA.setText(answerTextA12[questionIndex]);
            answerViewB.setText(answerTextB12[questionIndex]);
            answerViewC.setText(answerTextC12[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//
            iZero++;}
        else {

            //Pass intent and stop timer
            quizTimer.cancel();
            String score12S = Integer.toString(score12);

            Intent intent12 = new Intent(Test12.this, UsersAnswers12.class);
            intent12.putExtra("usersAnswers12", usersAnswers12);
            intent12.putExtra("isATOF12", isATOF12);
            intent12.putExtra("score12S", score12S);
            startActivity(intent12);
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
