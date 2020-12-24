package com.dose.apps.brainnoodles.Tests;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers7;


public class Test7 extends MainActivity {

/*
 *Icremented Variables
 */

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score7 = 0;

    int iZero = 0;

//Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;

    ImageView button1, button2, button3;

 //Questions Array

    String corndog = "\"corndog\"";
    String pi = "\"pi\"?";
    String thisNumber = "\"2.840\"";
    String questions7[] ={
            "What is Cinco de Mayo?",  //Array 0
            "Which snake is venomous?",  //Array 1
            "Which formula converts Fahrenheit to Celcius?", //  Array 2
            "2 negatives makes a...?", //Array 3
            " A negative an a positive makes a...?", //Array 4
            "Which word is not "+ corndog +" unscrambled?", //Array 5
            "Round "+ thisNumber + " to the nearest tenth", //Array 6
            "Which one of these is not "+pi , //Array 7
            "What fruit does SpongeBob live in?", //Array 8
            "Acceleration is ...?" //Array 9

    };


//Answers A

    String answerTextA7[] = {
            "The 5th of May", //Array 0
            "Python",  //Array 1
            "F = °C × 9/5 + 32", //  Array 2
            "Negative", //Array 3
            "Neutral", //Array 4
            "gcdnoor", //Array 5
            "2.8 ", //Array 6
            "3.14", //Array 7
            "Coconut", //Array 8
            "The rate an object moves" //Array 9
    };

//Answers B
    String answerTextB7[] = {
            "Spicy mayonaise", //Array 0
            "Boa constrictor",  //Array 1
            "CS =(°F − 32) x 5/9 ,", //  Array 2
            "Positive", //Array 3
            "Positive", //Array 4
            "cogdnro", //Array 5
            "2.84", //Array 6
            "A letter of the Greek alphabet", //Array 7
            "Bikini Bottom", //Array 8
            "The rate that speed is increasing" //Array 9
    };

//Answers C
    String answerTextC7[] = {
            "Spicy mustard", //Array 0
            "Chain Viper",  //Array 1
            "C = (°F − 32) x 5/9  ", //  Array 2
            "Neutral", //Array 3
            "Negative", //Array 4
            "orcgnodb", //Array 5
            "3", //Array 6
            "Blueberry pie", //Array 7
            "Pineapple", //Array 8
            "The rate that speed is decreasing" //Array 9
    };


 /*
*User's Answer Choices
*/

    public String[] usersAnswers7 = {
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

    public  String[] isATOF7 = {
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

      //  String questionValueS = Integer.toString(questionValue);
        questionNumber.setText("Question " + questionValue + ".");
        answerViewA.setText(answerTextA7[questionIndex]);
        answerViewB.setText(answerTextB7[questionIndex]);
        answerViewC.setText(answerTextC7[questionIndex]);
        questionView.setText(questions7[questionIndex]);

        textCounter = ((TextView) findViewById(R.id.textCounter));

        quizTimer = new QuizTimer(textCounter, 29000, 1000);
        quizTimer.start();


        }

    public void onButton1Click(View v) {
//Catching user's answers

            if (v.getId() == R.id.button1) {
                usersAnswers7[iZero] = answerTextA7[iZero];
            }
            if (v.getId() == R.id.button2) {
                usersAnswers7[iZero] = answerTextB7[iZero];
            }
            if (v.getId() == R.id.button3) {
                usersAnswers7[iZero] = answerTextC7[iZero];
            }

//Determining if the users answers are True or False
            if (questionValue == 1){
                if (v.getId() == R.id.button1){
                    isATOF7[0] = "True";
                    score7++;
                }else {
                    isATOF7[0] = "False";
                }
            }

            if (questionValue == 2){
                if (v.getId() == R.id.button3){
                    isATOF7[1] = "True";
                    score7++;
                }else {
                    isATOF7[1] = "False";
                }
            }

            if (questionValue == 3){
                if (v.getId() == R.id.button3){
                    isATOF7[2] = "True";
                    score7++;
                }else {
                    isATOF7[2] = "False";
                }
            }


            if (questionValue == 4){
                if (v.getId() == R.id.button2){
                    isATOF7[3] = "True";
                    score7++;
                }else {
                    isATOF7[3] = "False";
                }
            }

            if (questionValue == 5){
                if (v.getId() == R.id.button3){
                    isATOF7[4] = "True";
                    score7++;
                }else {
                    isATOF7[4] = "False";
                }
            }

            if (questionValue == 6){
                if (v.getId() == R.id.button3){
                    isATOF7[5] = "True";
                    score7++;
                }else {
                    isATOF7[5] = "False";
                }
            }


            if (questionValue == 7){
                if (v.getId() == R.id.button1){
                    isATOF7[6] = "True";
                    score7++;
                }else {
                    isATOF7[6] = "False";
                }
            }


            if (questionValue == 8){
                if (v.getId() == R.id.button3){
                    isATOF7[7] = "True";
                    score7++;
                }else {
                    isATOF7[7] = "False";
                }
            }


            if (questionValue == 9){
                if (v.getId() == R.id.button3){
                    isATOF7[8] = "True";
                    score7++;
                }else {
                    isATOF7[8] = "False";
                }
            }


            if (questionValue == 10){
                if (v.getId() == R.id.button2){

                    isATOF7[9] = "True";
                    score7++;
                }else {

                    isATOF7[9] = "False";
                }
            }
            questionValue++;

            questionIndex++;
            // String questionValueS = Integer.toString(questionValue);

            if (questionIndex < questions7.length)

            {
// make sure the index is in bounds & increment the index//
                questionView.setText(questions7[questionIndex]); // set the text to the next question

// set the answerView(s) to the next answer options
                answerViewA.setText(answerTextA7[questionIndex]);
                answerViewB.setText(answerTextB7[questionIndex]);
                answerViewC.setText(answerTextC7[questionIndex]);
                questionNumber.setText("Question " + questionValue + ".");

//Incrementing Needed to catch users Answers//
                iZero++;
            }
            else {




                 // String score7S = Integer.toString(score7);
                quizTimer.cancel();
                Intent intent7 = new Intent(Test7.this, UsersAnswers7.class);

                intent7.putExtra("usersAnswers7", usersAnswers7);
                intent7.putExtra("isATOF7", isATOF7);
                intent7.putExtra("score7", score7);
                startActivity(intent7);
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
