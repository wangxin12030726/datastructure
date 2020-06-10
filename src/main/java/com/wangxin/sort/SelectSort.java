package com.wangxin.sort;

import java.util.Arrays;

/**
 * 选择排序，每一轮选择出最小的数，然后与当前位置上的数进行互换，这样，每一轮选择能决定出最小的数的位置
 * 8,6,9 -1,5
 * 第一轮 -1,6,9,8,5
 * 第二轮 -1,5,9,8,6
 * 第三轮 -1,5,6,8,9
 * 第四轮 .....
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {8,6,9,-1,5};
        selectSort(arr);
    }

    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            int minValue = arr[minIndex];
            for(int j=i+1;j<arr.length;j++){
                if(minValue > arr[j]){
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
