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

class GenArrayListQ<T> implements Q<T>{
    private ArrayList<T> queue;

    GenArrayListQ(){
        queue = new ArrayList<>();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean isFull(){
        return false;
    }

    public void enqueue(T ele){
        queue.add(ele);
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        queue.remove(0);
    }

    public void front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("The element at the front is: " + queue.get(0));
        }
    }

    public void rear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("The element at the rear is: " + queue.get(queue.size() - 1));
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("The elements of the queue are: " + queue);
        }
    }
}

public class GenArrayListQLLDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenArrayListQ<Integer> q = new GenArrayListQ<>();
        System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Front 5.Rear 6.Exit");
        while (true) {
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to insert:");
                    int ele = sc.nextInt();
                    q.enqueue(ele);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.front();
                    break;
                case 5:
                    q.rear();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
