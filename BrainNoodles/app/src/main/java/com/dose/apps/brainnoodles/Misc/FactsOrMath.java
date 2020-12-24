package com.dose.apps.brainnoodles.Misc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dose.apps.brainnoodles.ChooseMathOrTest.ChooseAMath;
import com.dose.apps.brainnoodles.ChooseMathOrTest.ChooseATest;
import com.dose.apps.brainnoodles.ProductiveProcrastination.ProductiveProcrastination;
import com.dose.apps.brainnoodles.R;

/**
 * Created by kamalu on 12/27/2017.
 */

public class FactsOrMath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts_or_math);

        //Initializing Buttons

    }

    public void onButtonClick(View v) {

        if (v.getId()==R.id.randomFacts){
            startActivity(new Intent(FactsOrMath.this, ChooseATest.class));
        }
        if (v.getId()==R.id.fastMath){
            startActivity(new Intent(FactsOrMath.this, ChooseAMath.class));
        }
        if (v.getId()==R.id.productive_procrastination){
            startActivity(new Intent(FactsOrMath.this, ProductiveProcrastination.class));
        }
    }
    }
