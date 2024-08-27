import java.util.Scanner;

public class ijust2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i<(n + 1)/2 ;i++){
            for(int j = 0; j< k + (n -1)/2; j++){
                if(j < ((n -1)/2) - i || j > (((n -1)/2) - i) + k - 1){
                    System.out.print(" ");
                    continue;
                }
                
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m = 0; m<(n - 1)/2 ; m++){
            for(int l = 0; l< k + (n -1)/2; l++){
                if(l < ((n -1)/2) - (((n -1)/2)-1-m) || l > ((n -1)/2) - (((n -1)/2)-1- m) + k -1){
                    System.out.print(" ");
                    continue;
                }
                
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

