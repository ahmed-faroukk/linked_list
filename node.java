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
public class node {
    
    int data ;
    node next ;

    public node( int data) {
        this.data = data ;
    }
    
    static int countnode (node head)  
    
    {
        int nodes = 1;
        node current = head;
     for( int i=1 ; i<=10 ; i++)
     {
         
     if(current.next!=null)
     { current = current.next ; 
       nodes++; 
     }
     
     else  break;
     
     }
     
     return nodes;
        
    }
    
}
