import java.util.*;
public class MaxHeapPriorityQueu<T>{
    PriorityQueue<T>pq;
    MaxHeapPriorityQueu(){
        pq=new PriorityQueue<>(Collections.reverseOrder());

    }
    public void add(T ele){
        pq.add(ele);
    }
    public T peek(){
        return pq.peek();
    }
    public T poll(){
        return pq.poll();
    }
    public int size(){
        return pq.size();
    }
    public boolean isEmpty(){
        return pq.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MaxHeapPriorityQueu<Integer>maxHeap=new MaxHeapPriorityQueu<>();
        System.out.println("1.insert 2.Peek 3.Poll 4.Size");
        while(true){
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                        maxHeap.add(sc.nextInt());break;
                case 2:if(maxHeap.isEmpty()){
                    System.out.println("Heap is empty");
                }
                else{
                    System.out.println("The element at the top is:"+maxHeap.peek());
                }break;
                case 3:if(maxHeap.isEmpty()){
                    System.out.println("Heap is empty");
                }
                else{
                    System.out.println("The element removed is:"+maxHeap.poll());
                }break;
                case 4:System.out.println("The size of the heap is:"+maxHeap.size());break;
                default:System.exit(0);
            }
        }

    }


}
