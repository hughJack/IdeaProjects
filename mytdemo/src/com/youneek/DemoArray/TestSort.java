package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/25.
 */
public class TestSort {


    public static void main(String[] args) {
        int [] a = {3,4,7,8,0,1,2,6,5,9};
        /*int [] a = new int[args.length];
        for (int i=0;i<args.length;i++) {
           a[i] = Integer.parseInt(args[i]);
        }*/
        //print( a );
        selectionSort1(a);
        SelectionSort2(a);
        SelectionSort3(a);
    }

    private static void selectionSort1(int [] a ){
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i] > a[j]) {
                    int temp = a [j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        String s [] = {"未知排序法"};
        print ( a );
    }

//我的解法,选择排序
    private static void SelectionSort2(int a [] ) {
         int temp , value;         //不需要每次都分配栈空间
        for (int i=0; i<a.length; i++) {
            value = a[i];temp = i; //保存a[i]的位置和数值
            for ( int j=i+1; j<a.length; j++) {
                  if ( a[j] < a[i] ) {
                    a[i] = a[j];   // a[i] 保存位置最小值
                    temp = j;      // temp 保存数值最小值对应的位置
                }
            }
            a[temp] = value;
            print(a); System.out.print(i + "\n");
        }
    }

//尚学堂解法，选择排序
    private static void SelectionSort3(int a [] ) {
        int k,temp;       //不需要每次都分配栈空间
        for (int i=0;i<a.length;i++) {
             k = i;
            //找出后面序列中的 最小值对应的位置 k
            for ( int j=k+1;j<a.length;j++) {
                if ( a[j] < a[k] ) {
                    k = j;
                }
            }
            if ( k != i ) {
                temp =a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        print(a);
    }
    private static void  print(int [] a ) {
        for (int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        //System.out.print("\n");
    }


}
