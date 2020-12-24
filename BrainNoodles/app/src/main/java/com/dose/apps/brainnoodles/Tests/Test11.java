package com.dose.apps.brainnoodles.Tests;

import android.content.Intent;
import android.os.Bundle;



import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers11;

public class Test11 extends Activity {

/*  Incremented Variables  */

    int questionIndex = 0;
    int questionValue = 1;
    int score11;
    int iZero = 0;

/*  Non-Incremented Variables  */

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber, textCounter;
    ImageView button1, button2, button3;

/*  Questions  */

    String[] questions11 = {"Bananas are ripe when...",
            "Energy can never be......",
            "People who uses both left and right hands are...",
            "What is the name of the galaxy we live in?",
            "Is a tomato a fruit?",
            "Why do onions make you cry?",
            "College rule notebooks have more lines per page than wide rule.",
            "What is Barack Obama's middle name?",
            "Donald Trump's slogan is...",
            "What level is this?"
    };

//Answer Button A

    String[] answerTextA11 = {"Green",
            "Destroyed",
            "Ambidextrous",
            "Milky Way",
            "Of course not",
            "They are ugly",
            "No",
            "Ba-Kobe",
            "Make America great again",
            "T-H"

    };

//Answer Button B

    String[] answerTextB11 = {"Yellow",
            "Converted",
            "Boisterous",
            "Snickers",
            "Of course",
            "Released gas",
            "True",
            "Hussein",
            "Make America wait again",
            "T-I"
    };

//Answer Button C

    String[] answerTextC11 = {"Brown",
            "Consumed",
            "Onomatopoeia",
            "Super Saiyan Blue",
            "No",
            "Gravity",
            "False",
            "Donald Trump",
            "Take America's weight again",
            "T-K"


    };


//User's Answer Choices


    public String[] usersAnswers11 = {
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


    public String[] isATOF11 = {
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
        answerViewA.setText(answerTextA11[questionIndex]);
        answerViewB.setText(answerTextB11[questionIndex]);
        answerViewC.setText(answerTextC11[questionIndex]);
        questionView.setText(questions11[questionIndex]);

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
            if (v.getId() == R.id.button2){
                isATOF11[0] = "True";
                score11++;

            }else {
                isATOF11[0] = "False";
            }
        }

        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF11[1] = "True";
                score11++;

            }else {
                isATOF11[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button1){
                isATOF11[2] = "True";
                score11++;

            }else {
                isATOF11[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button1){
                isATOF11[3] = "True";
                score11++;

            }else {
                isATOF11[3] = "False";
            }
        }

        if (questionValue == 5){
            if (v.getId() == R.id.button2){
                isATOF11[4] = "True";
                score11++;

            }else {
                isATOF11[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button2){
                isATOF11[5] = "True";
                score11++;

            }else {
                isATOF11[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button2){
                isATOF11[6] = "True";
                score11++;

            }else {
                isATOF11[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF11[7] = "True";
                score11++;

            }else {
                isATOF11[7] = "False";
            }
        }

        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF11[8] = "True";
                score11++;

            }else {
                isATOF11[8] = "False";
            }
        }

        if (questionValue == 10){
            if (v.getId() == R.id.button3){
                isATOF11[9] = "True";
                score11++;

            }else {
                isATOF11[9] = "False";
            }
        }
    }

    private void catchAnswers(View v) {
        if (v.getId() == R.id.button1) {
            usersAnswers11[iZero] = answerTextA11[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers11[iZero] = answerTextB11[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers11[iZero] = answerTextC11[iZero];
        }
    }
    private void nextQuestion() {

        questionIndex++;
        questionValue++;
        String questionValueS = questionValue + "";


        if (questionIndex < questions11.length){
            questionView.setText(questions11[questionIndex]);


            answerViewA.setText(answerTextA11[questionIndex]);
            answerViewB.setText(answerTextB11[questionIndex]);
            answerViewC.setText(answerTextC11[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//
            iZero++;}
        else {

            //Pass intent and stop timer
            quizTimer.cancel();
            String score11S = Integer.toString(score11);

            Intent intent11 = new Intent(Test11.this, UsersAnswers11.class);
            intent11.putExtra("usersAnswers11", usersAnswers11);
            intent11.putExtra("isATOF11", isATOF11);
            intent11.putExtra("score11S", score11S);
            startActivity(intent11);

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
