package StackUsingLinkedList;

import LinkedList.Node;

public class StackUsingLL {
    private Node top;
    public void push(int data){
        Node node = new Node(data);
        node.value = data;
        node.next = top;
        top = node;
    }
    public void display(){
        Node temp;
        temp = top;
        if(top==null){
            System.out.println("Stack is Empty");
        }else{
            while(temp != null){
                System.out.print(temp.value + "-> " );
                temp = temp.next;
            }
            System.out.println("Bottom");
        }
    }
    public void peek(){
        if (top == null){
            System.out.println("stack is empty");
        }else{
            System.out.println("The Top element is:" + top.value);
        }
    }

    public void pop(){
        if (top == null){
            System.out.println("stack is empty");
        }else{
            System.out.println("The popped element is: " + top.value);
            top = top.next;
        }
    }
    public void size(){
        int count=0;
        Node temp;
        temp = top;
        while(temp != null){
            temp = temp.next;
            count++;

        }
        System.out.println("stack has size: " + count);
    }

}
