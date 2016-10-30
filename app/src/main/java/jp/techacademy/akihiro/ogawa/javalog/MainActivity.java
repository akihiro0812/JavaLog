package jp.techacademy.akihiro.ogawa.javalog;

import android.support.v7.app.AppCompatActivity;    //パッケージ名.クラス名
import android.os.Bundle;
import android.util.Log;    //ここを追加

public class MainActivity extends AppCompatActivity {
//アクセスコントロール classキーワード 新規クラス名 extendsキーワード 継承元のクラス

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("小川", 34, "マラソン");     //名前を小川、年齢34歳で、Humanのインスタンスを作る

        human.say();

        human.think();

    }
}

