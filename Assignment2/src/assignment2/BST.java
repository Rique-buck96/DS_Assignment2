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


public class BST {
    
  public class Node<T> {
  public int value;
  public Node left;
  public Node right;

  public Node(int value) { this.value = value;}
}
    
   public Node root;

  public void insert(int value){
    Node node = new Node<>(value);

    if ( root == null ) {
      root = node;
      return;
    }

    insertRec(root, node);

  }

  private void insertRec(Node latestRoot, Node node)
  {
    if ( latestRoot.value > node.value)
    {
      if ( latestRoot.left == null )
      {
        latestRoot.left = node;
        return;
      }
      else
        insertRec(latestRoot.left, node);
    }
    else
    {
      if (latestRoot.right == null)
      {
        latestRoot.right = node;
        return;
      }
      else
        insertRec(latestRoot.right, node);
    }
  }
  
  /**
    * Printing the contents of the tree in an inorder way.
    */
   public void printInorder()
   {
     printInOrderRec(root);
     System.out.println("");
   }

   public void printPreorder()
   {
       printPreorderRec(root);
       System.out.println("");
   }
   
   public void printPostorder()
   {
       printPostorderRec(root);
       System.out.println("");
   }
   
  public void printLeafNodes()
  {
      printLeafNodesRec(root);
      System.out.println("");
  }
   
  public void printNonLeafNodes(){
      printNonLeafNodesRec(root);
      System.out.println("");
  }
  
  public void printTreeDepth(){
      
      System.out.println("Max depth is " + maxDepthRec(root));
  }
  
/**
 * Helper method to recursively print the contents in an inorder way
    */
   private void printInOrderRec(Node currRoot)
   {
       comparisons++;
     if ( currRoot == null ) return;
     
     printInOrderRec(currRoot.left);
     System.out.print(currRoot.value+" ");
     printInOrderRec(currRoot.right);
   }
   
   private void printPreorderRec(Node currRoot)
   {
       if(currRoot == null) return;
       
       System.out.print(currRoot.value + " ");
       printPreorderRec(currRoot.left);
       printPreorderRec(currRoot.right);
   }
   
   private void printPostorderRec(Node currRoot)
   {
       if (currRoot == null) return;
       
       printPostorderRec(currRoot.left);
       printPostorderRec(currRoot.right);
       System.out.print(currRoot.value + " ");
   }
   
    private void printLeafNodesRec(Node node){
       if(node == null) return;
       
       if(node.left == null && node.right == null)
           System.out.print(node.value + " ");
       
       printLeafNodesRec(node.left);
       printLeafNodesRec(node.right);
   }
    
    private void printNonLeafNodesRec(Node node){
        if(node == null) return;
        
        if(node.left != null || node.right != null)
            System.out.print(node.value + " ");
        
        printNonLeafNodesRec(node.left);
        printNonLeafNodesRec(node.right);
    }
    
    public int maxDepthRec(Node node){
      if(node == null) return 0;
      else{
        int lDepth = maxDepthRec(node.left);
        int rDepth = maxDepthRec(node.right);
          
          if(lDepth > rDepth)
            return lDepth + 1;
          
          else
            return rDepth + 1;   
          
          }
    }
}
