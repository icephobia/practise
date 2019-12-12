package com.code.practise.array;

import java.util.stream.Stream;

public class StaticArray {

    private int count = 0;

    private String[] objs = null;

    public StaticArray(int length) {
        objs = new String[length];
    }

    public void addString(String str) {

        if (count >= objs.length) {
            System.out.println("array is full.");
        } else {
            objs[count] = str;
            count++;
            sort(objs);
        }
    }


    public void deleteString(String str) {
        int position = query(str);
        if (position >= 0) {
            objs[position] = null;
            count--;
            move(objs,position);
        }
    }

    private void move(String[] objs, int position) {
        int i=position;
        while(i<=count&&objs[i+1]!=null){

        }
    }


    public void updateString(String str, String newStr) {
        int position = query(str);
        if (position >= 0) {
            objs[position] = newStr;
            sort(objs);
        }
    }

    public void showInfos() {
        Stream.of(objs).forEach(o -> System.out.print(o + "  "));
        System.out.println();
        System.out.println("--------------");
        System.out.println();
    }

    private void sort(String[] objs) {
        partSort(0, count-1, objs);
    }

    private void partSort(int start, int end, String[] objs) {
        String tmp = null;

        if (end - start <= 1) {

            if (objs[start].compareTo(objs[end]) > 0) {
                tmp = objs[start];
                objs[start] = objs[end];
                objs[end] = tmp;
            }

            return;
        } else {
            int middle = (start + end) / 2;

            int before = start;
            int after = middle + 1;

            tmp = objs[end];
            objs[end] = objs[middle];
            objs[middle] = tmp;

            while (before < middle && after <= end) {
                if (objs[before].compareTo(objs[middle]) > 0) {
                    if (objs[after].compareTo(objs[middle]) < 0) {

                        tmp = objs[before];

                        objs[before] = objs[after];

                        objs[after] = tmp;

                    } else {
                        after++;
                    }
                } else {
                    before++;
                }
            }

            partSort(0, middle - 1, objs);
            partSort(middle + 1, end, objs);
        }
    }

    private int query(String str) {
        return quickQuery(0, count-1, objs, str);
    }

    private int quickQuery(int start, int end, String[] objs, String str) {
        int middle = (start + end) / 2;
        if (middle < start || middle > end) {
            return -1;
        }

        if (str.equals(objs[middle])) {
            return middle;
        }

        if (str.compareTo(objs[middle]) > 0) {
            return quickQuery(middle + 1, end, objs, str);
        } else {
            return quickQuery(0, middle - 1, objs, str);
        }

    }
}
