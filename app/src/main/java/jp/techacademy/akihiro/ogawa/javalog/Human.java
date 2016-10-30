package jp.techacademy.akihiro.ogawa.javalog;

/**
 * Created by ogawa on 2016/10/28.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {

    //コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //メンバ関数
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatest", "「私は" + this.hobby + "について考える。」");
    }
}
