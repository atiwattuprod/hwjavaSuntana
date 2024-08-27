import java.util.Scanner;
public class binarysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []data = {1,2,3,4,9,10,11,12,13,18,19,55,56,88,99,110,111,115,121,123,125,159};
        int number = sc.nextInt();
        int i;
        int x = 0;
        if(data.length % 2 == 0){
            i = data.length/2;
        }
        else{
            i = data.length/2 + 1;
        }
        int y = 0;
        // System.out.println(i);
        while(data[i] != number){
            if(data[i] > number){
                x++;
                y = i;
                i /= 2;
                // System.out.println(i);                
            }
            else if(data[i] < number && x > 0){
                i += (y-i)/2;
                // System.out.println(i);
            }    
            else if(data[i] < number){
                i += (data.length-i)/2;
                // System.out.println(i);
            }
        }
        System.out.println("Position : "+ (i+1));
        sc.close();
    }
}
