public class makes10 {
    public static void main(String []args){
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));
}
//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
public static boolean makes10(int a,int b){
    return (a == 10 || b == 10 || a+b == 10);
    }
}