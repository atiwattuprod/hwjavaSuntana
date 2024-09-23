import java.util.Arrays;

public class ProFun10_67050617 {
    public static void main(String[] args) {
        // negativesToZero
        System.out.println("negativesToZero");
        int[] x = {1, -2, 3, 4, -5};
        System.out.println(Arrays.toString(negativesToZero(x)));
        System.out.println("");

        //Occurrences
        System.out.println("Occurrences");
        int[] y = {1,2,3,2,4,2};
        System.out.println(Occurrences(y, 2));
    }

    public static int[] negativesToZero(int[] a) {
        return change(a, 0,new int[a.length]);
    }

    public static int[] change(int[] a, int idx, int[]ans) {
        if (idx == a.length) {
            return ans;
        }
        ans[idx] = (a[idx] < 0) ? 0:a[idx];
        return change(a, idx + 1,ans);
    }

    public static int Occurrences(int[] a, int n){
        return count(a,n,0);
    }
    public static int count(int[] a, int n,int idx){
        if (idx == a.length) {
            return 0;
        }
        return (a[idx] == n ? 1 : 0) + count(a, n, idx + 1);
    }
}

