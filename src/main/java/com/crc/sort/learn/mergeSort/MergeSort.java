package com.crc.sort.learn.mergeSort;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-12 14:35
 * @descripton: 归并排序
 */
public class MergeSort {

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }

    }

    public void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[index++] = array[i++];
            } else {
                temp[index++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[index++] = array[i++];
        }

        while (j <= right) {
            temp[index++] = array[j++];
        }
        //将临时数组放到array数组中
        for (int m = 0; m < index; m++) {
            array[left + m] = temp[m];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
