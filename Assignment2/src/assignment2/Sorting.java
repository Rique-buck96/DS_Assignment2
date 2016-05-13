/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import static assignment2.Assignment2.comparisons;

/**
 *
 * @author Enrique
 */
public class Sorting {

    private int[] array;
    private int[] tempMergArr;
    private int length;
    private static int[] numbers;
    private static int number;

    public static void BubbleSort(int[] num) {
        int temp;
        for (int i = 0; i < num.length; i++) {

            for (int j = 1; j < num.length; j++) {
                comparisons++;
                if (num[j - 1] > num[j]) {
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;

                }
            }
        }

    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[index]) {
                    index = j;

                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void InsertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                comparisons++;
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;

                }
            }
        }
    }

    public static void MergeSort(int[] list) {

        if (list.length <= 1) {
            return;
        }

        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        // Sort each half
        MergeSort(first);
        MergeSort(second);

        // Merge the halves together, overwriting the original array
        merge(first, second, list);

    }

    private static void merge(int[] first, int[] second, int[] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            comparisons++;
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;

            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

        

        public static void Quicksort(int[] values) {
            // check for empty or null array
            if (values == null || values.length == 0) {
                return;
            }
            numbers = values;
            number = values.length;
            quicksort(0, number - 1);
        }

        private static void quicksort(int low, int high) {
            int i = low, j = high;
            // Get the pivot element from the middle of the list
            int pivot = numbers[low + (high - low) / 2];

            // Divide into two lists
            while (i <= j) {
                // If the current value from the left list is smaller then the pivot
                // element then get the next element from the left list
                while (numbers[i] < pivot) {
                    i++;
                }
                // If the current value from the right list is larger then the pivot
                // element then get the next element from the right list
                while (numbers[j] > pivot) {
                    j--;
                }

                // If we have found a values in the left list which is larger then
                // the pivot element and if we have found a value in the right list
                // which is smaller then the pivot element then we exchange the
                // values.
                // As we are done we can increase i and j
                comparisons++;
                if (i <= j) {
                    exchange(i, j);
                    i++;
                    j--;
                }
            }
            // Recursion
            if (low < j) {
                quicksort(low, j);
            }
            if (i < high) {
                quicksort(i, high);
            }
        }

        private static void exchange(int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }


