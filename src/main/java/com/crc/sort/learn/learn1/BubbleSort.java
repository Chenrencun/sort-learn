package com.crc.sort.learn.learn1;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-07-01 8:42
 * @descripton:
 */
public class BubbleSort {

    public static void bubbleSort(int[] array){
        Boolean isSort=true;
        for (int i=0; i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    Util.swap(array, j, j+1);
                    isSort=false;
                }
            }
            if (isSort) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
