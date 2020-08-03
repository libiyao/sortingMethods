import java.util.Arrays;

public class bubbleSort {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        for (int i = 0; i < test.length; i++){
            for (int j = 0; j < test.length-i-1; j++){
                if (test[j] > test[j+1]){
                    int temp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(test));
    }
}
