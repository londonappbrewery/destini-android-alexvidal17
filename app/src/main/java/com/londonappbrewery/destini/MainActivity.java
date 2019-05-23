package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mTopButton;
    private Button mBottomButton;

    final String top = "TOP";
    final String bottom = "BOTTOM";

    private Question[] mQuestionBank = new Question[] {
            new Question(R.string.T1_Story_ES, top),

    };

    private Question[] botonTop = new Question[]{
            //new Question(R.string.T1_Ans1_ES)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(R.string.T3_Story_ES);
                mTopButton.setText(R.string.T3_Ans1_ES);
                mBottomButton.setText(R.string.T3_Ans2_ES);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //updateQuestion(bottom);
                mTextView.setText(R.string.T2_Story_ES);
                mTopButton.setText(R.string.T2_Ans1_ES);
                mBottomButton.setText(R.string.T2_Ans2_ES);
            }
        });

    }

    private void updateQuestion(String question){
        //if(question == top)
            //mTextView.setText();
    }

}
