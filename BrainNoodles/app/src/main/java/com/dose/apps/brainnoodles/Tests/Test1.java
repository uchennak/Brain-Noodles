package com.dose.apps.brainnoodles.Tests;


import android.content.Intent;
import android.os.Bundle;



import android.support.v7.app.ActionBarActivity;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import com.dose.apps.brainnoodles.Timers.QuizTimer;
import com.dose.apps.brainnoodles.R;
import com.dose.apps.brainnoodles.UsersAnswers.UsersAnswers1;


public class Test1 extends ActionBarActivity {
      /*
  *Icremented Variables
  */

    Integer questionIndex = 0;
    Integer questionValue = 1;
    Integer score1 = 0;

    int iZero = 0;

    //Non-incremented variables


    String halfQues8 = "They got upset when he took ____ stuff.";

    TextView answerViewA, answerViewB, answerViewC, questionView, questionView2, questionNumber;

    ImageView button1, button2;


    QuizTimer quizTimer;
    TextView textCounter;


    /*
     *Questions Array
    */


    String[] questions1 =
            {
                    "How many half days are in 1 day?", //Array 0
                    "4 pears were on sale for $5. How much was each pear?", //Array 1 /
                    "What is the temperature right below 0°F?", //Array 2 //
                    "How long it take to reach 60 miles if going 60mph?", //Array 3 //
                    "How long does it take for Summer to get to the following Summer?", //Array  4
                    "What is 100% of 100?", //Array  5//
                    "What weighs more. 1 pound of feathers, or 1 pound of metal?", //Array 6 //
                    "Which word should be on the empty line?", //Array 7 //
                    "How many licks does it take to get to the tootsie roll center of a tootsie pop(No biting)?", //Array 8
                    "Which statement is true?", //Array 9

            };

    /*
     * Button A
     */
    String[] answerTextA1 = {
            "2", //Array 0
            "2.25", //Array 1
            "-1°C",  //Array 2
            "2 hours", //Array 3
            "12 months", //Array 4
            "100", //Array 5
            "1 pound of feathers", //Array 6
            "their", //Array 7
            "20", //Array 8
            "Dense clouds = more sunlight " //Array 9
    };


    /*
    * Button B
    */
    String[] answerTextB1 = {
            "1", //Array 0
            "1.25", //Array 1
            "-1°F",  //Array 2
            " 1.5 hours",  //Array 3
            " 9 months", //Array 4
            " 10,000", //Array 5
            " 1 pound of metal", //Array 6//
            "there",  //Array 7
            "Less than 20 ", //Array 8
            "Dense clouds = less sunlight", //Array 9

    };

    /*
    * Button C
    */


    String[] answerTextC1 = {
            "1.5", //Array 0
            "1.50", //Array 1
            "1°F",  //Array 2
            "1 hour", //Array 3
            "1.2 years", //Array 4
            "200", //Array 5
            "They weigh the same",  // Array / 6
            "they're",  // Array 7
            "More than 20", //Array 8
            "Both A and B" //Array 9
    };


 /*
*User's Answer Choices
*/

    public String[] usersAnswers1 = {
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

    public String[] isATOF1 = {
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


        // TextView Initializations //

        answerViewA = ((TextView) findViewById(R.id.textView1));
        answerViewB = ((TextView) findViewById(R.id.textView2));
        answerViewC = ((TextView) findViewById(R.id.textView3));
        questionView = ((TextView) findViewById(R.id.questionView));
        questionView2 = ((TextView) findViewById(R.id.questionView2));
        questionNumber = (TextView) findViewById(R.id.questionNumber);

        String questionValueS = Integer.toString(questionValue);
        questionNumber.setText("Question " + questionValueS + ".");
        answerViewA.setText(answerTextA1[questionIndex]);
        answerViewB.setText(answerTextB1[questionIndex]);
        answerViewC.setText(answerTextC1[questionIndex]);
        questionView.setText(questions1[questionIndex]);


        textCounter = ((TextView) findViewById(R.id.textCounter));


        quizTimer = new QuizTimer(textCounter, 31000, 1000);
        quizTimer.start();


    }



    public void onButton1Click(View v) {


//Question Value 8 other half


        if (questionValue == 7) {
            questionView2.setText(halfQues8);
        }

        if (questionValue != 7) {
            questionView2.setText("");
        }

        if (v.getId() == R.id.button1) {
            usersAnswers1[iZero] = answerTextA1[iZero];
        }
        if (v.getId() == R.id.button2) {
            usersAnswers1[iZero] = answerTextB1[iZero];
        }
        if (v.getId() == R.id.button3) {
            usersAnswers1[iZero] = answerTextC1[iZero];
        }


        
        /*
        *Determining if the users answers are True or False
         */

        if (questionValue == 1) {
            if (v.getId() == R.id.button1) {
                isATOF1[0] = "True";
                score1++;
            } else {
                isATOF1[0] = "False";
            }
        }

        if (questionValue == 2) {
            if (v.getId() == R.id.button2) {
                isATOF1[1] = "True";
                score1++;
            } else {
                isATOF1[1] = "False";
            }
        }

        if (questionValue == 3) {
            if (v.getId() == R.id.button2) {
                isATOF1[2] = "True";
                score1++;
            } else {
                isATOF1[2] = "False";
            }
        }


        if (questionValue == 4) {
            if (v.getId() == R.id.button3) {
                isATOF1[3] = "True";
                score1++;
            } else {
                isATOF1[3] = "False";
            }
        }


        if (questionValue == 5) {
            if (v.getId() == R.id.button1) {
                isATOF1[4] = "True";
                score1++;
            } else {
                isATOF1[4] = "False";
            }
        }


        if (questionValue == 6) {
            if (v.getId() == R.id.button1) {
                isATOF1[5] = "True";
                score1++;
            } else {
                isATOF1[5] = "False";
            }
        }


        if (questionValue == 7) {
            if (v.getId() == R.id.button3) {
                isATOF1[6] = "True";
                score1++;
            } else {
                isATOF1[6] = "False";
            }
        }


        if (questionValue == 8) {
            if (v.getId() == R.id.button1) {
                isATOF1[7] = "True";
                score1++;
            } else {
                isATOF1[7] = "False";
            }
        }


        if (questionValue == 9) {
            if (v.getId() == R.id.button3) {
                isATOF1[8] = "True";
                score1++;
            } else {
                isATOF1[8] = "False";
            }
        }


        if (questionValue == 10) {
            if (v.getId() == R.id.button2) {
                isATOF1[9] = "True";
                score1++;
            } else {
                isATOF1[9] = "False";
            }
        }


        questionValue++;
        String questionValueS = Integer.toString(questionValue);

        questionIndex++;


        if (questionIndex < questions1.length)

        {

// make sure the index is in bounds & increment the index//


            questionView.setText(questions1[questionIndex]); // set the text to the next question
 /*
  * set the answerView(s) to the next answer options
*/
            answerViewA.setText(answerTextA1[questionIndex]);
            answerViewB.setText(answerTextB1[questionIndex]);
            answerViewC.setText(answerTextC1[questionIndex]);
            questionNumber.setText("Question " + questionValueS + ".");


            //Incrementing Needed to catch users Answers//

            iZero++;


        } else {


//Pass intent and stop timer

            quizTimer.cancel();
            String score1S = Integer.toString(score1);

            Intent intent1 = new Intent(Test1.this, UsersAnswers1.class);
            intent1.putExtra("usersAnswers1", usersAnswers1);
            intent1.putExtra("isATOF1", isATOF1);
            intent1.putExtra("score1S", score1S);
            startActivity(intent1);
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




