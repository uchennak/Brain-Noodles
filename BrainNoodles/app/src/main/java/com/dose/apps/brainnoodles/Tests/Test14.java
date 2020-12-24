package com.dose.apps.brainnoodles.Tests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers14;

/**
 * Created by kamalu on 12/18/2017.
 */

public class Test14 extends Activity {

// Incremented Variables

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score14 = 0;

    int iZero = 0;

// Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;


    String[] questions14 = {
            "What is the chemical symbol for Silver?",
            "Trees absorb ...",
            "Toyota's headquarters are located in ...",
            "The keyboard shortcut to copy on a Mac is.",
            "The keyboard shortcut to paste on a Mac is",
            "The keyboard shortcut to copy on Windows is ...",
            "The keyboard shortcut to paste on a Windows is ...",
            "Avocadoes are actually  ...",
            "Lettuce is actually a ...",
            "Bell peppers are actually ..."

    };

    String[] answerTextA14 = {
            "Ag", //#1
            "Carbon dioxide", //#2
            "Japan", //#3
            "Command + C", //#4
            "Command + C", //#5
            "Control + C", //#6
            "Control + C", //#7
            "Fruits", //#8
            "Fruit", //#9
            "Fruits" //#10

    };

    String[] answerTextB14 = {
            "Au", //#1
            "Carbon monoxide", //#2
            "Taiwan", //#3
            "Command + V", //#4
            "Command + V", //#5
            "Control + V", //#6
            "Control + V", //#7
            "Vegetables", //#8
            "Vegetable", //#9
            "Vegetables" //#10
    };

    String[] answerTextC14 = {
            "As", //#1
            "Both", //#2
            "Tanzania", //#3
            "Command + P", //#4
            "Command + P", //#5
            "Control + P", //#6
            "Control + P", //#7
            "Neither fruit nor vegetable", //#8
            "Neither fruit nor vegetable", //#9
            "Neither fruit nor vegetable" //#10

    };

    //User's Answer Choices
    public String[] usersAnswers14 = {
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
    public String[] isATOF14 = {
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
        answerViewA.setText(answerTextA14[questionIndex]);
        answerViewB.setText(answerTextB14[questionIndex]);
        answerViewC.setText(answerTextC14[questionIndex]);
        questionView.setText(questions14[questionIndex]);

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

    private void catchAnswers(View v) {
        if (v.getId() == R.id.button1) {
            usersAnswers14[iZero] = answerTextA14[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers14[iZero] = answerTextB14[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers14[iZero] = answerTextC14[iZero];
        }
    }

    private void trueOrFalse(View v) {
        if (questionValue == 1){
            if (v.getId() == R.id.button1){
                isATOF14[0] = "True";
                score14++;

            }else {
                isATOF14[0] = "False";
            }
        }

        if (questionValue == 2){
            if (v.getId() == R.id.button3){
                isATOF14[1] = "True";
                score14++;

            }else {
                isATOF14[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button1){
                isATOF14[2] = "True";
                score14++;

            }else {
                isATOF14[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button1){
                isATOF14[3] = "True";
                score14++;

            }else {
                isATOF14[3] = "False";
            }
        }

        if (questionValue == 5){
            if (v.getId() == R.id.button2){
                isATOF14[4] = "True";
                score14++;

            }else {
                isATOF14[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button1){
                isATOF14[5] = "True";
                score14++;

            }else {
                isATOF14[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button2){
                isATOF14[6] = "True";
                score14++;

            }else {
                isATOF14[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button1){
                isATOF14[7] = "True";
                score14++;

            }else {
                isATOF14[7] = "False";
            }
        }

        if (questionValue == 9){
            if (v.getId() == R.id.button2){
                isATOF14[8] = "True";
                score14++;

            }else {
                isATOF14[8] = "False";
            }
        }

        if (questionValue == 10){
            if (v.getId() == R.id.button1){
                isATOF14[9] = "True";
                score14++;

            }else {
                isATOF14[9] = "False";
            }
        }
    }

    private void nextQuestion() {

        questionIndex++;
        questionValue++;
        String questionValueS = questionValue + "";

        if (questionIndex < questions14.length){
            questionView.setText(questions14[questionIndex]);


            answerViewA.setText(answerTextA14[questionIndex]);
            answerViewB.setText(answerTextB14[questionIndex]);
            answerViewC.setText(answerTextC14[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//
            iZero++;}
        else {

            //Pass intent and stop timer
            quizTimer.cancel();
            String score14S = Integer.toString(score14);

            Intent intent14 = new Intent(Test14.this, UsersAnswers14.class);
            intent14.putExtra("usersAnswers14", usersAnswers14);
            intent14.putExtra("isATOF14", isATOF14);
            intent14.putExtra("score14S", score14S);
            startActivity(intent14);
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
