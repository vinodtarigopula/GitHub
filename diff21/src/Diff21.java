public class Diff21 {
    public static void main(String []args) {
        System.out.println(Diff21(19));
        System.out.println(Diff21(10));
        System.out.println(Diff21(21));
    }
    public static int Diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
