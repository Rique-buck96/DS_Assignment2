/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
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
       //int intArray[] = new int[]{5,90,35,45,150,3,9,11,80,50,75,12,41,100,112,95,32,64,16,8};
        
                //print unsorted array
                //System.out.println("Unsorted Array");
                //for(int i=0; i < intArray.length; i++)
                   // System.out.print(intArray[i] + " ");
                
                //sort an array using bubble sort algorithm
                //BubbleSort(intArray);
               
                randArr();
                System.out.println("");
               
//                //print array after sorting using bubble sort algorithm
//                System.out.println("Array After Bubble Sort");
//                for(int i=0; i < intArray.length; i++)
//                    System.out.print(intArray[i] + " ");
               
//                BST bst = new BST();
//                
//                for(int i=0; i < intArray.length; i++)
//                    bst.insert(intArray[i]);
//                
//                //print binary search tree in in-order traversal
//                System.out.println("Inorder Traversal");
//                bst.printInorder();          
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
         
         for(int i = 0; i < size1; i++)
             arr[i] = generator.nextInt(max);   
         for(int i = 0; i < size2; i++)
             arr2[i] = generator.nextInt(max);
        System.out.print("Unsorted array ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
         BubbleSort(arr);
        
          System.out.print("\nBubble sorted array ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
         
        System.out.print("\nComparisons: " + comparisons);
        
        comparisons = 0;
        
        
         System.out.print("\n\nUnsorted array ");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        
        BubbleSort(arr2);
        
        System.out.print("\nBubble sorted array ");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        
         System.out.print("\nComparisons: " + comparisons);
     }
     
     public static void BubbleSort( int [ ] num )
    {
    int temp;
    for(int i = 0; i < num.length; i++)
    {
        
        for(int j=1; j < num.length; j++)
        {
            comparisons++;
            if(num[j-1] > num[j]){
                temp=num[j-1];
                num[j-1]=num[j];
                num[j]=temp;
            }
        }
    }
    } 
}
    
   
