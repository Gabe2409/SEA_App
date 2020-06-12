package com.example.quizappdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.example.quizappdemo.QuestionTable.*;
import java.util.ArrayList;
import java.util.List;


public class QuizDBHelper  extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "QuizDatabase.db";
    private static final int DATABASE_VERSION = 1;


    private SQLiteDatabase db;



    public QuizDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_CHOICE1  + " TEXT, " +
                QuestionsTable.COLUMN_CHOICE2  + " TEXT, " +
                QuestionsTable.COLUMN_CHOICE3  + " TEXT, " +
                QuestionsTable.COLUMN_CHOICE4  + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER  + " INTEGER, " +
                QuestionsTable.COLUMN_TOPIC + "TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }



    //Add New Variables from 'Question' Class Here when Changing things in the Database
    private void fillQuestionsTable() {
        Question q1 = new Question("A is correct", "A", "B", "C", "D", 1, "Angles");
        addQuestion(q1);

    }


    //Add on New ones following the Template
    private void addQuestion(Question question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_CHOICE1, question.getChoice1());
        cv.put(QuestionsTable.COLUMN_CHOICE2, question.getChoice2());
        cv.put(QuestionsTable.COLUMN_CHOICE3, question.getChoice3());
        cv.put(QuestionsTable.COLUMN_CHOICE4, question.getChoice4());
        cv.put(QuestionsTable.COLUMN_ANSWER, question.getAnswer());
        cv.put(QuestionsTable.COLUMN_TOPIC, question.getTopic());

        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<Question> getAllQuestions() {

       List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setChoice1(c.getString(c.getColumnIndex((QuestionsTable.COLUMN_CHOICE1))));
                question.setChoice2(c.getString(c.getColumnIndex((QuestionsTable.COLUMN_CHOICE2))));
                question.setChoice3(c.getString(c.getColumnIndex((QuestionsTable.COLUMN_CHOICE3))));
                question.setChoice4(c.getString(c.getColumnIndex((QuestionsTable.COLUMN_CHOICE4))));
                question.setAnswer(c.getInt(c.getColumnIndex((QuestionsTable.COLUMN_ANSWER))));
                question.setTopic(c.getString(c.getColumnIndex((QuestionsTable.COLUMN_TOPIC))));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }


}

