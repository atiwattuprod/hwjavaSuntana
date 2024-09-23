import java.util.Arrays;

public class ProFun09_67050617 {
    public static void main(String[] args) {
        int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(right_diag_sum(arr));
        System.out.println(Arrays.toString(max_sum_row(arr)));
        System.out.println(Arrays.toString(retrieve_main_diagonal(arr)));
    }

    static int right_diag_sum(int [][] input){
        int ans = 0;
        for (int i = 0; i < input.length; i++)
            ans += input[i][i];
        return ans;
    }

    static int [] max_sum_row(int [][] input){
        int[] ans = new int[input[0].length];
        int maxrow = 0; 
        for(int i = 0;i < input.length;i++){
            int sum = 0;
            for(int num :input[i]){
                sum += num;
            }
            if(sum > maxrow){
                ans = input[i];
                maxrow = sum;
            }
        }
        return ans;
    }

    static int [] retrieve_main_diagonal(int [][] input){
        int[] ans = new int[input.length];
        for(int i = 0;i < input.length;i++)
            ans[i] = input[i][i];
        return ans;
    }
}
