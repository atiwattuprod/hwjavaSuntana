import java.util.Scanner;

/**
 * fdsfosifodisfhsiofoihgs;ioglke8
 */
public class hggg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//กรอกจำนวนชั้น
        for(int x=0; x < row; x++){
            for(int i=0; i < 4; i++){
                for(int j=0; j < (row*2)+5; j++){//(row*2)+5 ใช้หาจำนวนตัว
                    if(j < (row+2-x)-i ||j >(row+2+x)+i){//หากเข้าเงื่อนไขจะเป็นช่องว่าง
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");//ถ้าไม่เข้าเงื่อนไขจะเป็น*
                }
                System.out.println();
            }
        }
        for(int y = 0; y<3; y++){
            for(int j=0; j < (row*2)+5; j++){
                if(j < (row+2)-1 ||j >(row+2)+1){////หากเข้าเงื่อนไขจะเป็นช่องว่าง
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");//ถ้าไม่เข้าเงื่อนไขจะเป็น*
            }
            System.out.println();
        }
        sc.close();
    }
}
