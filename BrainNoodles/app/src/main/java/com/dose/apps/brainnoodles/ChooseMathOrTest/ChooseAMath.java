package com.dose.apps.brainnoodles.ChooseMathOrTest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dose.apps.brainnoodles.FastMath.Math1;
import com.dose.apps.brainnoodles.FastMath.Math2;
import com.dose.apps.brainnoodles.FastMath.Math3;
import com.dose.apps.brainnoodles.FastMath.Math4;
import com.dose.apps.brainnoodles.FastMath.Math5;
import com.dose.apps.brainnoodles.FastMath.Math6;
import com.dose.apps.brainnoodles.Misc.MainActivity;
import com.dose.apps.brainnoodles.R;

/**
 * Created by kamalu on 1/5/2018.
 */

public class ChooseAMath extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_a_math);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.easy) {
            startActivity(new Intent(ChooseAMath.this, Math1.class));
        }
        if (v.getId() == R.id.not_as_easy) {
            startActivity(new Intent(ChooseAMath.this, Math2.class));
        }
        if (v.getId() == R.id.harder) {
            startActivity(new Intent(ChooseAMath.this, Math3.class));
        }
        if (v.getId() == R.id.hardest) {
            startActivity(new Intent(ChooseAMath.this, Math4.class));
        }
        if (v.getId() == R.id.hardestV2) {
            startActivity(new Intent(ChooseAMath.this, Math5.class));
        }
        if (v.getId() == R.id.pythag) {
            startActivity(new Intent(ChooseAMath.this, Math6.class));
        }
        if (v.getId()== R.id.home_button){
            startActivity(new Intent(ChooseAMath.this, MainActivity.class));
        }
    }

}
