package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/28.
 */
    //面向对象的编程：
/*public class Count3Quit2 {
    public static void main(String[] args) {
        //建立一个500人的圈子
        KidCircle kc = new KidCircle(500);
        System.out.println(kc.count);
        //执行数3退1的游戏规则

        int countNum = 0;
        Kid k = kc.first;
        while ( kc.count > 1) {
            countNum++;
            if( countNum == 3 ) {
                kc.delete(k);
                countNum = 0;
            }
            k = k.right;
        }
        System.out.println(kc.first.id);
    }
}



class Kid {
    int id;
    Kid left;
    Kid right;
}

class KidCircle {
    int count = 0;
    Kid first; //成员变量
    Kid  last; //成员变量
    //卧了个槽，这个地方的变量的 i定义 如果换成 count 结果会变成  80(wrong)，现在的结果是435（yes）
    KidCircle(int n) {
        for ( count = 0;count < n;count++ ) {
            add();
        }
    }

    void add() {
        Kid k = new Kid();
        k.id = count;
        if (count <= 0) {
            first = k;
            last = k;
            k.left = k;
            k.right = k;
        } else {
            last.right = k;
            k.left = last;
            k.right = first;
            first.left = k;
            last = k;
        }
    }

    void delete(Kid k) {
        if ( count == 0){
            System.out.println("没人了。");
        }
        else if (count == 1 ){
            first = last = null;
            System.out.println("已删除最后一人。");
        }
        else {
            k.left.right = k.right;
            k.right.left = k.left;

            if (k == first) {
                first = k.right;
            } else if (k == last) {
                last = k.left;
            }
        }
        count--;
    }
}*/
//面向对象的编程思想，500个人站一圈；名词：人，一圈；
//面向过程，套了一个面向对象的壳
//什么时候游戏结束？最后只剩下一个人的时候，游戏结束；
        //最后一人时，调到队列的开头，继续计算；
/*        boolean  arr[] = new boolean[500];

        for (int i = 0;i<arr.length;i++) {
            arr[i] = true;
        }
        int countNum=0;
        int i = 0;

        for (int falseNum=0; falseNum < arr.length-1; ){

             if ( arr[i] == true) {
                 countNum++;
                 if (countNum == 3 ) {
                     countNum = 0 ;
                     arr[i] = false;
                     falseNum++;
                 }
             }

             i++;
            if (i == arr.length ){
                i = 0;
            }
        }

        for (int index=0;index<arr.length;index++) {
            if (arr[index] == true) {
                System.out.println(index);
            }
        }
*/

