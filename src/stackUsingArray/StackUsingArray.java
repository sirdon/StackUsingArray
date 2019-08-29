/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackUsingArray;



/**
 *
 * @author AMIT
 */
public class StackUsingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5,"amit");
        stack.push(10,"naman");
        stack.push(15,"ekta");
        Node temppop = stack.pop();
        System.out.println("id = "+temppop.id +" name = "+temppop.name);
        Node temppeek = stack.peek();
        System.out.println("id = "+temppeek.id +" name = "+temppeek.name);
        stack.display();
    }
    
}
