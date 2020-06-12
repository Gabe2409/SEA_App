package com.example.quizappdemo;

import android.provider.BaseColumns;

public final class QuestionTable{

    private QuestionTable(){}

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_CHOICE1 = "choice1";
        public static final String COLUMN_CHOICE2 = "choice2";
        public static final String COLUMN_CHOICE3 = "choice3";
        public static final String COLUMN_CHOICE4 = "choice4";
        public static final String COLUMN_ANSWER = "answer_nr";
        public static final String COLUMN_TOPIC= "topic";

    }


}
