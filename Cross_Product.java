import java.util.Scanner;

public class Cross_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long startTime = System.nanoTime(); // Start time
        for(int i : CrossProduct(arr))
            System.out.print(i + " ");
        sc.close();
        long endTime = System.nanoTime(); // End time
        long duration = endTime - startTime; // Calculate duration
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

    static int[] CrossProduct(int[][]arr){
        int[] ans = new int[3];
        ans[0] = (arr[0][1] * arr[1][2]) - (arr[0][2] * arr[1][1]);
        ans[1] = (arr[0][2] * arr[1][0]) - (arr[0][0] * arr[1][2]);
        ans[2] = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        return ans;
    }
}