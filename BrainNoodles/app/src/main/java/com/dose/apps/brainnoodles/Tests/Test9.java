package com.dose.apps.brainnoodles.Tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers9;


public class Test9 extends ActionBarActivity {

// Icremented Variables

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score9 = 0;

    int iZero = 0;

//Non-incremented variables

     QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;

    ImageView button1, button2, button3;

//Questions
    String zucchini = "\"zucchini\"";
    String sugar = "\"sugar\"";
    String[] questions9 = {
         "You bend over and coins fall out of your chest pocket. What should you do next?",
            "Which day comes 2 days after Saturday?",
            "Which definition explains cohesion?",
            "Which definition explains adhesion",
            "Is " +zucchini+ " the correct spelling of "+zucchini+"? (Y for no, N for yes)",
            "What is spanish for "+sugar+"?",
            "What is the capital of Idaho?",
            "Idaho is located on which region of the USA?",
            "What are the 4 cardinal directions?",
            "What are the 4 intermediate directions?",

    };

//Answers A

    String answerTextA9[] = {
            "Put the coins back in your pockets",  //Array 0
            "Sunday",  //Array 1
            "Similar matter sticking together", //  Array 2
            "Similar matter sticking together", //Array 3
            "N", //Array 4
            "El súgar", //Array 5
            "Boise", //Array 6
            "Midwest", //Array 7
            "North, South, East, West", //Array 8
            "Northwest, Southwest, Northeast, Southeast" //Array 9
    };

//Answers B

    String answerTextB9[] = {
            "Close zipper then pickup coins",  //Array 0
            "Tuesday",  //Array 1
            "Dissimilar matter sticking together", //  Array 2
            "Dissimilar matter sticking together", //Array 3
            "Y", //Array 4
            "Los súgar", //Array 5
            "Portland", //Array 6
            "Northeast", //Array 7
            "Northwest, Southwest, Northeast, Southeast", //Array 8
            "North, South, West" //Array 9
    };

//Answers C

    String answerTextC9[] = {
            "Clap your hands 2 times",  //Array 0
            "Monday",  //Array 1
            "Neither", //  Array 2
            "Neither", //Array 3
            "Neither", //Array 4
            "Azúcar", //Array 5
            "Springfield", //Array 6
            "Neither", //Array 7
            "North, South, West", //Array 8
            "North, South, East, West" //Array 9
    };

// User's Answer Choices

  public String[] usersAnswers9 = {
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

    public String[] isATOF9 = {
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




// TextView Initializations //

        answerViewA = ((TextView) findViewById(R.id.textView1));
        answerViewB = ((TextView) findViewById(R.id.textView2));
        answerViewC = ((TextView) findViewById(R.id.textView3));
        questionView = ((TextView) findViewById(R.id.questionView));
        questionView2 = ((TextView) findViewById(R.id.questionView2));
        questionNumber = (TextView) findViewById(R.id.questionNumber);

//Displaying the answers

        questionNumber.setText("Question " + questionValue + ".");
        answerViewA.setText(answerTextA9[questionIndex]);
        answerViewB.setText(answerTextB9[questionIndex]);
        answerViewC.setText(answerTextC9[questionIndex]);
        questionView.setText(questions9[questionIndex]);


//Starting the timer

        textCounter = ((TextView) findViewById(R.id.textCounter));
        quizTimer = new QuizTimer(textCounter, 29000, 1000);
        quizTimer.start();



    }


    public void onButton1Click(View v) {

//Catching user's answers

        if (v.getId() == R.id.button1) {
            usersAnswers9[iZero] = answerTextA9[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers9[iZero] = answerTextB9[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers9[iZero] = answerTextC9[iZero];
        }

//Determining if the users answers are True or False
        if (questionValue == 1) {
            if (v.getId() == R.id.button2) {
                isATOF9[0] = "True";
                score9++;
            } else {
                isATOF9[0] = "False";
            }
        }

        if (questionValue == 2) {
            if (v.getId() == R.id.button3) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 3) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 4) {
            if (v.getId() == R.id.button2) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }

        if (questionValue == 5) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 6) {
            if (v.getId() == R.id.button3) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 7) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 8) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }

        if (questionValue == 9) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }
        if (questionValue == 10) {
            if (v.getId() == R.id.button1) {
                isATOF9[iZero] = "True";
                score9++;
            } else {
                isATOF9[iZero] = "False";
            }
        }

        questionValue++;

        questionIndex++;


        if (questionIndex < questions9.length){

//this sets the text to the next question
            questionView.setText(questions9[questionIndex]);

// set the answerView(s) to the next answer options
            answerViewA.setText(answerTextA9[questionIndex]);
            answerViewB.setText(answerTextB9[questionIndex]);
            answerViewC.setText(answerTextC9[questionIndex]);
            questionNumber.setText("Question " + questionValue + ".");

//Incrementing needed to catch users Answers and to determine if true or false//
            iZero++;
       }
//When the quiz is complete
        else {
            quizTimer.cancel();
            Intent intent9 = new Intent(Test9.this, UsersAnswers9.class);

            intent9.putExtra("usersAnswers9", usersAnswers9);
            intent9.putExtra("isATOF9", isATOF9);
            intent9.putExtra("score9", score9);
            startActivity(intent9);

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


