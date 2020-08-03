public class quickSort {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        quickSort(test, 0, test.length-1);
        for(int a : test){
            System.out.println(a);
        }
    }

    public static void quickSort(int[] a, int l, int r){
        if (r <= l){
            return;
        }
        int left = l;
        int right = r;
        int temp = a[left];
        while (right > left){
            while(right > left && a[right] >= temp){
                right--;
            }
            a[left] = a[right];
            while(right > left && a[left] <= temp){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        quickSort(a, l, left-1);
        quickSort(a, left+1, r);
    }
}
