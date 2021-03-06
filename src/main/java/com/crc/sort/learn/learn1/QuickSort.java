package com.crc.sort.learn.learn1;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-07-02 17:40
 * @descripton:
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right){
        if (left>right){
            return;
        }
        int base=array[left];
        int i=left,j=right;
        while (i != j){
            while (array[j]>=base && i<j){
                j--;
            }
            while (array[i]<=base && i<j){
                i++;
            }
            if (i<j){
                Util.swap(array,i,j);
            }
        }
        Util.swap(array, i,left);
        quickSort(array,left,i-1);
        quickSort(array,i+1,right);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 9, 0};
        quickSort(array, 0 , array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
