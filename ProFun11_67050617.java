import java.util.Arrays;

public class ProFun11_67050617 {
    public static void main(String[] args) {
        q3_markMap();
        q4();
    }

    static void q3_markMap(){
        int[][] Map= {{0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0},
                      {0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0},
                      {0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0}};
        int[][] Map2 = Map;
        for(int[] num : MarkTheBomb(Map2)){
            System.out.println(Arrays.toString(num));
        }
    }

    static int [][] MarkTheBomb(int [][] bMap){
        for(int i = 0; i < bMap.length;i++){
            for(int j = 0;j < bMap[i].length;j++){
                if (bMap[i][j] == 9){
                    if(i == 0 && j == 0){
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                        bMap[i+1][j+1] += (bMap[i+1][j+1] == 9) ? 0:1;
                    }
                    else if(i == 0 && j ==  bMap[i].length-1){
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i+1][j-1] += (bMap[i+1][j-1] == 9) ? 0:1;
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                    }
                    else if(i == bMap.length-1 && j == 0){
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i-1][j+1] += (bMap[i-1][j+1] == 9) ? 0:1;
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                    }
                    else if(i == bMap.length-1 && j ==  bMap[i].length-1){
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i-1][j-1] += (bMap[i-1][j-1] == 9) ? 0:1;
                    }
                    else if(i == bMap.length-1 && j !=  bMap[i].length-1 && j != 0){
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i-1][j-1] += (bMap[i-1][j-1] == 9) ? 0:1;
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                        bMap[i-1][j+1] += (bMap[i-1][j+1] == 9) ? 0:1;
                    }
                    else if(i != bMap.length-1 && i != 0 && j ==  bMap[i].length-1){
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i-1][j-1] += (bMap[i-1][j-1] == 9) ? 0:1;
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i+1][j-1] += (bMap[i+1][j-1] == 9) ? 0:1;
                    }
                    else if(i != 0 && i != bMap.length-1 && j == 0){
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                        bMap[i+1][j+1] += (bMap[i+1][j+1] == 9) ? 0:1;
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                        bMap[i-1][j+1] += (bMap[i-1][j+1] == 9) ? 0:1;
                    }
                    else if(i == 0 && j != 0 && j !=  bMap[i].length-1){
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                        bMap[i+1][j+1] += (bMap[i+1][j+1] == 9) ? 0:1;
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                        bMap[i+1][j-1] += (bMap[i+1][j-1] == 9) ? 0:1;
                    }
                    else{
                        bMap[i-1][j] += (bMap[i-1][j] == 9) ? 0:1;
                        bMap[i-1][j-1] += (bMap[i-1][j-1] == 9) ? 0:1;
                        bMap[i+1][j] += (bMap[i+1][j] == 9) ? 0:1;
                        bMap[i+1][j+1] += (bMap[i+1][j+1] == 9) ? 0:1;
                        bMap[i][j-1] += (bMap[i][j-1] == 9) ? 0:1;
                        bMap[i][j+1] += (bMap[i][j+1] == 9) ? 0:1;
                        bMap[i-1][j+1] += (bMap[i-1][j+1] == 9) ? 0:1;
                        bMap[i+1][j-1] += (bMap[i+1][j-1] == 9) ? 0:1;
                    }
                }
            }
        }
        return bMap;
    }

    static void q4() {
        int[][] result = { {22, 88}, {11, 99}, {33, 77} };
        int[][] standing = fill_standing_row_by_row(result);
        int[][] standing2 = by_points_selection_sort(result);
        System.out.println("fill_standing_row_by_row");
        for (int[] row : standing) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("by_points_selection_sort");
        for (int[] row : standing2) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] fill_standing_row_by_row(int[][] raw_score) {
        int[][] tmp = new int[raw_score.length][raw_score[0].length];
        int best_i = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0;i < raw_score.length;i++){
            int mustgreater = 0;
            for(int j = 0;j < raw_score.length;j++){
                if(raw_score[j][1] > mustgreater && raw_score[j][1] < max){
                    mustgreater = raw_score[j][1];
                    best_i = j;
                }
            }
            tmp[i] = raw_score[best_i];
            max = raw_score[best_i][1];
        }
        return tmp;
    }

    static int[][] by_points_selection_sort(int [][] raw_score){
        int best_i = 0;
        for(int i = 0;i < raw_score.length;i++){
            for(int j = i+1;j < raw_score.length;j++){
                int mustgreater = raw_score[i][1];
                if(raw_score[j][1] >= mustgreater){
                    mustgreater = raw_score[j][1];
                    best_i = j;
                }
            }
            int []x = raw_score[best_i];
            raw_score[best_i] = raw_score[i];
            raw_score[i] = x;
        }
        return raw_score;
    }
}