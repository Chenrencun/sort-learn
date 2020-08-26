package com.crc.sort.learn.learn;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-19 16:18
 * @descripton: 直接插入排序
 */
public class InsertSort {

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] <= temp) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 1, 9, 0};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }


}
