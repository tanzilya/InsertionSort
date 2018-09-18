package com.example.tanzilyayakshimbetova.javatest;

// complexity O(n^2) time

public class InsertionSort {
    public int[] insertionSortOfArray(int[] A) {
        int key = 0, i = 0;

        for (int j = 1; j < A.length; j++ ) {
            key = A[j];
            i = j - 1;
            while(i >= 0 && A[i] > key) {
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
        return A;
    }

}
