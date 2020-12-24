package com.dose.apps.brainnoodles.Tests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers13;

/**
 * Created by uchenna kamalu on 12/14/17.
 */
public class Test13 extends Activity {

// Incremented Variables

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score13 = 0;

    int iZero = 0;

// Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;
    ImageView button1, button2, button3;

    String questions13[] = {
            "What is 1+1?",
            "What is the answer from the previous question?",
            "What is -1 - 1?",
            "What is the answer from the previous question?",
            "What is 2 x 2?",
            "What is 2^2?",
            "What is 2^3?",
            "What is (2^2)+(2^2)",
            "What is the answer from the previous question?",
            "Is this the last question?"};

    //A Answer choices
    String answerTextA13[] = {

            "1",
            "3",
            "0",
            "0",
            "4",
            "4",
            "8",
            "8",
            "8",
            "Yes"

    };

    //B Answer choices
    String answerTextB13[] = {
            "2",
            "2",
            "-2",
            "-2",
            "22",
            "22",
            "6",
            "-8",
            "-8",
            "No"};

    //C Answer choices
    String answerTextC13[] = {
            "3",
            "1",
            "+2",
            "+2",
            "44",
            "44",
            "5",
            "44",
            "44",
            "Nope"};

//User's Answer Choices
    public String[] usersAnswers13 = {
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
    public String[] isATOF13 = {
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
        answerViewA.setText(answerTextA13[questionIndex]);
        answerViewB.setText(answerTextB13[questionIndex]);
        answerViewC.setText(answerTextC13[questionIndex]);
        questionView.setText(questions13[questionIndex]);

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
            usersAnswers13[iZero] = answerTextA13[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers13[iZero] = answerTextB13[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers13[iZero] = answerTextC13[iZero];
        }
    }

    private void trueOrFalse(View v) {
    if (questionValue == 1){
        if (v.getId() == R.id.button2){
            isATOF13[0] = "True";
            score13++;

        }else {
            isATOF13[0] = "False";
        }
    }

    if (questionValue == 2){
        if (v.getId() == R.id.button2){
            isATOF13[1] = "True";
            score13++;

        }else {
            isATOF13[1] = "False";
        }
    }

    if (questionValue == 3){
        if (v.getId() == R.id.button2){
            isATOF13[2] = "True";
            score13++;

        }else {
            isATOF13[2] = "False";
        }
    }


    if (questionValue == 4){
        if (v.getId() == R.id.button2){
            isATOF13[3] = "True";
            score13++;

        }else {
            isATOF13[3] = "False";
        }
    }

    if (questionValue == 5){
        if (v.getId() == R.id.button1){
            isATOF13[4] = "True";
            score13++;

        }else {
            isATOF13[4] = "False";
        }
    }


    if (questionValue == 6){
        if (v.getId() == R.id.button1){
            isATOF13[5] = "True";
            score13++;

        }else {
            isATOF13[5] = "False";
        }
    }

    if (questionValue == 7){
        if (v.getId() == R.id.button1){
            isATOF13[6] = "True";
            score13++;

        }else {
            isATOF13[6] = "False";
        }
    }

    if (questionValue == 8){
        if (v.getId() == R.id.button1){
            isATOF13[7] = "True";
            score13++;

        }else {
            isATOF13[7] = "False";
        }
    }

    if (questionValue == 9){
        if (v.getId() == R.id.button1){
            isATOF13[8] = "True";
            score13++;

        }else {
            isATOF13[8] = "False";
        }
    }

    if (questionValue == 10){
        if (v.getId() == R.id.button1){
            isATOF13[9] = "True";
            score13++;

        }else {
            isATOF13[9] = "False";
        }
    }
    }
    private void nextQuestion() {

    questionIndex++;
    questionValue++;
    String questionValueS = questionValue + "";


    if (questionIndex < questions13.length){
        questionView.setText(questions13[questionIndex]);


        answerViewA.setText(answerTextA13[questionIndex]);
        answerViewB.setText(answerTextB13[questionIndex]);
        answerViewC.setText(answerTextC13[questionIndex]);
        questionNumber.setText("Question " + questionValueS + ".");

        //Incrementing Needed to catch users Answers//
        iZero++;}
    else {

        //Pass intent and stop timer
        quizTimer.cancel();
        String score13S = Integer.toString(score13);

        Intent intent13 = new Intent(Test13.this, UsersAnswers13.class);
        intent13.putExtra("usersAnswers13", usersAnswers13);
        intent13.putExtra("isATOF13", isATOF13);
        intent13.putExtra("score13S", score13S);
        startActivity(intent13);
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