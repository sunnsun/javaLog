package com.example.androidsunsun.lesson3;


import android.util.Log;

class Human extends Animal implements Thinkable{
    static String to_jp="人間";
    String hobby; //～について考える

    //Human（）コンストラクタ
    public Human(String name,int age,String hobby){
        this.name = name;      //メンバ変数name
        this.age = age;     //メンバ変数age
        this.hobby = hobby;    //メンバ変数hobby
    }
    public static void introduce(){
        Log.d("javatest","これは人間クラスです");
    }
    public void say(){
        Log.d("javatest","私の名前は"+name+"です。");
        Log.d("javatest","年は"+age+"です。");
    }
    @Override
    public void think() {
        Log.d("javatest","私は"+hobby+"について考える。");
    }
}
