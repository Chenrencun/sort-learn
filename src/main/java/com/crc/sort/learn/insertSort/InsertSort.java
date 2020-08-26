package com.crc.sort.learn.insertSort;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-12 13:57
 * @descripton: 插入排序
 */
public class InsertSort {

    public void insertSort(int[] array) {
        for (int i=1;i<array.length;i++) {
            int temp=array[i];
            int j=i-1;
            for (;j>=0;j--) {
                if (temp>=array[j]){
                    break;
                }
                else {
                    array[j+1]=array[j];
                }
            }
            array[j+1]=temp;
        }
    }

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
