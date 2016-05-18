/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import static assignment2.Sorting.BubbleSort;
import static assignment2.Sorting.TestSortingAlgorithm;

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

        //Task 3
       TestSortingAlgorithm(2000);
       
        //Task 5
       //BuildLinkedList();
       
       //Task 6
       //populateComplicatedBST();
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

    public static void populateComplicatedBST()
    {
        int Array[] = new int[]{50, 76, 60, 30, 74, 18, 16, 98, 87, 40, 80, 46, 42, 43, 45, 41};
        BST bst = new BST();

        for(int i =0; i< Array.length; i++)
            bst.insert(Array[i]);

        //print binary search tree inorder
        System.out.println("Inorder traversal");
        bst.printInorder();

        //print preorder
        System.out.println("\nPreorder traversal");
        bst.printPreorder();

        //print postorder
        System.out.println("\nPostorder traversal");
        bst.printPostorder();

        //print leaf nodes
        System.out.println("\nLeaf nodes");
        bst.printLeafNodes();

        //print non leaf nodes
        System.out.println("\nNon leaf nodes");
        bst.printNonLeafNodes();

        //print tree depth
        System.out.println("\nTree depth");
        bst.printTreeDepth();
    }


}


