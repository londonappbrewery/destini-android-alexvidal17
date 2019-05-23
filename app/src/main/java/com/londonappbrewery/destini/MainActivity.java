package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Member variables
    private TextView mTextView;
    private Button mTopButton;
    private Button mBottomButton;

    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        // listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    updateIndex(3); //T3_STORY
                } else if(mStoryIndex == 3){
                    updateIndex(6); //T6_END
                } else if(mStoryIndex == 2){
                    updateIndex(3); //T6_END
                }
            }
        });

        // listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    updateIndex(2); //T2_STORY
                } else if(mStoryIndex == 2){
                    updateIndex(4); //T4_END
                } else if(mStoryIndex == 3){
                    updateIndex(5); //T5_END
                }
            }
        });
    }

    private void updateIndex(int index){
        if(index == 2){
            mStoryIndex = 2;
            mTextView.setText(R.string.T2_Story_ES);
            mTopButton.setText(R.string.T2_Ans1_ES);
            mBottomButton.setText(R.string.T2_Ans2_ES);
        } else if(index == 3) {
            mStoryIndex = 3;
            mTextView.setText(R.string.T3_Story_ES);
            mTopButton.setText(R.string.T3_Ans1_ES);
            mBottomButton.setText(R.string.T3_Ans2_ES);
        } else if(index == 4){
            mStoryIndex = 4;
            mTextView.setText(R.string.T4_End_ES);
            //ocultar botones
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else if(index == 5){
            mStoryIndex = 5;
            mTextView.setText(R.string.T5_End_ES);
            //ocultar botones
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else if(index == 6){
            mStoryIndex = 6;
            mTextView.setText(R.string.T6_End_ES);
            //ocultar botones
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }

}
