import java.util.*;

class HeapC {
    List<Integer> arr;
    int size;

    HeapC() {
        this.arr = new ArrayList<>();
        this.size = 0;
    }

    void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            this.heapify(i);
        }
    }

    void heapify(int rootIndex) {
        int maxIndex = rootIndex;
        int child = rootIndex * 2 + 1;
        if (child < size) {
            if (arr.get(child) > arr.get(maxIndex)) {
                maxIndex = child;
            }
        }
        if (child + 1 < size) {
            if (arr.get(child + 1) > arr.get(maxIndex)) {
                maxIndex = child + 1;
            }
        }
        if (maxIndex != rootIndex) {
            swap(maxIndex, rootIndex);
            heapify(maxIndex);
        }
    }

    void swap(int maxIndex, int rootIndex) {
        int temp = arr.get(maxIndex);
        arr.set(maxIndex, arr.get(rootIndex));
        arr.set(rootIndex, temp);
    }

    void push(int value) {
        arr.add(value);
        size++;
        int i = size - 1;
        while (i != 0 && arr.get((i - 1) / 2) < arr.get(i)) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    int extractRoot() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int max = arr.get(0);
        arr.set(0, arr.get(--size));
        arr.remove(size);
        heapify(0);
        return max;
    }

    void peek() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        System.out.println("The element at the front: " + arr.get(0));
    }

    int getSize() {
        return size;
    }

    void pop() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        System.out.println("The element popped from the queue is: " + extractRoot());
    }
}

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeapC hq = new HeapC();
        System.out.println(" 1.Push 2.pop 3.peek 4.size\n");
        while (true) {
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element to push:");
                    hq.push(sc.nextInt());
                    break;
                case 2:
                    hq.pop();
                    break;
                case 3:
                    hq.peek();
                    break;
                case 4:
                    System.out.println("The size of heap is: " + hq.getSize());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
