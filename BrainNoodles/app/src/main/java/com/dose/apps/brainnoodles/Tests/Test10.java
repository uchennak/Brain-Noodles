package com.dose.apps.brainnoodles.Tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers10;

public class Test10 extends ActionBarActivity {
    // Incremented Variables

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score10 = 0;

    int iZero = 0;

//Non-incremented variables

    QuizTimer quizTimer;
    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;
    TextView textCounter;

    ImageView button1, button2, button3;

//Questions

    String[] questions10 = {
     "Which body of water doesn't contain freshwater?",  //Array 0
      "Who created the lightbulb?",  //Array
      "Audio is another term for...?",  //Array 2
      "3 strikes and you're...?",  //Array 3
      "Grapes grow on a ...?",  //Array 4
      "Raisins are dried up...",  //Array 5
      "On a graph, the x-axis goes ...", //Array 6
      "On a graph, the x-axis goes ...", //Array 7
      "On a graph, the y-axis goes ...", //Array 8
       "On a graph, the y-axis goes ...", //Array 9

        };

//Answers A

    String[] answerTextA10 = {
      "River",  //Array 0
      "Thomas Edison",  //Array 1
      "Sound",  //Array 2
      "Out",  //Array 3
      "Vine",  //Array 4
      "Plums",  //Array 5
      "Left-Right", //Array 6
      "Horizontally", //Array 7
      "Left-Right", //Array 8
      "Horizontally" //Array 9

    };

//Answers B

    String[] answerTextB10 = {
    "Ocean",  //Array 0
    "Thomas Jefferson",  //Array 1
    "Video",  //Array 2
    "In",  //Array 3
    "Tree",  //Array 4
    "Prunes",  //Array 5
    "Up-Down", //Array 6
    "Vertically", //Array 7
    "Right-Left", //Array 8
    "Vertically" //Array 9
    };


//Answers C

    String[] answerTextC10 = {
   "Pond",  //Array 0
   "Thomas English Muffin",  //Array 1
   "Audience",  //Array 2
   "Crazy",  //Array 3
   "Swimming pool",  //Array 4
   "Grapes",  //Array 5
   "Down-Up", //Array 6
   "Diagonally", //Array 7
   "Down-Up", //Array 8
   "Diagonally"  //Array 9
    };

    // User's Answer Choices

    public String[] usersAnswers10 = {
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

    public String[] isATOF10 = {
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
        answerViewA.setText(answerTextA10[questionIndex]);
        answerViewB.setText(answerTextB10[questionIndex]);
        answerViewC.setText(answerTextC10[questionIndex]);
        questionView.setText(questions10[questionIndex]);


//Starting the timer

        textCounter = ((TextView) findViewById(R.id.textCounter));
        quizTimer = new QuizTimer(textCounter, 29000, 1000);
        quizTimer.start();

    }

public void onButton1Click(View v) {

//Catching user's answers

        if (v.getId() == R.id.button1) {
            usersAnswers10[iZero] = answerTextA10[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers10[iZero] = answerTextB10[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers10[iZero] = answerTextC10[iZero];
        }


//Determining if the users answers are True or False
    if (questionValue == 1) {
        if (v.getId() == R.id.button2) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 2) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 3) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 4) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 5) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 6) {
        if (v.getId() == R.id.button3) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }


    if (questionValue == 7) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 8) {
        if (v.getId() == R.id.button1) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 9) {
        if (v.getId() == R.id.button3) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }

    if (questionValue == 10) {
        if (v.getId() == R.id.button2) {
            isATOF10[iZero] = "True";
            score10++;
        } else {
            isATOF10[iZero] = "False";
        }
    }


    questionValue++;

    questionIndex++;


    if (questionIndex < questions10.length)

    {

//this sets the text to the next question

        questionView.setText(questions10[questionIndex]);


// set the answerView(s) to the next answer options

        answerViewA.setText(answerTextA10[questionIndex]);
        answerViewB.setText(answerTextB10[questionIndex]);
        answerViewC.setText(answerTextC10[questionIndex]);
        questionNumber.setText("Question " + questionValue + ".");

//Incrementing iZero to catch users Answers and to determine if true or false

        iZero++;
    }
    else {

        quizTimer.cancel();
        Intent intent10 = new Intent(Test10.this, UsersAnswers10.class);

        intent10.putExtra("usersAnswers10", usersAnswers10);
        intent10.putExtra("isATOF10", isATOF10);
        intent10.putExtra("score10", score10);
        startActivity(intent10);

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






