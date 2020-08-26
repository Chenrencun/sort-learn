package com.crc.sort.learn.learn1;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-07-01 15:23
 * @descripton: 二分插入排序（时间复杂度：最优O(nlogn)，最差O(n^2)，平均O(n^2)
 *                              空间复杂度：O(1)
 *                              稳定）
 */
public class BinaryInsertSort {

    public static void binaryInsertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int temp=array[i];
            int left=0,right=i-1;
            int mid;
            while (left<=right){
                mid=(left+right)/2;
                if (array[mid]>temp){
                    right--;
                }else {
                    left++;
                }
            }
            for (int j=i-1;j>=left;j--){
                array[j+1]=array[j];
            }
            array[left]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 9, 1, 9, 0};
        binaryInsertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
