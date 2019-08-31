/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class BinarySearchTree {
    Node root;
   

    BinarySearchTree() {
        root = null;
    }
    void insert( int key) { 
       root= insertRec(root, key); 
    } 

    Node insertRec(Node root,int insValue) {
       if(root==null)
       { 
           return new Node(insValue);
       }
      if(insValue<root.data)
       {
           root.left=insertRec(root.left,insValue);
       }
       else if(insValue>root.data)
       {
           root.right=insertRec(root.right,insValue);
       }
      else
       {
           System.out.println("Value already exists");
           return root;
       }
        return root;
    }
    
    
/*    Node search(int key)
    {
        return searchRec(root,key);
    }
    Node searchRec(Node value, int key)
    {
        Node curNode=root;
       
        
        if(key==curNode.data)
        {
           return curNode; 
        }
        if(key<curNode.data)
        {
            curNode=search(key);
        }
        else if(key>curNode.data)
        {
            curNode=search(key);
        }
             return curNode;
    }*/
    
}
