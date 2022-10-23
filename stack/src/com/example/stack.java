package com.example;

public class stack {
    private int arr[];
    private int top ;
    private int capacity;

    // creating a stack
    stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public int getsize(){
        return top+1;
    }
    public boolean isfull(){
        return top == capacity - 1;
    }

    public boolean isempty(){
        return top == -1;
    }

    public void push(int x){
        if(isfull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting "+ x);
        arr[++top] = x;
    }

    public int pop(){
        if(isempty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public void printstack(){
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i] + ", ");
        }
    }

    public static void main(String[] args){
        stack s = new stack(5);
        s.push(2);
        s.push(4);
        s.push(6);
        System.out.println("Stack: ");
        s.printstack();
        s.pop();
        System.out.println("\nAfter popping out: ");
        s.printstack();
    }
}


