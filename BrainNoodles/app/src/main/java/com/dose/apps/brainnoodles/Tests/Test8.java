package com.dose.apps.brainnoodles.Tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers8;


public class Test8 extends ActionBarActivity {

// Icremented Variables


    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score8 = 0;

    int iZero = 0;

//Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;

    ImageView button1, button2, button3;

//Questions Array

    String p = "\"P\"";
    String o = "\"O\"";
    String j = "\"J\"";
    String q = "\"Q\"";

    String w = "\"W\"";


    String questions8[] = {

            "Which letter comes before " + p,  //Array 0
            "Which letter comes after " + o,  //Array 1
            "Which letter comes after " + q, //  Array 2
            "Which letter comes before " + w, //Array 3
            "Which letter comes after " + j, //Array 4
            "Which of these numbers come right before 0.02", //Array 5
            "Which of these numbers come right after 44 x 0 ?", //Array 6
            "Which of these numbers come right before 0.01? ", //Array 7
            "Which Question number were you on before this one?", //Array 8
            "Which level is this?" //Array 9

    };


//Answers A

    String answerTextA8[] = {
            "O",  //Array 0
            "M",  //Array 1
            "R", //  Array 2
            "X", //Array 3
            "K", //Array 4
            "0.01", //Array 5
            "0.1", //Array 6
            "0 ", //Array 7
            "8", //Array 8
            "T-H" //Array 9
    };

//Answers B

    String answerTextB8[] = {
            "Q",  //Array 0
            "N",  //Array 1
            "P", //  Array 2
            "V", //Array 3
            "I", //Array 4
            "0.1", //Array 5
            "1", //Array 6
            "0.1", //Array 7
            "9", //Array 8
            "T-G" //Array 9
    };

//Answers C

    String answerTextC8[] = {
            "R",  //Array 0
            "P",  //Array 1
            "S", //  Array 2
            "U", //Array 3
            "L", //Array 4
            "1", //Array 5
            "0.01", //Array 6
            "0.02 ", //Array 7
            "7", //Array 8
            "T-F" //Array 9
    };


// User's Answer Choices


    public String[] usersAnswers8 = {
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


// Is the user's answers true or false


    public String[] isATOF8 = {
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


        questionNumber.setText("Question " + questionValue + ".");
        answerViewA.setText(answerTextA8[questionIndex]);
        answerViewB.setText(answerTextB8[questionIndex]);
        answerViewC.setText(answerTextC8[questionIndex]);
        questionView.setText(questions8[questionIndex]);


        textCounter = ((TextView) findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 29000, 1000);
        quizTimer.start();


    }



    public void onButton1Click(View v) {

//Catching user's answers

        if (v.getId() == R.id.button1) {
            usersAnswers8[iZero] = answerTextA8[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers8[iZero] = answerTextB8[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers8[iZero] = answerTextC8[iZero];
        }

//Determining if the users answers are True or False


        if (questionValue == 1) {
            if (v.getId() == R.id.button1) {
                isATOF8[0] = "True";
                score8++;
            } else {
                isATOF8[0] = "False";
            }
        }


        if (questionValue == 2) {
            if (v.getId() == R.id.button3) {
                isATOF8[1] = "True";
                score8++;
            } else {
                isATOF8[1] = "False";
            }
        }


        if (questionValue == 3) {
            if (v.getId() == R.id.button1) {
                isATOF8[2] = "True";
                score8++;
            } else {
                isATOF8[2] = "False";
            }
        }

        if (questionValue == 4) {
            if (v.getId() == R.id.button2) {
                isATOF8[3] = "True";
                score8++;
            } else {
                isATOF8[3] = "False";
            }
        }

        if (questionValue == 5) {
            if (v.getId() == R.id.button1) {
                isATOF8[4] = "True";
                score8++;
            } else {
                isATOF8[4] = "False";
            }
        }

        if (questionValue == 6) {
            if (v.getId() == R.id.button1) {
                isATOF8[5] = "True";
                score8++;
            } else {
                isATOF8[5] = "False";
            }
        }

        if (questionValue == 7) {
            if (v.getId() == R.id.button3) {
                isATOF8[6] = "True";
                score8++;
            } else {
                isATOF8[6] = "False";
            }
        }

        if (questionValue == 8) {
            if (v.getId() == R.id.button1) {
                isATOF8[7] = "True";
                score8++;
            } else {
                isATOF8[7] = "False";
            }
        }

        if (questionValue == 9) {
            if (v.getId() == R.id.button1) {
                isATOF8[8] = "True";
                score8++;
            } else {
                isATOF8[8] = "False";
            }
        }
        if (questionValue == 10) {
            if (v.getId() == R.id.button1) {
                isATOF8[9] = "True";
                score8++;
            } else {
                isATOF8[9] = "False";
            }
        }


        questionValue++;

        questionIndex++;






        if (questionIndex < questions8.length)

        {



// make sure the index is in bounds & increment the index//


            questionView.setText(questions8[questionIndex]); //this sets the text to the next question




// set the answerView(s) to the next answer options

            answerViewA.setText(answerTextA8[questionIndex]);
            answerViewB.setText(answerTextB8[questionIndex]);
            answerViewC.setText(answerTextC8[questionIndex]);
            questionNumber.setText("Question " + questionValue + ".");


// Incrementing Needed to catch the user's answers and determine whether true or not

            iZero++;
       }
        else {


            quizTimer.cancel();
            Intent intent8 = new Intent(Test8.this, UsersAnswers8.class);

            intent8.putExtra("usersAnswers8", usersAnswers8);
            intent8.putExtra("isATOF8", isATOF8);
            intent8.putExtra("score8", score8);
            startActivity(intent8);

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




