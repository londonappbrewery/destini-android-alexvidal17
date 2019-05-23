package com.londonappbrewery.destini;

public class Question {

    private String buttom;
    private int mQuestionID;

    public Question(int questionID, String buttom) {
        this.buttom = buttom;
        mQuestionID = questionID;
    }

    public String getButtom() {
        return buttom;
    }

    public void setButtom(String buttom) {
        this.buttom = buttom;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }
}
