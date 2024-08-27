public class Lab7Q267050617 {
    public static void main(String[] args) {
        // 2.1
        ReplaceWith("MI","At KMITL CHALONGKRUNG BMI MTL","CSP");
        //
        System.out.println();
        // 2.2
        System.out.println(myIndexOf("PMRQNO", "PM"));
        System.out.println(myIndexOf("PMRQNO", "QNO"));
        System.out.println(myIndexOf("PMRQNO", "ZR"));
        //
        System.out.println();
        // 2.3
        System.out.println(containsAndBefore("PMRQNO","PM","QNO"));
        System.out.println(containsAndBefore("PMRQNO","QN","MR"));
        System.out.println(containsAndBefore("PMRQNO","A","QN"));
    }

    static void ReplaceWith(String Remove,String input,String Replace){
        String output = "";
        for(int i = 0;i < input.length();i++){
            int offset = 0;
            while(offset < Remove.length() && input.charAt(i + offset) == Remove.charAt(offset)){
                offset++;
            }
            if(offset == Remove.length()){
                output += Replace;
                i += Remove.length() - 1;
            }
            else{
                output += input.charAt(i);
            }
        }
        System.out.println(output);
    }

    static int myIndexOf(String str,String sub){
        for(int i = 0;i < str.length();i++){
            int offset = 0;
            while(offset < sub.length() && str.charAt(i + offset) == sub.charAt(offset)){
                offset++;
            }
            if(offset == sub.length()){
                return i;
            }
        }
        return -1;
    }

    static boolean containsAndBefore(String input,String sub1,String sub2){
        boolean str1 = false;
        boolean str2 = false;
        int idx1 = -1;
        int idx2 = -1;
        for(int i = 0;i < input.length();i++){
            int offset = 0;
            while(offset < sub1.length() && input.charAt(i + offset) == sub1.charAt(offset)){
                offset++;
            }
            if(offset == sub1.length()){
                str1 = true;
                idx1 = i;
            }
            offset = 0;
            while(offset < sub2.length() && input.charAt(i + offset) == sub2.charAt(offset)){
                offset++;
            }
            if(offset == sub2.length()){
                str2 = true;
                idx2 = i;
            }
        }
        boolean ans = str1 && str2 && idx1 < idx2;
        return ans;
    }
}
