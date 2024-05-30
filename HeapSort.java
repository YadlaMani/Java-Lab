class Heap{
    int arr[];
    int size;
    Heap(int arr[]){
        this.arr=arr;
        this.size=arr.length;
        this.buildHeap();

    }
    void buildHeap(){
        for(int i=size/2-1;i>=0;i--){
            this.heapify(i);
        }
    }
    void heapify(int root_index){
        int max_index=root_index;
        int child=root_index*2+1;
        if(child<size){
            if(arr[child]>arr[max_index]){
                max_index=child;
            }
        }
        if(child+1<size){
            if(arr[child+1]>arr[max_index]){
                max_index=child+1;
            }
        }
        swap(arr,max_index,root_index);
        if(root_index!=max_index){
            heapify(max_index);
        }

    }
    void swap(int arr[],int max_index,int root_index){
        int temp=arr[max_index];
        arr[max_index]=arr[root_index];
        arr[root_index]=temp;
        
    }
    int exctractRoot(){
        int max=arr[0];
        arr[0]=arr[--size];
        heapify(0);
        return max;
    }
    int getSize(){
        return size;
    }

}
class HeapSort{
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,88,11,22,76};
        Heap h=new Heap(arr);
        while(h.getSize()>0){
            System.out.println(h.exctractRoot());
        }

    }
}