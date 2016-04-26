/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Enrique
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int intArray[] = new int[]{5,90,35,45,150,3,9,11,80,50,75,12,41,100,112,95,32,64,16,8};
               
                //print unsorted array
                System.out.println("Unsorted Array");
                for(int i=0; i < intArray.length; i++)
                    System.out.print(intArray[i] + " ");
                
               
                //sort an array using bubble sort algorithm
                //BubbleSort(intArray);
               
                System.out.println("");
               
//                //print array after sorting using bubble sort algorithm
//                System.out.println("Array After Bubble Sort");
//                for(int i=0; i < intArray.length; i++)
//                    System.out.print(intArray[i] + " ");
               
                BST bst = new BST();
                
                for(int i=0; i < intArray.length; i++)
                    bst.insert(intArray[i]);
                
                //print binary search tree in in-order traversal
                System.out.println("Inorder Traversal");
                bst.printInorder();
                
                
    }
    
     public static void BubbleSort( int [ ] num )
    {
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] > num[j+1] )   // sort in ascending order
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
    } 
     
     
}
    
   
