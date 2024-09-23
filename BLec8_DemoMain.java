import java.util.Arrays;

public class BLec8_DemoMain {
    public static void main(String[] args) {
        demo1_caller();
        demo2_caller();
        demo3_caller();
        demo4_caller();
        demo5_caller();
    }
    static void demo1_caller() {
        // show that a pass by value (copy) is local variable to the callee
        System.out.println("--- demo1 ---");
        int x = 5;
        demo1_callee(x);
        System.out.println(x); // 5

    }
    static void demo1_callee(int x) {
        x += 10;
        System.out.println(x);  // 15
    }
    static void demo2_caller() {
        // return value should be caught by the caller
        System.out.println("--- demo2 ---");
        int x = 5;
        x = demo2_callee(x); 
        int y = demo2_callee(5); 
        System.out.println(x);      // 15
        System.out.println(y);      // 15
        System.out.println(demo2_callee(6)); // 16
        demo2_callee(7);         // ok to call
    }
    static int demo2_callee(int x) {
        return x+10;               
    }
    // static void resetTmp(int [] a, int [] b) {
    //     for (int i = 0; i < a.length; i++)
    //         b[i] = a[i];
    // }
    static void demo3_caller() {
        // a passed reference to the callee references to the original object
        System.out.println("--- demo3 ---");
        int [] arr = {1,2,3,4,5};
        demo3_callee(arr);
        System.out.println("from demo3 caller " + Arrays.toString(arr));
        // [2, 1, 4, 3, 5]
    }
    static void demo3_callee(int [] a) {
        for (int i = 0; i + 1 < a.length; i+=2) {
            a[i] = a[i] + a[i+1];   // x = x + y
            a[i+1] = a[i] - a[i+1]; // y = x - y => (x + y) - y => x
            a[i] = a[i] - a[i+1];   // x = x - y => (x + y) - x => y
        }
        System.out.println("from demo3 callee " + Arrays.toString(a));
        // [2, 1, 4, 3, 5]
    }
    static void demo4_caller() {
        // a change to the callee reference does not effect the caller's (copy of reference)
        System.out.println("--- demo4 ---");
        int [] arr = {1,2,3,4,5};
        demo4_callee(arr);
        System.out.println("from demo4 caller " + Arrays.toString(arr)); // only change to arr before a changes its referenced object
        // [6, 2, 3, 4, 5]
    }
    static void demo4_callee(int [] a) {
        a[0] += 5;
        int [] ref = a;
        int [] nums = {2,4,6};
        a = nums;
        System.out.println("from demo4 callee " + Arrays.toString(a));      // [2, 4, 6]
        System.out.println("from demo4 callee " + Arrays.toString(ref));    // [6, 2, 3, 4, 5]
    }
    static void demo5_caller() {
        // a created object inside a callee can be return to the caller
        System.out.println("--- demo5 ---");
        int [] arr = {1,2,3,4,5};
        int [] c = demo5_callee(arr);
        System.out.println("from demo5 caller " + Arrays.toString(c));     // [5, 4, 3, 2, 1]
        System.out.println("from demo5 caller " + Arrays.toString(arr));   // [1, 2, 3, 4, 5]
        arr = demo5_callee(arr);
        System.out.println("from demo5 caller " + Arrays.toString(arr));   // [5, 4, 3, 2, 1]
    }
    static int [] demo5_callee(int [] arr) {
        int [] b = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--)
            b[i] = arr[arr.length - i - 1];
        System.out.println("from demo5 callee " + Arrays.toString(b));     
        return b;
    }
}
