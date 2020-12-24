package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers3;


public class Test3 extends ActionBarActivity {

         /*
  *Icremented Variables
  */

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score3 = 0;

    int iZero = 0;

    //Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber,textCounter;
    ImageView button1, button2, button3;

    /*
    *Questions Array
    */

    String[] questions3 = {
            "Which is the fastest animal?",    //Array 0 (Question 1.) if v.getId() is button A/1

            "Nigeria is a country in?", //Array 1 (Question 2.) if v.getId() is button A/1

            "Which of the following is not a fruit?",  //Array 2 (Question 3.) if v.getId() is button C/3

            "Which of the following is a Mexican dish?", //Array 3 (Question 4.) if v.getId() is button B/2

            "What are synonyms?", //Array 4 (Question 5.) if v.getId() is button A/1

            "Martin Luther King Jr. was an?", //Array 5 (Question 6.) if v.getId() is A/1

            "What is the largest country in South America?", //Array 6 (Question 7.) if v.getId() is B/2

            "The country Ecuador got is name from ..",  //Array 7 (Question 8.) if v.getId is C/3

            "What exercise directly affects the arms?", //Array 8 (Question 9.) if v.getId is B/2

            "Which of the following are all warm colors?", //Array 9 (Question 10.) if v.getId is A/1
    };



    /*
    *Button A
     */


    String[] answerTextA3 = {
            "Cheetah", // Array 0
            "Africa", // Array 1
            "Star Fruit",//Array 2
            "Shrimp Lo Mein", // Array 3
            "Different words with similar meanings", //Array 4
            "African American ", //Array 5
            "Colombia", //Array 6
            "The name of an Ecuadorian President", //Array 7
            "Crunches", //Array 8
            "Yellow, Red, and Orange" //Array 9
    };

    //Button B
    String[] answerTextB3 = {
            "Cougar", //Array 0
            "Asia", //Array 1
            "Coconut", //Array 2
            "Enchilada", //Array 3
            "Different words with different meanings", //Array 4
            "South American ", //Array 5
            "Brazil", //Array 6
            "The founder of Ecuador", //Array 7
            "Bench press", //Array 8
            "Yellow, Blue, and Orange" //Array 9
    };

    //Button C

    String equator = "\"equator\"";
    String[] answerTextC3 = {
            "A sloth doing it's max speed.",  //Array 0
            "Antarctica", //Array 1
            "Juicy Fruit", //Array 2
            "Jerk Chicken", //Array 3
            "A word with multiple meanings ", //Array 4
            "Native American", //Array 5
            "Argentina", //Array 6
            "The spanish word for " + equator, //Array 7
            "Situps", //Array 8
            "Yellow, Purple, and Orange" //Array 9
    };

    /*
    *User's Answer Choices
     */

    public String[] usersAnswers3 = {
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

    public String[] isATOF3 = {
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
        answerViewA.setText(answerTextA3[questionIndex]);
        answerViewB.setText(answerTextB3[questionIndex]);
        answerViewC.setText(answerTextC3[questionIndex]);
        questionView.setText(questions3[questionIndex]);


        textCounter = ((TextView)findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 30000, 1000);
        quizTimer.start();

    }


    public void onButton1Click(View v) {

        //Button Click Sound



        //Catching the User's answer choices//

            if (v.getId() == R.id.button1) {
                usersAnswers3[iZero] = answerTextA3[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers3[iZero] = answerTextB3[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers3[iZero] = answerTextC3[iZero];
            }


        /*
        *Determining if the users answers are True or False
         */





        if (questionValue == 1){
            if (v.getId() == R.id.button1){
                isATOF3[0] = "True";
                score3++;

            }else {
                isATOF3[0] = "False";
            }
        }


        if (questionValue == 2){
            if (v.getId() == R.id.button1){
                isATOF3[1] = "True";
                score3++;

            }else {
                isATOF3[1] = "False";
            }
        }

        if (questionValue == 3){
            if (v.getId() == R.id.button3){
                isATOF3[2] = "True";
                score3++;

            }else {
                isATOF3[2] = "False";
            }
        }


        if (questionValue == 4){
            if (v.getId() == R.id.button2){
                isATOF3[3] = "True";
                score3++;

            }else {
                isATOF3[3] = "False";
            }
        }


        if (questionValue == 5){
            if (v.getId() == R.id.button1){
                isATOF3[4] = "True";
                score3++;

            }else {
                isATOF3[4] = "False";
            }
        }


        if (questionValue == 6){
            if (v.getId() == R.id.button1){
                isATOF3[5] = "True";
                score3++;

            }else {
                isATOF3[5] = "False";
            }
        }

        if (questionValue == 7){
            if (v.getId() == R.id.button2){
                isATOF3[6] = "True";
                score3++;

            }else {
                isATOF3[6] = "False";
            }
        }

        if (questionValue == 8){
            if (v.getId() == R.id.button3){
                isATOF3[7] = "True";
                score3++;

            }else {
                isATOF3[7] = "False";
            }
        }


        if (questionValue == 9){
            if (v.getId() == R.id.button2){
                isATOF3[8] = "True";
                score3++;

            }else {
                isATOF3[8] = "False";
            }
        }


        if (questionValue == 10){
            if (v.getId() == R.id.button1){
                isATOF3[9] = "True";
                score3++;

            }else {
                isATOF3[9] = "False";
            }
        }



        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions3.length
                )

        {
            questionView.setText(questions3[questionIndex]); // set the text to the next question



        /*
         * set the answerView(s) to the next answer options
         */
            answerViewA.setText(answerTextA3[questionIndex]);
            answerViewB.setText(answerTextB3[questionIndex]);
            answerViewC.setText(answerTextC3[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");

            //Incrementing Needed to catch users Answers//


            iZero++;





        }
        else {


//Pass intent and stop timer

            quizTimer.cancel();
            String score3S = Integer.toString(score3);

            Intent intent3 = new Intent(Test3.this, UsersAnswers3.class);

            intent3.putExtra("usersAnswers3", usersAnswers3);
            intent3.putExtra("isATOF3", isATOF3);
            intent3.putExtra("score3S", score3S);
            startActivity(intent3);
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


   
