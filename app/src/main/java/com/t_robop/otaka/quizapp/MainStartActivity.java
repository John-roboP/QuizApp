package com.t_robop.otaka.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//タイトル画面
public class MainStartActivity extends AppCompatActivity {

    TextView tvstart; //QuizApp

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_start);
        tvstart = (TextView) findViewById(R.id.Quizapp);
    }
    public void buttonstart (View view){
        Intent intent = new Intent();   //QuizActivityに変遷
        intent.setClass(this, QuizActivity.class);

        startActivity(intent);


    }
}
