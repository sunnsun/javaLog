package com.example.androidsunsun.lesson3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human1 = new Human("〇〇", 30, "××");     // 名前を〇〇、年齢30歳で、Humanのインスタンスを作る
        Human human2 = new Human("△△", 10, "□□");
        human1.say();
        human1.think();
        human2.say();
        human2.think();
    }
}

