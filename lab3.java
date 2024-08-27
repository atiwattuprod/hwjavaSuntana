public class lab3 {
    public static void main(String[] args) {
        int ans = 0;
        for(int i = 0; i < 1001; i++){
            if(i % 3 == 0 || i % 5 == 0){
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
