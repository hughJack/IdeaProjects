package com.youneek.DemoArray;

/**
 * Created by Administrator on 2016/4/28.
 */
public class TestSearch {
    public static void main(String[] args) {
        int a[] = {1,3,6,8,9,10,12,18,20,34};
        int target = 12;//查找 target 在数组中的位置
        System.out.println(binarySearch( a,target));
    }

    public static int binarySearch(int a[],int target) {
        if (a.length == 0) return -1;
        int startPos = 0;
        int endPos = a.length-1;
        int midPos = 0;

        if (a[0] == target) {
            return 0;
        } else if (a[endPos] == target) {
            return endPos;
        } else {
            while (startPos < endPos) {
                midPos = (startPos + endPos) / 2;
                if(a[midPos] == target) {
                    System.out.println(a[midPos]);
                    return midPos;
                }else  if  (a[midPos] > target) {
                    endPos = midPos;
                } else if(a[midPos] <  target){
                    startPos = midPos;
                }
            }
        }
        return -1;
    }
}
