package com.crc.sort.learn.learn;

import com.crc.sort.learn.util.Util;

import java.util.Arrays;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-18 14:27
 * @descripton: 冒泡排序（时间复杂度：最优O(n),最差O(n^2),平均O(n^2)
 *                        空间复杂度：O(1)
 *                        稳定）
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        Boolean isSort=true;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    Util.swap(array, j, j+1);
                    isSort=false;
                }
            }
            if (isSort) break;
        }
    }

    public static void main(String[] args) {
        int[] array={5,3,7,1,9,0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
