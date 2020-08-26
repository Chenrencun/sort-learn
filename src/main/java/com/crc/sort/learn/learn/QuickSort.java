package com.crc.sort.learn.learn;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-26 14:57
 * @descripton: 快速排序（时间复杂度：最优O(n*logn)，最差O(n^2)，平均O(n*logn)
 *                        空间复杂度：O(logn)
 *                        不稳定）
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int base = array[left];
        int i = left, j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                Util.swap(array, i, j);
            }
        }
        Util.swap(array, left, i);
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 9, 0};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
