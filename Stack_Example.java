
package stack_example;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Stack_Example {

    public static void main(String[] args) {
        //Create a new Stack
        Stack<Integer>stack = new Stack<>();
        
        //Push elements onto the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        //Pop elements from the stack
        while (!stack.isEmpty()){
        //System.out.println(stack.pop());
        JOptionPane.showMessageDialog(null,stack.pop(),"  ",JOptionPane.INFORMATION_MESSAGE);
    }
        
    }
    
}
