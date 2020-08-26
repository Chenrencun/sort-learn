package com.crc.sort.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-06-14 14:21
 * @descripton:
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(2);
        integerList.add(0);

        Collections.sort(integerList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(integerList);
    }
}
