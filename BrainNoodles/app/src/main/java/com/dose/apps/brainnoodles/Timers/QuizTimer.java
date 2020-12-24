package com.dose.apps.brainnoodles.Timers;


import android.content.Intent;

import android.widget.TextView;

import com.dose.apps.brainnoodles.Misc.Retry;
import com.dose.apps.brainnoodles.Tests.Test1;
import com.dose.apps.brainnoodles.Tests.Test10;
import com.dose.apps.brainnoodles.Tests.Test12;
import com.dose.apps.brainnoodles.Tests.Test13;
import com.dose.apps.brainnoodles.Tests.Test14;
import com.dose.apps.brainnoodles.Tests.Test2;
import com.dose.apps.brainnoodles.Tests.Test3;
import com.dose.apps.brainnoodles.Tests.Test4;
import com.dose.apps.brainnoodles.Tests.Test5;
import com.dose.apps.brainnoodles.Tests.Test6;
import com.dose.apps.brainnoodles.Tests.Test7;
import com.dose.apps.brainnoodles.Tests.Test8;
import com.dose.apps.brainnoodles.Tests.Test9;
import com.dose.apps.brainnoodles.Tests.Test11;


public class QuizTimer extends CountDownTimerPauseable {

        TextView textCounter;

        Integer whichTest;


        public QuizTimer(TextView textCounter, long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            this.textCounter = textCounter;

        }

            @Override
            public void onTick (long millisUntilFinished){

            textCounter.setText(String.valueOf(millisUntilFinished / 1000));


        }

            @Override
            public void onFinish () {


            Intent retryIntent = new Intent(textCounter.getContext(), Retry.class);

            if (textCounter.getContext() instanceof Test1) {
                whichTest = 1;
                retryIntent.putExtra("whichTest", whichTest);
            }
            if (textCounter.getContext() instanceof Test2) {
                whichTest = 2;
                retryIntent.putExtra("whichTest", whichTest);
            }

            if (textCounter.getContext() instanceof Test3) {
                whichTest = 3;
                retryIntent.putExtra("whichTest", whichTest);
            }
            if (textCounter.getContext() instanceof Test4) {
                whichTest = 4;
                retryIntent.putExtra("whichTest", whichTest);
            }

            if (textCounter.getContext() instanceof Test5) {
                whichTest = 5;
                retryIntent.putExtra("whichTest", whichTest);
            }
            if (textCounter.getContext() instanceof Test6) {
                whichTest = 6;
                retryIntent.putExtra("whichTest", whichTest);
            }
            if (textCounter.getContext() instanceof Test7) {
                whichTest = 7;
                retryIntent.putExtra("whichTest", whichTest);
            }
            if (textCounter.getContext() instanceof Test8) {
                whichTest = 8;
                retryIntent.putExtra("whichTest", whichTest);
                }
           if (textCounter.getContext() instanceof Test9) {
               whichTest = 9;
               retryIntent.putExtra("whichTest", whichTest);
           }

           if (textCounter.getContext() instanceof Test10) {
               whichTest = 10;
                retryIntent.putExtra("whichTest", whichTest);
                }

           if (textCounter.getContext() instanceof Test11) {
               whichTest = 11;
                retryIntent.putExtra("whichTest", whichTest);
                }

            if (textCounter.getContext() instanceof Test12) {
               whichTest = 12;
               retryIntent.putExtra("whichTest", whichTest);
                }
            if (textCounter.getContext() instanceof Test13) {
               whichTest = 13;
               retryIntent.putExtra("whichTest", whichTest);
                }
            if (textCounter.getContext() instanceof Test14) {
                whichTest = 14;
                retryIntent.putExtra("whichTest", whichTest);
                }

           textCounter.getContext().startActivity(retryIntent);
        }


        }


