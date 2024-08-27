import java.util.Scanner;
public class Lab6Q2_467050617 {
    public static void main(String[] args) {
        // data1 = 8 1 8 9 9 
        // data2 = 5 6 4 6 7 
        // data3 = 2 3 4 5 6
        Scanner sc = new Scanner(System.in);
        int[] data = new int[5];
        int y = 0;
        for (int i = 0; i < 5; i++) {
            data[i] = sc.nextInt();
        }
        for(int j = 2;j < 10;j++){
            int x = 0;
            for(int i = 0;i < data.length;i++){
                if (data[i] == j){
                    x++;
                }
            }
            if(x >= 2){
                for(int k = 0;k < x/2;k++){
                    System.out.print(Integer.toString(j));
                    System.out.print(" ");
                }
            }
            else{
                y++;
            }
            if(y == 8){
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
