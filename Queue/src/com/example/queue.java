package com.example;

public class queue {
    private int items[];
    private int capacity;
    private int front,rear;

    queue(int size){
        int items[] = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    boolean isfull(){
        if(front == 0 && rear == capacity - 1) return true;
        return false;
    }

    boolean isempty(){
        if(front == -1) return true;
        return false;
    }

    void enQueue(int element){
        if(isfull()){
            System.out.println("Queue is Full");
        } else{
            if(front == -1) front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Insert :" + element);
        }
    }
    int deQueue(){
        int element;
        if(isempty()){
            System.out.println("Queue is empty");
            return (-1);
        } else{
            element = items[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            } else{
                front++;
            }
        }
        System.out.println(element + " Deleted");
        return element;
    }

    void display(){
        if(isempty()){
            System.out.println("Queue is Empty");
        } else{
            System.out.println("\nFront index: " + front);
            System.out.println("items: ");
            for(int i = front; i <= rear; i++){
                System.out.println(items[i] + " ");
            }
            System.out.println("\nRear index: "+ rear);
        }
    }
}

class main{
    public static void main(String[] args){
        queue q = new queue(5);
        q.deQueue();
        for(int i = 1; i < 6; i++){
            q.enQueue(i);
        }
        q.display();
        q.deQueue();
        q.display();
    }
}
