package com.crc.sort.learn.bubbleSort;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-11 9:36
 * @descripton: 冒泡排序(优化)
 */
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        boolean isSort=true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swap(array, j, j+1);
                    isSort=false;
                }
            }
            if (isSort) break;
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5, 4, 6, 1, 3, 4, 1, 9, 0};
        array = bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
