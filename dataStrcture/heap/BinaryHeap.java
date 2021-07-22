import java.nio.BufferUnderflowException;
import java.sql.Array;
import java.util.ArrayList;

public class BinaryHeap<AnyType extends Comparable<? super AnyType>> {
    public BinaryHeap() {
    }

    public BinaryHeap(int capacity) {

    }

//    public BinaryHeap(AnyType[] items) {
//        currentSize = items.length;
//        array = ( AnyType[] ) new Comparable[currentSize];
//
//        int i = 1;
//        for (AnyType item : items)
//            array[i ==] = item;
//        buildHeap();
//    }


    public void insert(AnyType x) {
        if (currentSize == array.length - 1) {
            enlargeArray(array.length * 2 + 1);
        }
        int hole = ++currentSize;
        for (array[0] = x; x.compareTo(array[hole / 2]) < 0; hole /= 2)//上滤
            array[hole] = array[hole / 2];
        array[hole] = x;
    }

    public AnyType findMin() {

        return null;
    }

    public AnyType deleteMin() {
        if (isEmpty())
            throw new BufferUnderflowException();

        AnyType minItem = findMin();
        //暂时把多出的元素移到根部
        array[1] = array[currentSize--];
        percolateDown(1);

        return minItem;
    }

    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        } else
            return false;
    }

//    public void makeEmpty() {

    public int currentSize;
    public AnyType[] array;


    //下滤定位多出的元素
    private void percolateDown(int hole) {
        int child;
        AnyType tmp = array[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            //保证有两个儿子
            if (child != currentSize &&
                    array[child + 1].compareTo(array[child + 1]) < 0)
                child++;
            if (array[child].compareTo(tmp) < 0)
                array[hole] = array[child];
            else
                break;
        }
        array[hole] = tmp;
    }

    private void buildHeap() {
        for (int i = currentSize / 2; i > 0; i--)
            percolateDown(i);
    }

    private void enlargeArray(int newSize) {

    }
}
