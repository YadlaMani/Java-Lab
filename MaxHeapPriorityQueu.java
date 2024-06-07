import java.util.*;
class HeapC{
    int arr[];
    int size;
    HeapC(int n){
        this.arr=new int[n];
        this.size=0;
    }
    void buildHeap(){
        for(int i=size/2-1;i>=0;i--){
            this.heapify(i);
        }
    }
    void heapify(int rootIndex){
        int maxIndex=rootIndex;
        int child=rootIndex*2+1;
        if(child<size){
            if(arr[child]>arr[maxIndex]){
                maxIndex=child;
            }
        }
        if(child+1<size){
            if(arr[child+1]>arr[maxIndex]){
                maxIndex=child+1;
            }
        }
        if(maxIndex!=rootIndex){
            swap(arr,maxIndex,rootIndex);
            heapify(maxIndex);
        }
    }
    void swap(int arr[],int maxIndex,int rootIndex){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[rootIndex];
        arr[rootIndex]=temp;
    }
    void push(int value){
        if(size>=arr.length){
            System.out.println("Heap is full");
            return;
        }
        arr[size++]=value;
        int i=size-1;
        while(i!=0&&arr[(i-1)/2]<arr[i]){
            swap(arr,i,(i-1)/2);
            i=(i-1)/2;
        }
    }
    int exctractRoot(){
        if(size<=0){
            System.out.println("Heap is empty");
        }
        int max=arr[0];
        arr[0]=arr[--size];
        heapify(0);
        return max;
    }
    void peek(){
        if(size<=0){
            System.out.println("Heap is empty");
            return;
        }
        System.out.println("The element at the front:"+arr[0]);
    }
    int getSize(){
        return size;
    }
    void pop(){
        if(size<=0){
            System.out.println("Heap is empty");
            return ;
        }
        System.out.println("The element popped from the queue is:"+exctractRoot());
        
    }
}
public class MaxHeapPriorityQueu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HeapC hq=new HeapC(10);
        System.out.println(" 1.Push 2.pop 3.peek 4.size\n");
        while(true){
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            int x;
            switch(ch){
                case 1:System.out.println("Enter element to push:");
                hq.push(sc.nextInt());
                break;
                case 2:hq.pop();
                break;
                case 3: hq.peek();break;
                case 4:System.out.println("The size of heap is:"+hq.getSize());break;
                default:System.exit(0);


            }
        }
    }
    

}
