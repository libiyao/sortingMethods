import java.util.Arrays;

public class insertionSort {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        for (int i = 1; i < test.length; i++){
            int temp = test[i];
            for (int j = i; j >= 0; j++){
                if (j > 0 && test[j-1] >= temp){
                    test[j] = test[j-1];
                }else{
                    test[j] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(test));
    }
}
