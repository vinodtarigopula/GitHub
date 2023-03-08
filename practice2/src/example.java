public class example {
    public static void main(String[] args) {
        System.out.println("Hello Vinod");
        int result = getSum(2, 3);
        System.out.println("Sum of 2 and 3 is = " + result);
        int result2 = getRemind(2, 3);
        System.out.println("Sum of 2 and 3 is = " + result);
    }

    public static int getSum(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public static int getRemind(int a, int b) {
        int Remind;
        Remind = a + b;
        return Remind;
    }
}