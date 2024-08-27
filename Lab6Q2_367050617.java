import java.util.Scanner;
public class Lab6Q2_367050617 {
    public static void main(String[] args) {
        // kmitl 1 4
        Scanner sc = new Scanner(System.in);
        String string = "kmitl";
        int startindex = 1;
        int endindex = 4;
        String result = "";
        System.out.print("output : ");
        for(int i = startindex;i < endindex;i++){  
            result += string.charAt(i);
        }
        System.out.print(result);
        sc.close();
    }
}
