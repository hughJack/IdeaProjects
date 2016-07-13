package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/27.
 */

public class TestCount3Quit {

    public static void main(String[] args) {
        KidCircle kc = new KidCircle (500);
//        System.out.println(kc.count);

    int CountNum = 0;
        Kid k = kc.first;
        while ( kc.count > 1 ) {
                CountNum++;
            if (CountNum == 3) {
                kc.delete( k );
                CountNum = 0;
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

//双向回环链表
class KidCircle{
    int count = 0 ;
    Kid first,last;
    KidCircle (int n) {
        for (int i = 0 ;i<n;i++) {
            add();
        }
    }
//添加成员
 void add () {
     Kid k =new Kid();
     k.id = count;
     if ( count <= 0 ) {
         first = k;
          last = k;
         k.left = first;
         k.right = last;
     }
     else {
         last.right =k;
         k.right = first;
         k.left = last;
         first.left = k;//漏掉了这一行代码
         last = k;
     }
     count++;
 }
//删除成员
    void delete (Kid k){
        if(count <= 0){
            System.out.print("无人可删");
        }else if (count == 1){
            first = last = null;
            count = 0;
        }else {
            k.left.right = k.right;
            k.right.left = k.left;
           if ( k == first) {
               first = k.right;
               if ( k == last) {
               last = k.left ;}
           }
        }
        count--;
    }
}
