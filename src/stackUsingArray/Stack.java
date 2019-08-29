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
class Node{
    int id;
    String name;
}
class Stack {
    int size=10;
    int top=-1;
    Node n[] = new Node[size];
    void push(int i,String name) {
        if(top<size-1){
            n[++top] = new Node();
            n[top].id=i;
            n[top].name=name;
        }
        else System.out.println("Stack overflow");
    }

    Node pop() {
        if(top>-1){
        Node temp=n[top];
        top--;
        return temp;}
        else { System.out.println("stack underflow");
        return null; 
        }
    }

    Node peek(){
        return n[top];
    }

    void display() {
        for(int i=top;i>-1;i--)
            System.out.println("id = "+n[i].id +" name = "+n[i].name);
    }
    
}
