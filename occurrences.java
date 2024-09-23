public class occurrences {
    public static void main(String[] args) {
        int[] y = {1,2,3,2,4,2};
        System.out.println(Occurrences(y, 2));
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
