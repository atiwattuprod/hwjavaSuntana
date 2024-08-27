import java.util.Scanner;

public class Lab5Q5_267050617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i+1;j++){
                System.out.print(n-j);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}
