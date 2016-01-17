package com.t_robop.otaka.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
int res;//合計点

    TextView tvR,tvSeitou,tvsum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        res = intent.getIntExtra("test2",0);//sumを取得してresに入れた

       tvR= (TextView) findViewById(R.id.Rtv);      //最終結果
        tvSeitou= (TextView) findViewById(R.id.tvK);    //正答数
        tvsum= (TextView) findViewById(R.id.textvsum);    //合計点表示

        tvsum.setText(String.valueOf(res));       //合計点を表示

    }
    public void finish(View view){      //終わりボタンを押した時のメソッド
        Intent fintent = new Intent();

        fintent.setClass(this,MainStartActivity.class);

        startActivity(fintent);

    }

}
