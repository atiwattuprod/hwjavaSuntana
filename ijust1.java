import java.util.Scanner;

public class ijust1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        for(int i = 0;i < l;i++){
            System.out.print("|");
        }
        for(int j = 0;j < 2*(l + r);j++){
            System.out.print("*");
        }
        for(int k = 0;k < r;k++){
            System.out.print("|");
        }
        sc.close();
    }
}
