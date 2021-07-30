package heap;

public class HeapSort {
    public void heapsort(int[] previousArray) {
        int size = previousArray.length;
        currentSize=size;
        array=new int[size];

        int i = 1;
        for (int item : previousArray)
            array[i++] = item;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = currentSize / 2; i > 0; i--)
            percolateDown(i);
    }

    private void percolateDown(int hole) {
        int child;
        int tmp = array[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize &&
                    array[child + 1] < ( array[child + 1] ))
                child++;
            if (array[child] < ( tmp ))
                array[hole] = array[child];
            else
                break;
        }
        array[hole] = tmp;
    }

    private int currentSize;
    private int[] array;

}
