import java.util.Scanner;

public class testex {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        int x = sc.nextInt();
        int ans = 0;
        for(int i=1; x > 0; i *= 10){
            int a = x%10;
            int b = 0;
            if(a%2==0){
                b = a +5 ;
                ans *= 10;
                ans += a;
            }
            else if(a % 2 != 0){
                b = a/2;
                ans += a*i;
            }
            System.out.println(ans + " " + b);
            x /= 10;
        }
        sc.close();
    }
}
