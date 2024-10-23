import java.util.Scanner;
/**
 * Fibonacci_word
 */
public class Fibonacci_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0;i < n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
            System.out.println(FibonacciWord(arr[i][0],arr[i][1]));
        sc.close();
    }
    static Character FibonacciWord(int A,int B){
        String result = Fibonacciword(A-1);
        return result.charAt(B-1);
    }
    static String Fibonacciword(int A1){
        if (A1 == 0)
            return "A";
        else if(A1 == 1)
            return "B";
        return Fibonacciword(A1 - 2) + Fibonacciword(A1 - 1);
    }
}