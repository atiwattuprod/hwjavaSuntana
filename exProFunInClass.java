import java.util.Arrays;

public class exProFunInClass {
    public static void main(String[] args) {
        adapted_runestone_1();
        adapted_runestone_2();
        adapted_runestone_3();
        adapted_runestone_4();
        adapted_runestone_5();
        zero_to_lower_triangular();
        scenario_1();
        int [][] data = {{11,12,13,14},{15,16,17,18},{19,20,21,22}};
        for(int []row : flip_horizontal1_cell_by_cell(data))
            System.out.println(Arrays.toString(row));
        flip_horizonatal2_inplace(data);
        flip_horizontal3_row_base(data);
    }

    static void adapted_runestone_1() {
        String[][] arr = { {"hello","there","world"},
        {"how","are","you"} };
        
        System.out.println("number of rows : " + arr.length);
        System.out.println("number of cols : " + arr[0].length);
    }

    static void adapted_runestone_2() {
        int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("2 ways of printing last row are ");
        for (int i = 0; i < arr[arr.length-1].length; i++)
            System.out.print(arr[arr.length-1][i] + " ");
        System.out.println("");
        int [] tmp = arr[arr.length-1];
        System.out.println(Arrays.toString(tmp));
    }

    static void adapted_runestone_3() {
        int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("To print last column");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i][arr.length-1] + " ");
        System.out.println(); // 9 3 3
    }

    static void adapted_runestone_4() {
        System.out.println("sum each row into int [] ans using for each");
        int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        int [] ans = new int[arr.length];
        int i = 0;
        int row_sum;
        for (i = 0;i < arr.length;) {
            row_sum = 0;
            for (int num : arr[i])
                row_sum += num;
            ans[i++] = row_sum;
        }
        System.out.println(Arrays.toString(ans));
    }

    static void adapted_runestone_5() {
        System.out.println("sum diagonal cells");
        int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
            ans += arr[i][i];
        System.out.println(ans);
    }

    static void zero_to_lower_triangular() {
        int [][] data = { {1,2,3}, {4,5,6}, {7,8,9} };
        for(int i = 0;i < data.length;i++){
            for(int j = 0;j < data.length;j++){
                if(j < i)
                    data[i][j] = 0;
            }
        }
        for (int [] row : data)
        System.out.println( Arrays.toString(row) );
    }

    static void scenario_1(){
        int [][] a = {{1,2,3},{4,5,6}};
        int [][] d = transpose(a);
        for(int []row : d)
            System.out.println(Arrays.toString(row));
    }

    static int[][] transpose(int [][] b){
        int [][] c = new int[b[0].length][b.length];
        for(int i = 0;i < b[0].length;i++){
            for(int j = 0;j < b.length;j++){
                c[i][j] = b[j][i];
            }
        }
        return c;
    }

    static int[][] flip_horizontal1_cell_by_cell(int [][]input){
        int [][]ans = new int[input.length][input[0].length];
        for(int i = 0; i < input.length/2;i++){
            for(int j = 0; j < input[i].length;j++){
                ans [i][j] = input [input.length-1-i][j];
                ans [input.length-1-i][j] = input [i][j];
            }
        }
        if(input.length%2 != 0)
            ans[input.length/2] = input[input.length/2];
        return ans;
    }

    static void flip_horizonatal2_inplace(int [][] input){
        for(int i = 0; i < input.length/2;i++){
            for(int j = 0; j < input[i].length;j++){
                int tmp = input[i][j];
                input [i][j] = input [input.length-1-i][j];
                input [input.length-1-i][j] = tmp;
            }
        }
        for(int []row : input)
            System.out.println(Arrays.toString(row));
    }

    static void flip_horizontal3_row_base(int [][] input){
        for(int i = 0; i < input.length/2;i++){
            int []tmp = input[i];
            input[i] = input[input.length-1-i];
            input[input.length-1-i] = tmp;
        }
        for(int []row : input)
            System.out.println(Arrays.toString(row));
    }
}
