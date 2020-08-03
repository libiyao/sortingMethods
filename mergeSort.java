public class Main {
    public static void main(String[]args) {
        int[] test = {3,1,2,4,5,0,-2};
        System.out.println(test[0]);
        sort(test, 0, test.length-1);
        System.out.println(test.length);
        for (int a : test){
            System.out.println(a);
        }
    }

    public static void sort(int[] a, int x, int y){
        if (x < y){
            int mid = (x+y)/2;
            sort(a, x, mid);
            sort(a, mid+1, y);

            merge(a, x, mid, y);
        }
    }

    public static void merge(int[] a, int x, int mid, int y){
        int ls = mid - x + 1;
        int rs = y - mid;

        int[] la = new int[ls];
        int[] ra = new int[rs];

        for (int i = 0; i < ls; i++){
            la[i] = a[i+x];
        }
        for (int i = 0; i < rs; i++){
            ra[i] = a[i+mid+1];
        }

        int lind = 0, rind = 0, aind = x;
        while (lind < ls && rind < rs){
            if (la[lind] <= ra[rind]){
                a[aind] = la[lind];
                lind++;
            }else{
                a[aind] = ra[rind];
                rind++;
            }
            aind++;
        }

        while (ls > lind){
            a[aind] = la[lind];
            aind++;
            lind++;
        }
        while (rs > rind){
            a[aind] = ra[rind];
            aind++;
            rind++;
        }
    }
}
