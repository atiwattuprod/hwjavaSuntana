import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 2;
        int total = 0;
        int count = 0;
        while(true){
            ++s;
            for(int i = 1;i<s-1;i++){
                //System.out.println(i);
                if(s%i == 0){
                 total+=i;
             }
            }
            if(total == s){
                //System.out.println(s);
                ++count;
                
            }
            if(count == a){
                System.out.println("perfect number = " + total);
                break;
            }
            total = 0;
        }
        sc.close();
    }
}