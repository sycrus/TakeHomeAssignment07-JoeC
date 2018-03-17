package com.example.joe.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CheatActivity extends AppCompatActivity {

    private static final String EXTRA_ANSWER_IS_TRUE = "com.example.joe.geoquiz.answer_is_true";
    private Button mShowAnswerButton;
    private boolean mAnswerIsTrue;
    private TextView mAnswerTextView;

    public static Intent newIntent(Context packageContext, boolean answerIsTrue){
       Intent intent = new Intent(packageContext, CheatActivity.class);
       intent.putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue);
       return intent;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        //Shows answer in current activity
        mAnswerTextView = (TextView) findViewById(R.id.answer_text_view);

        //Confirms user wants to cheat
        mShowAnswerButton = (Button) findViewById(R.id.show_answer_button);
        mShowAnswerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //shows the correct answer
                if (mAnswerIsTrue) {
                    mAnswerTextView.setText(R.string.true_button);
                } else {
                    mAnswerTextView.setText(R.string.false_button);
                }
                Intent intent = new Intent();
                setResult(RESULT_OK,intent);
            }

        });


    }


}
