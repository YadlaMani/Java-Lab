import java.util.*;

class Heap {
    List<Integer> arr;
    int size;

    Heap(List<Integer> arr) {
        this.arr = arr;
        this.size = arr.size();
        this.buildHeap();
    }

    void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            this.heapify(i);
        }
    }

    void heapify(int rootIndex) {
        int maxIndex = rootIndex;
        int leftChild = rootIndex * 2 + 1;
        int rightChild = rootIndex * 2 + 2;

        if (leftChild < size && arr.get(leftChild) > arr.get(maxIndex)) {
            maxIndex = leftChild;
        }
        if (rightChild < size && arr.get(rightChild) > arr.get(maxIndex)) {
            maxIndex = rightChild;
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

    int extractRoot() {
        if (size <= 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        int max = arr.get(0);
        arr.set(0, arr.get(--size));
        arr.remove(size);
        heapify(0);
        return max;
    }

    int getSize() {
        return size;
    }
}

class HeapSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 88, 11, 22, 76));
        Heap h = new Heap(arr);
        while (h.getSize() > 0) {
            System.out.println(h.extractRoot());
        }
    }
}
