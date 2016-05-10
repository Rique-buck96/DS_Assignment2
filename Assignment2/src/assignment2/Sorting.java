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

     public static void BubbleSort( int [ ] num ){
        int temp;
        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < num.length; i++)
        {

            for(int j=1; j < num.length; j++)
            {
                
                if(num[j-1] > num[j]){
                    temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                    comparisons++;
                }
            }
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime2 - startTime2) + " milliseconds");
    } 
     
     public static void SelectionSort(int[] arr){
        long startTime2 = System.currentTimeMillis(); 
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]){
                     index = j;
                     comparisons++;
                }

            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime2 - startTime2) + " milliseconds");
    }
      
  public static void InsertionSort(int[] input){
         long startTime2 = System.currentTimeMillis();
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                    comparisons++;
                }
            }
        }
         long endTime2 = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime2 - startTime2) + " milliseconds");
    }

  public static void MergeSort(int [] list) {
      
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
    
    private static void merge(int[] first, int[] second, int [] result) {
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
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
                comparisons++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
 
}
