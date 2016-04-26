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

/**
 * Helper method to recursively print the contents in an inorder way
    */
   private void printInOrderRec(Node currRoot)
   {
     if ( currRoot == null ) return;
     
     printInOrderRec(currRoot.left);
     System.out.print(currRoot.value+" ");
     printInOrderRec(currRoot.right);
   }
}
