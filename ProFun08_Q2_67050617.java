import java.util.*;

public class ProFun08_Q2_67050617 {
    public static void main(String[] args) {
        int[] a = {2,3,5,7};
        int[] b = {4,6,7,8};
        System.out.println(q3_common_element(a, b));

        top();
    }

    static boolean q3_common_element(int[]a ,int[]b){
        int i = 0,j = 0;
        while(i != a.length || j != b.length){
            if(a[i] > b[j] && j != b.length-1)
                j++;
            else if(a[i] < b[j] && i != a.length-1)
                i++;
            else if (a[i] == b[j])
                return true;
            else
                return false;
        }
        return false;
    }

    static void top(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int num = 1;
        while(num > 0){
            num = sc.nextInt();
            if(num > 0)
                numList.add(num);
        }
        int[]arr = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0;i < numList.size();i++){
            int j = 0,k = 1;
            while(numList.get(i) < arr[j]){
                j++;
            }
            while(arr.length-k != j){
                arr[arr.length-k] = arr[arr.length - (k + 1)];
                k++;
            }
            arr[j] = numList.get(i);
            System.out.println("insert -> " + numList.get(i) + " " + Arrays.toString(arr));
        }
        System.out.println("final " + Arrays.toString(arr));
        sc.close();
    }
}
