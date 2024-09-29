
package stack_posh;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Stack_posh {
    //Pushing element on the top of the stack
    static void stack_push (Stack<Integer>stack){
        for (int i =0; i <5; i++){
            stack.push(i);
        }
    }
    
    //Popping element from the top of the stack
    static void stack_pop(Stack<Integer>stack){
        //System.out.println("Pop Operation: ");
        JOptionPane.showMessageDialog(null,stack,"Pop Operation: ",JOptionPane.INFORMATION_MESSAGE);
        for (int i =0; i<5; i++){
            Integer y = (Integer) stack.pop ();
            //System.out.println(y);
            JOptionPane.showMessageDialog(null,y,"  ",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Displaying elements on top of the stack
    static void stack_peek (Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        //System.out.println("Element on stack top: "+element);
        JOptionPane.showMessageDialog(null,element,"Element on stack top: ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Searching element in the stack
    static void stack_search (Stack<Integer> stack, int element) {
        Integer pos =(Integer) stack.search(element);
        
        if (pos == -1)
            //System.out.println("Element not Found");
            JOptionPane.showMessageDialog(null,stack,"Element not Found ",JOptionPane.INFORMATION_MESSAGE);
        else
            //System.out.println("Element is found at position: "+pos);
            JOptionPane.showMessageDialog(null,pos,"Element is found at Position: ",JOptionPane.INFORMATION_MESSAGE);
    }
     public static void main(String[] args) {
         
         Stack<Integer> stack =new Stack<Integer>();
         
         stack_push(stack);
         stack_pop(stack);
         stack_push(stack);
         stack_peek(stack);
         stack_search(stack,2);
         stack_search(stack,6);
         
         
       
    }
    
}   



    
   

