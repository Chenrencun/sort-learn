package com.crc.sort.learn.binaryInsertSort;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-14 20:35
 * @descripton: 二分插入排序
 */
public class BinaryInsertSort {

    public void binaryInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int mid;
            int left = 0, right = i - 1;
            while (left <= right) {
                mid=(left+right)/2;
                if (temp<array[mid]){
                    right--;
                } else {
                    left++;
                }
            }
            for (int j=i-1;j>=left;j--) {
                array[j+1]=array[j];
            }
            array[left]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        BinaryInsertSort binaryInsertSort = new BinaryInsertSort();
        binaryInsertSort.binaryInsertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
