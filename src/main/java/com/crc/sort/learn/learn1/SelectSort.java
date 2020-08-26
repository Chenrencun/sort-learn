package com.crc.sort.learn.learn1;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-07-01 16:40
 * @descripton:
 */
public class SelectSort {

    public static void selectSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex != i) Util.swap(array,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
