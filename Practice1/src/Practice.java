public class Practice {

    public static void main(String []args) {
             System.out.println("Hello Vinod");

            printNumbers(5);

        printEvenNumbers(10);

        int result = getdifference(2,3);
             System.out.println("difference of 2 and 3 is = " + result );
        int result2 = getSum( 2,3);
             System.out.println("Sum of 2 and 3 is = " + result2);
             int result3 = getproduct( 2 ,3);
             System.out.println("product of 2 and 3 is = "+ result3);
        int result4 = getdivision( 6 ,3);
        System.out.println("division of 6 and 3 is = "+ result4);

    }
    public static void printNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
        public static void printEvenNumbers(int n){
            for (int i=0; i<=n; i++){
                if( i % 2 == 0)
                System.out.println(i);
            }
    }
    public static int getdifference(int a, int b){
        int diff;
        diff = a - b;
        return diff;
    }
public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
}
public static int getproduct(int a, int b){
        int product = a * b;
        return product;
}
    public static int getdivision(int a, int b){
        int division = a / b;
        return division;
    }
}
