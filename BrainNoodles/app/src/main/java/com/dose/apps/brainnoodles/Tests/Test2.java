package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers2;

public class Test2 extends ActionBarActivity {
       /*
  *Icremented Variables
  */

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score2 = 0;


    int iZero = 0;

    //Non-incremented variables


    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber,textCounter;
    ImageView button1, button2, button3;
    QuizTimer quizTimer;

    /*
    *Questions Array
    */

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


    /*
   * Button A
   */
    String[] answerTextA2 = {
            "Music pounds", //Array 0
            "32° F", //Array 1
            "212°F", //Array 2
            "France", //Array 3
            "Red, Orange, and Yellow", //Array 4
            "Quotient is to division", //Array 5
            "1/100",//Array 6
            "Gooses", //Array 7
            "A base", //Array 8
            "Put the car in Drive" //Array 9

    };


    /*
    * Button B
    */
    String[] answerTextB2 = {
            "Decibels", //Array 0
            "32° C", //Array 1
            "212°C", //Array 2
            "Italy", //Array 3
            "Red, Green, and Blue", // Array 4
            "Cell phone is to smoothie", //Array 5
            "100/100", //Array 6
            "Geese", //Array7
            "An acid", //Array 8
            "Check mirrors" //Array 9


    };

    /*
    * Button C
    */


    String[] answerTextC2 = {
            "Musicliters", //Array 0
            "0° F", //Array 1
            "100°F", //Array 2
            "Rome", //Array 3
            "Red, Blue, and Yellow", //Array 4
            "Wireless mouse is to usb cord", //Array 5
            "100/1", //Array 6
            "Geesos", //Array 7
            "Neutral", //Array 8
            "Turn the steering wheel clockwise", //Array 9



    };

    /*
    *User's Answer Choices
     */

    public String[] usersAnswers2 = {
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

    public String[] isATOF2 = {
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
        answerViewA.setText(answerTextA2[questionIndex]);
        answerViewB.setText(answerTextB2[questionIndex]);
        answerViewC.setText(answerTextC2[questionIndex]);
        questionView.setText(questions2[questionIndex]);


        textCounter = ((TextView)findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 31000, 1000);
        quizTimer.start();

    }


    public void onButton1Click(View v) {
//Button Click Sound



        //Catching the User's answer choices//

            if (v.getId() == R.id.button1) {
                usersAnswers2[iZero] = answerTextA2[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers2[iZero] = answerTextB2[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers2[iZero] = answerTextC2[iZero];
            }



        /*
        *Determining if the users answers are True or False
         */

        if (questionValue == 1){
            if (v.getId() == R.id.button2){
                isATOF2[0] = "True";
                score2++;

            }else {
                isATOF2[0] = "False";
            }
        }


        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF2[1] = "True";
                score2++;

            }else {
                isATOF2[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button1){
                isATOF2[2] = "True";
                score2++;

            }else {
                isATOF2[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button1){
                isATOF2[3] = "True";
                score2++;

            }else {
                isATOF2[3] = "False";
            }
        }


        if (questionValue == 5){
            if (v.getId() == R.id.button3){
                isATOF2[4] = "True";
                score2++;

            }else {
                isATOF2[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button1){
                isATOF2[5] = "True";
                score2++;

            }else {
                isATOF2[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button3){
                isATOF2[6] = "True";
                score2++;

            }else {
                isATOF2[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button2){
                isATOF2[7] = "True";
                score2++;

            }else {
                isATOF2[7] = "False";
            }
        }


        if (questionValue == 9){
            if (v.getId() == R.id.button1){
                isATOF2[8] = "True";
                score2++;

            }else {
                isATOF2[8] = "False";
            }
        }


        if (questionValue == 10){
            if (v.getId() == R.id.button2){
                isATOF2[9] = "True";
                score2++;

            }else {
                isATOF2[9] = "False";
            }
        }

        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions2.length)

        {
            questionView.setText(questions2[questionIndex]); // set the text to the next question



        /*
         * set the answerView(s) to the next answer options
         */
            answerViewA.setText(answerTextA2[questionIndex]);
            answerViewB.setText(answerTextB2[questionIndex]);
            answerViewC.setText(answerTextC2[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//


            iZero++;

        }
        else {


//Pass intent and stop timer

            quizTimer.cancel();
            String score2S = Integer.toString(score2);

            Intent intent2 = new Intent(Test2.this, UsersAnswers2.class);
            intent2.putExtra("usersAnswers2", usersAnswers2);
            intent2.putExtra("isATOF2", isATOF2);
            intent2.putExtra("score2S", score2S);
            startActivity(intent2);
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
