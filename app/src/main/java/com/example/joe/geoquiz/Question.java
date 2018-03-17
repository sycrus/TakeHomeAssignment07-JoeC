package com.example.joe.geoquiz;

/**
 * Created by joe on 2/19/18.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }
}
