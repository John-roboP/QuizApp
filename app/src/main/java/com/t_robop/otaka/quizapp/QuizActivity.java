package com.t_robop.otaka.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    TextView tvQ,tvA,tvB,tvC,tvD;
    int clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        tvQ= (TextView) findViewById(R.id.textQuestion);        //問題文
        tvA= (TextView) findViewById(R.id.textAnsA);  //回答A
        tvB= (TextView) findViewById(R.id.textAnsB);    //回答B
        tvC= (TextView) findViewById(R.id.textAnsC);        //回答C
        tvD=(TextView) findViewById(R.id.textAnsD);  //回答D
    }
    public void Abutton(View view){//正解
        clear=1;//正解は1
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
            Intent answer = new Intent();   //result画面に変遷

            answer.putExtra("test", clear);
            answer.setClass(this,ResultActivity.class);


            // SubActivity の起動
            startActivity(answer);
        }

    }
    public void Bbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }
    public void Cbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }
    public void Dbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }

}
