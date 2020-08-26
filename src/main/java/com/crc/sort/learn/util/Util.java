package com.crc.sort.learn.util;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-12 13:50
 * @descripton:
 */
public class Util {

    public static void swap(int[] array, int m, int n) {
        int t = array[m];
        array[m] = array[n];
        array[n] = t;
    }

}
