package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/20.
 */
public class TestMonsterDrive {
    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x=0;x<3;x++) {
            ma[x].frightened(x);
        }
        //int j =  1;????????????????????????
        //ma[2].frightened(j);?????????????????????
        //double k = (double)(2);????????????
        //ma[0].frightened(k);?????????????
        //float L = 3.0f;??????????????
        //ma[1].frightened(float L);?????????????????????

    }
}

class Monster {
    boolean frightened (int d) {
        System.out.println("Arrrgh");
        return true;
    }
}

class Vampire extends Monster{
    boolean frightened (int d) {
        System.out.println("a bite ?");
        return true;
    }
}

class Dragon extends Monster{
    boolean frightened (int d) {
        System.out.println("Breath fire");
        return true;
    }
}