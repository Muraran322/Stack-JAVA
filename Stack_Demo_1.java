
package stack_demo_1;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Stack_Demo_1 {

    public static void main(String[] args) {
       //Creating an empty stack
        Stack<String> stack = new Stack<String>();
        
        //Use the push() to add elements into the stack
        stack.push("Welcome ");
        stack.push("To ");
        stack.push("Muraran's ");
        stack.push("GitHub "); 
        stack.push("Account ");
        
        //Displaying the Stack
        //System.out.println("Initial Stack: "+ stack);
        JOptionPane.showMessageDialog(null,stack,"Initial Stacck: ",JOptionPane.INFORMATION_MESSAGE);
        
        //Fetching the element at the head of the Stack
        //System.out.println("Teh element at the top of the " +"stack is: "+ stack.peek());
        JOptionPane.showMessageDialog(null,stack.peek(),"The element at the Top of the stack is: ",JOptionPane.INFORMATION_MESSAGE);
        
        //Displaying the Stack after the Operation
        //System.out.println("Final Stack: "+stack);
        JOptionPane.showMessageDialog(null,stack,"Final Stack: ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
