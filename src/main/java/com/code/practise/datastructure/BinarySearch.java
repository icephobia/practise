package com.code.practise.datastructure;

public class BinarySearch {

    public static int bSearchFirst(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low < a.length && a[low] == value) {
            return low;
        } else {
            return -1;
        }
    }

    public static int bSearchLast(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (high < a.length && a[high] == value) {
            return high;
        } else {
            return -1;
        }
    }

    public static int bSearchFirstBigThan(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low < a.length && a[low] >= value) {
            return low;
        } else {
            return -1;
        }
    }

    public static int bSearchLastSmallThan(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (high < a.length && a[high] <= value) {
            return high;
        } else {
            return -1;
        }
    }

    public static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < n && a[low] == value) {
            return low;
        } else {
            return -1;
        }
    }
}
