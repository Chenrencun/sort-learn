package com.crc.sort.learn.learn;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-18 14:35
 * @descripton: 选择排序（时间复杂度：最优O(n^2)，最差O(n^2)，平均(n^2)
 *                         空间复杂度：O(1)
 *                         不稳定）
 */
public class SelectSort {

    public static void selectSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            if (minIndex !=i){
                Util.swap(array, i, minIndex);
            }
        }
    }

    public static void main(String[] args) {
        int[] array={5,3,7,1,9,0};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
