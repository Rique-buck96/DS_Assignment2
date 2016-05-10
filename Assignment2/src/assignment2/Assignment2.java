/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import static assignment2.Sorting.BubbleSort;
import static assignment2.Sorting.SelectionSort;
import static assignment2.Sorting.InsertionSort;
import static assignment2.Sorting.MergeSort;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Assignment2 {

    static int comparisons;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        //Task 3
        randArr();
              
    }
    
    public static void populateBSort()
    {
         int intArray[] = new int[]{5,90,35,45,150,3,9,11,80,50,75,12,41,100,112,95,32,64,16,8};
        
                //print unsorted array
                System.out.println("Unsorted Array");
                for(int i=0; i < intArray.length; i++)
                    System.out.print(intArray[i] + " ");
                
                //sort an array using bubble sort algorithm
                BubbleSort(intArray);
              
                System.out.println("");
               
                //print array after sorting using bubble sort algorithm
                System.out.println("Array After Bubble Sort");
                for(int i=0; i < intArray.length; i++)
                    System.out.print(intArray[i] + " ");
    }
    
    public static void populateBTree()
    {
       int intArray[] = new int[]{5,90,35,45,150,3,9,11,80,50,75,12,41,100,112,95,32,64,16,8};
       BST bst = new BST();
               
        for(int i=0; i < intArray.length; i++)
            bst.insert(intArray[i]);
                
        //print binary search tree in in-order traversal
        System.out.println("Inorder Traversal");
        bst.printInorder();         
    }
    
     public static void randArr()
     {
         int size1 = 200;
         int size2 = 400;
         int size3 = 800;
         int size4 = 1000;
         int size5 = 2000;
         int max = 2000;
         int[] arr = new int[size1];
         int[] arr2 = new int[size2];
         int[] arr3 = new int[size3];
         int[] arr4 = new int [size4];
         int[] arr5 = new int [size5];
         
         Random generator = new Random();
         
         generator.nextInt(max);
         
         //populate each array
         for(int i = 0; i < size1; i++)
             arr[i] = generator.nextInt(max);   
         for(int i = 0; i < size2; i++)
             arr2[i] = generator.nextInt(max);
         for(int i = 0; i < size3; i++)
             arr3[i] = generator.nextInt(max);
         for(int i = 0; i < size4; i++)
             arr4[i] = generator.nextInt(max);
         for(int i = 0; i < size5; i++)
             arr5[i] = generator.nextInt(max);
         
         //Array 1
        System.out.print("Unsorted array ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        long startTime2 = System.currentTimeMillis();
         MergeSort(arr);
          long endTime2 = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime2 - startTime2) + " milliseconds");
        
         System.out.print("\nSorted array ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
         
        System.out.print("\nComparisons: " + comparisons);
        comparisons = 0;
        
        
        //Array 2
         System.out.print("\n\nUnsorted array ");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        
         long startTime3 = System.currentTimeMillis();
       MergeSort(arr2);
         long endTime3 = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime3 - startTime3) + " milliseconds");
        
        System.out.print("\nSorted array ");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        
         System.out.print("\nComparisons: " + comparisons);
         comparisons = 0;
         
         //Array 3
         System.out.print("\n\nUnsorted array ");
         for(int i = 0; i < arr3.length; i++)
             System.out.print(arr3[i] + " ");
         
         
         MergeSort(arr3);
         
        
         System.out.print("\nSorted array ");
         for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
        
         System.out.print("\nComparisons: " + comparisons);
         comparisons = 0;
         
         //Array 4
          System.out.print("\n\nUnsorted array ");
         for(int i = 0; i < arr4.length; i++)
             System.out.print(arr4[i] + " ");
         
         
         MergeSort(arr4);

         System.out.print("\nSorted array ");
         for(int i = 0; i < arr4.length; i++)
            System.out.print(arr4[i] + " ");
        
         System.out.print("\nComparisons: " + comparisons);
         comparisons = 0;
         
         //Array 5
          System.out.print("\n\nUnsorted array ");
         for(int i = 0; i < arr5.length; i++)
             System.out.print(arr5[i] + " ");
         
         MergeSort(arr5);
         
         System.out.print("\nSorted array ");
         for(int i = 0; i < arr5.length; i++)
            System.out.print(arr5[i] + " ");
        
         System.out.print("\nComparisons: " + comparisons + "\n");
         comparisons = 0;
         
     }
     
   
}
    
   
