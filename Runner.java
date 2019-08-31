/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Runner {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        
        bst.insert(50);
        bst.insert(25);
        bst.insert(70);
        bst.insert( 10);
        bst.insert( 22);
        bst.insert( 90);
        bst.insert( 66);
       System.out.println(bst);
       
       
      //  System.out.println(bst.search(22));
       
       //bst.search(2);
        
    }
    
}
