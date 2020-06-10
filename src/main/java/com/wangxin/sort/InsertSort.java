package com.wangxin.sort;

import java.util.Arrays;

/**
 * 插入排序  从第二个数开始，每增加一轮，startIndex+1，一次与前面的数比较，找到合适自己的位置，并插入
 *
 * 8,6,9,-1,5
 *第一轮 6,8,9,-1,5
 *第二轮 6,8,9,-1,5
 * 第三轮 -1,6,8,9,5
 * 第四轮 -1,5,6,8,9
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {8,6,9,-1,5};
        insertSort(arr);

    }

    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0 && arr[j-1] > arr[j];--j){
                int tem = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tem;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
