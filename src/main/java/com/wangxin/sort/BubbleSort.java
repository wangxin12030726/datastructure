package com.wangxin.sort;

import java.util.Arrays;

/**
 * 冒泡排序 一次比较2个数的大小，如果发现前一个数大于后一个数，则交换位置，每一轮比较结束后则最后一个数为最大数（从小到大排序）
 * 8,6,9 -1,5
 * 第一轮 6,8,-1,5,9
 * 第二轮 6,-1,5,8,9
 * 第三轮 -1,6,5,8,9
 * 第四轮 -1,5,6,8,9
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,6,9,-1,5};
        bubbleSort(arr);
    }

    //普通排序
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=0;j<arr.length -1 ;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
    //优化排序，当发现有其中一轮的排序没有进行位置的交换，则视为已经排序完成，无需再进行后面的排序
    public static void bubbleSort2(int[] arr){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=0;j<arr.length -1 ;j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!flag){
                break;
            }else{
                flag = false;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
