import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int result = 0;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                result = FindGCD(arr[i],arr[j]) > result ? FindGCD(arr[i],arr[j]):result;
            }
        }
        System.out.println(result);
        sc.close();
    }
    static int FindGCD(int A,int B){
        if (B == 0)
            return A;
        return FindGCD(B, A%B);
    }
}
