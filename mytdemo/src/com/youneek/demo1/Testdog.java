package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/15.
 */
public class Testdog {
    //属性
    int furcolor;
    int jiaosheng;
    float weight;
    float height;
    //方法
    void catchmouse( Mouse m)  {
    // m.scream();
    }
    public static void main(String[] args) {
        Testdog d = new Testdog();
        Mouse m =new Mouse();
        d.catchmouse(m);
    }
}
class Mouse{}