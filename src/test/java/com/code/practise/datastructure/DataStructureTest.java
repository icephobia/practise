package com.code.practise.datastructure;

import org.junit.jupiter.api.Test;

public class DataStructureTest {

    @Test
    void testSkipList() {
        int count = 20000;
        int mid = count / 2;
        long current = System.currentTimeMillis();
        SkipList skipList = new SkipList();
        for (int i = 0; i < count; i++) {
            skipList.insert(i);
        }
        System.out.println(skipList.find(mid));

        System.out.println((System.currentTimeMillis() - current));

        //skipList.printAll();
    }

    @Test
    void testLevel() {
        float f = 1.0f;
        for (int i = 0; i < 16; i++) {
            f = f / 2;
            System.out.println(f * 100 + "%");
        }
    }

    @Test
    void fastFind() {
        int[] a = {2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 7, 8, 9};
        System.out.println(BinarySearch.bSearchFirst(a, 4));
        System.out.println(BinarySearch.bSearchLast(a, 4));
        System.out.println(BinarySearch.bSearchFirstBigThan(a, 4));
        System.out.println(BinarySearch.bSearchFirstBigThan(a, 5));
        System.out.println(BinarySearch.bSearchLastSmallThan(a, 4));
        System.out.println(BinarySearch.bSearchLastSmallThan(a, 5));
    }

}
