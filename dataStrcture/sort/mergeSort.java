public class mergeSort {
    private static <AnyType extends Comparable<? super AnyType>> void mergesort(AnyType [] a , AnyType[]tempArray,int left, int right){
        if (left<right){
            int center = (left+right)/2;
            mergesort(a,tempArray,left,center);
// 
        }
    }
}
