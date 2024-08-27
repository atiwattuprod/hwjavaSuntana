public class Lab5Q4_167050617 {
    public static void main(String[] args) {
        String str = "wwwwmmmmwmwmwmwmmmwwwwwm";
        int women = 0;
        int men = 0;
        char []c = str.toCharArray();
        for(int i = 0;i < c.length;i++){
            if(c[i] == 'w'){
                women++;
            }
            else if(c[i] == 'm'){
                men++;
            }
        }
        System.out.println(women);
        System.out.println(men);
    }
}
