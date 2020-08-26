package com.crc.sort.learn.learn;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-30 13:55
 * @descripton: 归并排序（时间复杂度：最优O(n*logn)，最差O(n*logn)，平均O(n*logn)
 *                          空间复杂度：O(n)
 *                          稳定）
 */
public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i=left;
        int j=mid+1;
        int index=0;
        while (i<=mid && j<=right){
            if (array[i]<= array[j]){
                temp[index++]=array[i++];
            }else {
                temp[index++]=array[j++];
            }
        }

        while (i<=mid){
            temp[index++]=array[i++];
        }
        while (j<=right){
            temp[index++]=array[j++];
        }

        for (int m=0;m<index;m++){
            array[left+m]=temp[m];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        mergeSort(array, 0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
