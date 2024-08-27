import java.util.Scanner;

public class Lab5Q5_467050617 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int x=0; x < row; x++){
            for(int i=0; i < 4; i++){
                for(int j=0; j < (row*2)+5; j++){
                    if(j < (row+2-x)-i ||j >(row+2+x)+i){
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int y = 0; y<3; y++){
            for(int j=0; j < (row*2)+5; j++){
                if(j < (row+2)-1 ||j >(row+2)+1){
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