package com.example.shariq.viewcontrollerexample;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Shariq on 12/12/2014.
 */
/*Rather than writing three separate onclick listeners for each button in the main activity
 I thought it would be simpler and more elegant to make a class containing one method definition of an onclick listener which
 I would implement in the main activity*/
public class ButtonListeners {
    protected View.OnClickListener buttonListener(final TextView textView, final String eulerSol){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(eulerSol);
            }
        };
        return listener;
    }
}
