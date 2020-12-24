package com.dose.apps.brainnoodles.Misc;



    import android.content.Intent;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;

    import com.dose.apps.brainnoodles.R;
    import com.dose.apps.brainnoodles.Tests.Test1;
    import com.dose.apps.brainnoodles.Tests.Test10;
    import com.dose.apps.brainnoodles.Tests.Test11;
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


public class Retry extends AppCompatActivity {

        Integer whichTest;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.retry);

        }

        public void onButtonClick(View v)
        {
            if (v.getId()== R.id.retry){

                Bundle extras = getIntent().getExtras();
                whichTest = extras.getInt("whichTest");


                if (whichTest == 1){
                    Intent intent1 = new Intent(Retry.this, Test1.class);
                    startActivity(intent1);
                }

                if (whichTest == 2){
                    Intent intent1 = new Intent(Retry.this, Test2.class);
                    startActivity(intent1);
                }


                if (whichTest == 3){
                    Intent intent1 = new Intent(Retry.this, Test3.class);
                    startActivity(intent1);
                }

                if (whichTest == 4){
                    Intent intent1 = new Intent(Retry.this, Test4.class);
                    startActivity(intent1);
                }

                if (whichTest == 5){
                    Intent intent1 = new Intent(Retry.this, Test5.class);
                    startActivity(intent1);
                }

                if (whichTest == 6){
                    Intent intent1 = new Intent(Retry.this, Test6.class);
                    startActivity(intent1);
                }
                if (whichTest == 7){
                    Intent intent1 = new Intent(Retry.this, Test7.class);
                    startActivity(intent1);
                }
                if (whichTest == 8){
                    Intent intent1 = new Intent(Retry.this, Test8.class);
                    startActivity(intent1);
                }
                if (whichTest == 9){
                    Intent intent1 = new Intent(Retry.this, Test9.class);
                    startActivity(intent1);
                }
                if (whichTest == 10){
                    Intent intent1 = new Intent(Retry.this, Test10.class);
                    startActivity(intent1);
                }
                if (whichTest == 11){
                    Intent intent1 = new Intent(Retry.this, Test11.class);
                    startActivity(intent1);
                }
                if (whichTest == 12){
                    Intent intent1 = new Intent(Retry.this, Test12.class);
                    startActivity(intent1);
                }
                if (whichTest == 13) {
                    Intent intent1 = new Intent(Retry.this, Test13.class);
                    startActivity(intent1);
                }
                if (whichTest == 14){
                    Intent intent1 = new Intent(Retry.this, Test14.class);
                    startActivity(intent1);
                }
/*                if (whichTest == 15){
                    Intent intent1 = new Intent(Retry.this, Test15.class);
                    startActivity(intent1);
                }
                if (whichTest == 16){
                    Intent intent1 = new Intent(Retry.this, Test16.class);
                    startActivity(intent1);
                }
                if (whichTest == 17){
                    Intent intent1 = new Intent(Retry.this, Test17.class);
                    startActivity(intent1);
                }
                if (whichTest == 18){
                    Intent intent1 = new Intent(Retry.this, Test18.class);
                    startActivity(intent1);
                }
                if (whichTest == 19){
                    Intent intent1 = new Intent(Retry.this, Test19.class);
                    startActivity(intent1);
                }
                if (whichTest == 20){
                    Intent intent1 = new Intent(Retry.this, Test20.class);
                    startActivity(intent1);
                }
                if (whichTest == 21){
                    Intent intent1 = new Intent(Retry.this, Test21.class);
                    startActivity(intent1);
                }
                if (whichTest == 22){
                    Intent intent1 = new Intent(Retry.this, Test22.class);
                    startActivity(intent1);
                }
                if (whichTest == 23){
                    Intent intent1 = new Intent(Retry.this, Test23.class);
                    startActivity(intent1);
                }
                if (whichTest == 24){
                    Intent intent1 = new Intent(Retry.this, Test24.class);
                    startActivity(intent1);
                }
                if (whichTest == 25){
                    Intent intent1 = new Intent(Retry.this, Test25.class);
                    startActivity(intent1);
                }
                if (whichTest == 26){
                    Intent intent1 = new Intent(Retry.this, Test26.class);
                    startActivity(intent1);
                } */
            }
// User Quits
                if(v.getId() == R.id.quit){
                Intent intentQuit = new Intent(Retry.this, MainActivity.class);
                startActivity(intentQuit);
            }
        }
    }

