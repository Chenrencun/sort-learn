package com.crc.sort.learn.selectSort;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-11 10:33
 * @descripton: 选择排序
 */
public class SelectSort {

    public void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Util.swap(array, minIndex, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(array);
        System.out.println(Arrays.toString(array));
    }


}
