package com.t_robop.otaka.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Quiz2Activity extends AppCompatActivity {
int clear;
    int sum,keyint;//Q1のSumを引き継いだ


    TextView tvQ,tvA,tvB,tvC,tvD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        Intent intent = getIntent();
        keyint = intent.getIntExtra("test",0); //０が入っているがotameshiを引き継いでいるため3が画面に表示される。

        sum=keyint;//sumに値を戻す

        tvQ= (TextView) findViewById(R.id.textV2);        //問題文
        tvA= (TextView) findViewById(R.id.q2tvA);        //問題文
        tvB= (TextView) findViewById(R.id.q2tvB);        //問題文
        tvC= (TextView) findViewById(R.id.q2tvC);        //問題文
        tvD=  (TextView) findViewById(R.id.q2tvD);        //問題文
    }
    public void Q2Abutton(View view){//
        //Aボタン

        if(clear==0){
            tvA.setText("不正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);

        }else{
            tvA.setText("正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }

    }
    public void Q2Bbutton(View view){ //Q2はBが正解
    //Bボタン
        clear=1;
        sum+=1;
        if(clear==0){
            tvB.setText("不正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }else{
            tvB.setText("正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }

    }
    public void Q2Cbutton(View view){//Cボタン
        if(clear==0){
            tvC.setText("不正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }else{
            tvC.setText("正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }

    }
    public void Q2Dbutton(View view){//Dボタン
        if(clear==0){
            tvD.setText("不正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }else{
            tvD.setText("正解");
            Intent result = new Intent();   //result画面に変遷

            result.putExtra("test2", sum);
            result.setClass(this, ResultActivity.class);


            // SubActivity の起動
            startActivity(result);
        }

    }
}
