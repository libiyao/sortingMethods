import java.util.Arrays;

public class heapSort {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        System.out.println(Arrays.toString(test));
    }

    public static void sort(int[] a){
        for (int i = a.length/2 - 1; i >= 0; i--){
            buildHeap(a, i);
        }

        for (int i = a.length-1 ; i >= 0; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            buildHeap(a, 0);
        }
    }

    public static void buildHeap(int[] a, int i){
        int max = i;
        int leftChild = i*2 + 1;
        int rightChild = i*2 + 2;

        if (leftChild < a.length && a[leftChild] > a[max]){
            max = leftChild;
        }

        if (rightChild < a.length && a[rightChild] > a[max]){
            max = rightChild;
        }

        if (i != max){
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
        }

        buildHeap(a, max);
    }
}
