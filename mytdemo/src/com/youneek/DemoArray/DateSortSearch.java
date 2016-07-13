package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/28.
 */
public class DateSortSearch {
    public static void main(String[] args) {
        Date[] arrayB = new Date[5];//分配引用类型的空间
        arrayB[0] = new Date(2013, 4, 25); arrayB[1] = new Date(2016, 4, 26);
        arrayB[2] = new Date(2014, 4, 27); arrayB[3] = new Date(2016, 5, 29);
        arrayB[4] = new Date(2016, 4, 28);
        Date d = new Date(2016, 4, 26);//寻找数组 d 在数组 arryB 中的位置。
        //对数组进行排序，冒泡（bubbles）方法进行排序
        bubbleSort(arrayB);
        for (int i = 0;i<arrayB.length;i++) {
            //直接打印对象的引用时，相当于调用了 “toString”函数
            System.out.println(arrayB[i] );
        }
        System.out.println( search(arrayB,d) );
    }
    //方法定义的时候，必须在main方法之外，方法和方法不能互相包含!!!
    // 语法正确的时候，确定方法是否放错地方了
    public static Date[] bubbleSort ( Date [ ] a) {
        int len = a.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j].compare(a[j + 1]) > 0) {
                    Date temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
    //二分法搜索
    public static int search (Date [ ] a, Date d)  {
        int startPos = 0;
        int endPos = a.length - 1;
        int m = (startPos+endPos)/2;
        //怎么比较两个数组的大小
        while (startPos < endPos) {
            System.out.println(a[m]);
            if (a[m].compare(d)==0) {
                return m;
            }
            if (a[m].compare(d)>0) {
                endPos = m;
            }
            if(a[m].compare(d) < 0) {
                startPos = m;
            }
            m = (startPos+endPos)/2;
        }
        return -1;
    }


}



//定义日期的类
class Date {
    int year , month, day;
    Date (int x,int y,int z){
        year = x;     month = y;        day = z;
    }
    public int compare(Date d) {
        return year > d.year ? 1
                : year < d.year ? -1
                :month > d.month? 1
                :month < d.month? -1
                :day > d.day ? 1
                :day < d.day? -1:0;
    }
    public String toString () {
        return "year—month—day = "+year+"—"+month+"—"+day;
    }
}