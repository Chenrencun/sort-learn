package com.crc.sort.learn.learn1;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-07-01 8:53
 * @descripton: 直接插入排序（时间复杂度：最优O(n)，最差O(n^2)，平均O(n^2)
 *                             空间复杂度：O(1)
 *                             稳定）
 */
public class InsertSort {

    public static void insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            for (;j>=0;j--){
                if (array[j]<=temp){
                    break;
                }else {
                    array[j+1]=array[j];
                }
            }
            array[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
