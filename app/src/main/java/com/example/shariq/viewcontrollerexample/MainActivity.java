package com.example.shariq.viewcontrollerexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
/*the primary goal of this example is to generate an activity containing three buttons which when
* clicked on will display the corresponding answer to the first three euler problems */

public class MainActivity extends ActionBarActivity {
    private EulerSolutons mEulerSOL = new EulerSolutons();
    private ButtonListeners mButtonListeners = new ButtonListeners();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView displayAnswer = (TextView) findViewById(R.id.eulerAnswer);
        final Button eulerAnswer1 = (Button) findViewById(R.id.eulerAns1);
        final Button eulerAnswer2 = (Button) findViewById(R.id.eulerAns2);
        final Button eulerAnswer3 = (Button) findViewById(R.id.eulerAns3);


        //setting the on click listener for each of the buttons
        eulerAnswer1.setOnClickListener(mButtonListeners.buttonListener(displayAnswer, mEulerSOL.eulerSolOne()));
        eulerAnswer2.setOnClickListener(mButtonListeners.buttonListener(displayAnswer, mEulerSOL.eulerSolTwo()));
        eulerAnswer3.setOnClickListener(mButtonListeners.buttonListener(displayAnswer, mEulerSOL.eulerSolThree()));

    }

}
