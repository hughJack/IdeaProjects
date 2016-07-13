package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/26.
 */
public class TestDateSort {
    public static void main(String[] args) {
        SortDate [] dateArry= new SortDate[5];

        dateArry[0] = new SortDate(2016,2,13);
        dateArry[1] = new SortDate(2016,4,26);
        dateArry[2] = new SortDate(2014,5,26);
        dateArry[3] = new SortDate(2013,5,13);
        dateArry[4] = new SortDate(2014,5,13);

        bubbleSort (dateArry);

        for (int i = 0; i< dateArry.length;i++) {
            System.out.println(dateArry[i]);// 默认调用toString()方法
        }

    }

    //冒泡排序法 bubbles,返回的是SortDate类型的数组的引用
    //最小的会  上浮一个  格子
    public static SortDate []  bubbleSort (SortDate [ ] a) {
        int len = a.length;
        for ( int i = len-1; i>=0; i--) {
            for (int j = 0; j<=i-1; j++) {
                if ( a[j].compare(a[j+1]) > 0 ) {
                    SortDate temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}


class  SortDate {
    int year,month,day;
    SortDate( int year,int month,int day ){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int compare(SortDate a) {
        return   year  > a.year ? 1
                :year  < a.year ? -1
                :month > a.month ? 1
                :month < a.month ? -1
                :day   > a.day ? 1
                :day   <a.day ? -1 : 0;
    }

    public String toString () {
        return "year + month + day ====" + year + "—" + month + "—" + day;
    }
}
