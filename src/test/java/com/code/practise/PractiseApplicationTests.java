package com.code.practise;

import java.util.concurrent.ConcurrentSkipListMap;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PractiseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void qsort() {
        int[] a = {2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 7, 8, 9};
        System.out.println(bSearchFirst(a, 4));
        System.out.println(bSearchLast(a, 4));
        System.out.println(bSearchFirstBigThan(a, 4));
        System.out.println(bSearchFirstBigThan(a, 5));
        System.out.println(bSearchLastSmallThan(a, 4));
        System.out.println(bSearchLastSmallThan(a, 5));
    }

    public int bSearchFirst(int[] a, int value) {
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

    public int bSearchLast(int[] a, int value) {
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

    public int bSearchFirstBigThan(int[] a, int value) {
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

    public int bSearchLastSmallThan(int[] a, int value) {
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

    public int bsearch(int[] a, int n, int value) {
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
