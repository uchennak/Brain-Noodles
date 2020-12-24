package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers4;


public class Test4 extends ActionBarActivity {


//Icremented Variables


    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score4 = 0;


    int iZero = 0;

//Non-incremented variables


    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber,textCounter;
    ImageView button1, button2, button3;


//Questions Array


    String marsupial = "\"marsupial\"";
    String[] questions4 = {
            "How many letters are in the word " + marsupial + "?", //Array 0 (Question 1.)
            "Which of these animals is a marsupial?", //Array 1 (Question 2.)
            "A whale is a....", //Array 2, Question 3.
            "A horizontal line goes ...", //Array 3, Question 4.
            "A synonym of refurbished is?", //Array 4, Question 5.
            "Which of these is not a unit of electricity?", //Array 5, Question 6.
            "A vertical line  ....", //Array 6, Question 7.
            "Which degree takes longer to achieve?", //Array 7, Question 8
            "The chemical symbol for Iron is ...", //Array 8, Question 9
            "What is another name for salt?", //Array 9, Question 10
    };

//Answer Button A

    String[] answerTextA4 = {
            "7", // Question 1
            "Kangaroo", // Question 2
            "Mammal", // Question 3
            "left/right", // Question 4
            "Broken", // Question 5
            "Gigabyte", // Question 6
            "Goes left/right", // Question 7
            "Associates", // Question 8
            "Fe", // Question 9
            "Sodium chloride", // Question 10
    };

    String[] answerTextB4 = {
            "8", // Question 1
            "Grizzly Bear", // Question 2
            "Marsupial", // Question 3
            "up/down", // Question 4
            "Restored", // Question 5
            "Watt", // Question 6
            "Goes up/down", // Question 7
            "Masters", // Question 8
            "Ie", // Question 9
            "Ozone layer", // Question 10
    };

    String[] answerTextC4 = {
            "9", // Question 1
            "Whale", // Question 2
            "Fish", // Question 3
            "in loops", // Question 4
            "Furniture", // Question 5
            "Volt", // Question 6
            "Goes in loops", // Question 7
            "Bachelors", // Question 8
            "Ir", // Question 9
            "Polyester", // Question 10
    };

/*
    *User's Answer Choices
     */

    public String[] usersAnswers4 = {
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

    public String[] isATOF4 = {
            "", //Array 0
            "", //Array 1
            "", //Array 2
            "", //Array 3
            "", //Array 4
            "", //Array 5
            "", //Array 6
            "", //Array 7
            "", //Array 8
            "", //Aray 9
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
        answerViewA.setText(answerTextA4[questionIndex]);
        answerViewB.setText(answerTextB4[questionIndex]);
        answerViewC.setText(answerTextC4[questionIndex]);
        questionView.setText(questions4[questionIndex]);


        textCounter = ((TextView)findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 30000, 1000);
        quizTimer.start();


    }


    public void onButton1Click(View v) {

        //Button Click Sound



        //Catching the User's answer choices//

            if (v.getId() == R.id.button1) {
                usersAnswers4[iZero] = answerTextA4[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers4[iZero] = answerTextB4[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers4[iZero] = answerTextC4[iZero];
            }



        /*
* Question 1 is C/3, Question 2 is A/1, Question 3 is A/1, Question 4 is A/1, Question 5 is B/2


* Question 6 is A/1, Question 7 is B/2, Question 8 is B/2, Question 9 is C/3, Question 10 is A/1
 */




        if (questionValue == 1){
            if (v.getId() == R.id.button3){
                isATOF4[0] = "True";
                score4++;

            }else {
                isATOF4[0] = "False";
            }
        }


        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF4[1] = "True";
                score4++;

            }else {
                isATOF4[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button1){
                isATOF4[2] = "True";
                score4++;

            }else {
                isATOF4[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button1){
                isATOF4[3] = "True";
                score4++;

            }else {
                isATOF4[3] = "False";
            }
        }


        if (questionValue == 5){
            if (v.getId() == R.id.button2){
                isATOF4[4] = "True";
                score4++;

            }else {
                isATOF4[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button1){
                isATOF4[5] = "True";
                score4++;

            }else {
                isATOF4[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button2){
                isATOF4[6] = "True";
                score4++;

            }else {
                isATOF4[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF4[7] = "True";
                score4++;

            }else {
                isATOF4[7] = "False";
            }
        }


        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF4[8] = "True";
                score4++;

            }else {
                isATOF4[8] = "False";
            }
        }


        if (questionValue == 10){
            if (v.getId() == R.id.button1){
                isATOF4[9] = "True";
                score4++;

            }else {
                isATOF4[9] = "False";
            }
        }




        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions4.length
                )

        {
            questionView.setText(questions4[questionIndex]); // set the text to the next question



/*
* set the answerView(s) to the next answer options
 */
            answerViewA.setText(answerTextA4[questionIndex]);
            answerViewB.setText(answerTextB4[questionIndex]);
            answerViewC.setText(answerTextC4[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

 //Incrementing Needed to catch users Answers//


            iZero++;



        }
        else {

//Pass intent and stop timer

            quizTimer.cancel();
            String score4S = Integer.toString(score4);

            Intent intent4 = new Intent(Test4.this, UsersAnswers4.class);

            intent4.putExtra("usersAnswers4", usersAnswers4);
            intent4.putExtra("isATOF4", isATOF4);
            intent4.putExtra("score4S", score4S);
            startActivity(intent4);
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