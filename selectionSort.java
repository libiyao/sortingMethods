public class selectionSort {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        for (int i = 0; i < test.length; i++){
            int min = i;
            for (int j = i+1; i < test.length; i++){
                if (test[j] < test[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = test[i];
                test[i] = test[min];
                test[min] = temp;
            }
        }
        System.out.println(Arrays.toString(test)); // -2, 0, 1, 2, 3, 4, 5
    }
}
