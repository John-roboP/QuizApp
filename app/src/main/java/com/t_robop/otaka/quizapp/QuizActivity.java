package com.t_robop.otaka.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Q1画面
public class QuizActivity extends AppCompatActivity {

    TextView tvQ,tvA,tvB,tvC,tvD;
    int clear; //正解か不正解か
    int sum; //合計点


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
        //Aボタン
        clear=1;//正解は1
        sum+=1;
        if(clear==0){
            tvA.setText("不正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);

        }else{
            tvA.setText("正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }

    }
    public void Bbutton(View view){//Bボタン
        if(clear==0){
            tvB.setText("不正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }else{
            tvB.setText("正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }

    }
    public void Cbutton(View view){//Cボタン
        if(clear==0){
            tvC.setText("不正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }else{
            tvC.setText("正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }

    }
    public void Dbutton(View view){//Dボタン
        if(clear==0){
            tvD.setText("不正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }else{
            tvD.setText("正解");
            Intent qtwo = new Intent();   //Q2画面に変遷

            qtwo.putExtra("test", sum);
            qtwo.setClass(this, Quiz2Activity.class);


            // SubActivity の起動
            startActivity(qtwo);
        }

    }

}
