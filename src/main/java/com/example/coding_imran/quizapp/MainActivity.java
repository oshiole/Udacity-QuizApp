package com.example.coding_imran.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    EditText question2_answer;
    // Question 3
    CheckBox question3_choice1;
    CheckBox question3_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_choice1;
    // Question 6
    EditText question6_answer;
    // Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_choice2;
    // Question 10
    EditText question10_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3 (2-1)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "lionel messi" or "messi"
        //------------------------------------------------------------------------------------------
        String answer2;
        question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("lionel messi") || answer2.equals("messi")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #1 (Portugal) and #4(Columbia)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question3_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && !answer3_choice3 && answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "ben youssef"
        //------------------------------------------------------------------------------------------
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("ben youssef")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #1 "Uruguay"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice1);
        answer5 = question5_choice1.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "ronaldo" or cristiano ronaldo"
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("ronaldo") || answer6.equals("cristiano ronaldo")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #1 (Jerome Boateng) and #3 (Carlos Sanchez)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (answer7_choice1 && !answer7_choice2 && answer7_choice3 && !answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "ahmed musa"
        //------------------------------------------------------------------------------------------
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("ahmed musa")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "Germany"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "harry kane"
        //------------------------------------------------------------------------------------------
        String answer10;
        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("harry kane")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
