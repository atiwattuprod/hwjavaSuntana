import java.util.Scanner;

/**
 * Lab5Q5_16750617
 */
public class Lab5Q5_16750617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(j == i || j == n-1-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
            System.out.println();
        }
        sc.close();
    
    }
    
}