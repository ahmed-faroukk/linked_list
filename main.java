/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linked_list;

/**
 *
 * @author farouk
 */
public class main {
    public static void main (String [] args)
    {
        // make nodes or list
    node head= new node(1);
    node nodeB = new node(2);
    node nodeC = new node(3);
    node nodeD = new node(4);
    node nodeE = new node(5);
    
    // linked every node with other
    head.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    nodeD.next = nodeE;
    
    // if i wanna difine double linked list
    nodeB.prev=head;
    nodeC.prev=nodeB;
    nodeD.prev=nodeC;
    nodeE.prev= nodeD;
    
    
    // node counter
    
        System.out.println( head.countnode(head));
    
    

    
    }   
}
