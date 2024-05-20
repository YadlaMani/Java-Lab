import java.util.*;
interface Q<T>{
    void enqueue(T ele);
    void dequeue();
    void display();
    void front();
    void rear();
    boolean isFull();
    boolean isEmpty();
}
class GenLLQ<T> implements Q<T>{
    class Node{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    Node front,rear;
    GenLLQ(){
        front=null;
        rear=null;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public boolean isFull(){
        return false;
    }
    public void enqueue(T ele){
        Node temp=new Node(ele);
        if(front==null){
            front=temp;
            rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        if(front==rear){
            front=null;
            rear=null;
        }
        else{
            front=front.next;
        }

    }
    public void front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("The element at the front is:"+front.data);
        }
    }
    public void rear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("The element at the rear is:"+rear.data);
        }
    }
    public void display(){
        System.out.println("The elemets of the queue are:");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    



}
public class GenQLLDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenLLQ<Integer>q=new GenLLQ<>();
        System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Front 5.Rear 6.Exit");
        while (true) { 
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                int ele=sc.nextInt();
                q.enqueue(ele);break;
                case 2:q.dequeue();break;
                case 3:q.display();break;
                case 4:q.front();break;
                case 5:q.rear();break;
                case 6:System.exit(0);break;
                default:System.exit(0);
            }
        }
    }
}
