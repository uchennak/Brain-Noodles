package com.dose.apps.brainnoodles.ChooseMathOrTest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.dose.apps.brainnoodles.Misc.MainActivity;
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


public class ChooseATest extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_a_test);
    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.buttonA) {
            startActivity(new Intent(ChooseATest.this, Test1.class));
        }
        if (v.getId() == R.id.buttonB) {
            startActivity(new Intent(ChooseATest.this, Test2.class));
        }
        if (v.getId() == R.id.buttonC) {
            startActivity(new Intent(ChooseATest.this, Test3.class));
        }
        if (v.getId() == R.id.buttonD) {
            startActivity(new Intent(ChooseATest.this, Test4.class));
        }
        if (v.getId() == R.id.buttonE) {
            startActivity(new Intent(ChooseATest.this, Test5.class));
        }
        if (v.getId() == R.id.buttonF) {
            startActivity(new Intent(ChooseATest.this, Test6.class));
        }
        if (v.getId() == R.id.buttonG) {
            startActivity(new Intent(ChooseATest.this, Test7.class));
        }
        if (v.getId() == R.id.buttonH) {
            startActivity(new Intent(ChooseATest.this, Test8.class));
        }
        if (v.getId() == R.id.buttonI) {
            startActivity(new Intent(ChooseATest.this, Test9.class));
        }
        if (v.getId() == R.id.buttonJ) {
            startActivity(new Intent(ChooseATest.this, Test10.class));
        }
        if (v.getId() == R.id.buttonK) {
            startActivity(new Intent(ChooseATest.this, Test11.class));
        }
        if (v.getId() == R.id.buttonL) {
            startActivity(new Intent(ChooseATest.this, Test12.class));
        }
        if (v.getId() == R.id.buttonM) {
            startActivity(new Intent(ChooseATest.this, Test13.class));
        }
        if (v.getId() == R.id.buttonN) {
            startActivity(new Intent(ChooseATest.this, Test14.class));
        }
        if (v.getId()== R.id.home_button){
            startActivity(new Intent(ChooseATest.this, MainActivity.class));
        }
    }


}