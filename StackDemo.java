
package stackdemo;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class StackDemo {

    public static void main(String[] args) {
        //Default initialization of Stack
        Stack stack1 = new Stack();
        
        //Intialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();
        
        //Pushing the elements
        stack1.push("Hey");
        stack1.push("you Look");
        stack1.push("Beautiful");
        
        stack2.push("Dress");
        stack2.push("well");
        stack2.push("Tonight");
        
        //Printing the Stack Elements
        //System.out.println(stack1);
        JOptionPane.showMessageDialog(null,stack1,"  ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(stack2);
        JOptionPane.showMessageDialog(null,stack2,"  ",JOptionPane.INFORMATION_MESSAGE);
        
       
    }
    
}
