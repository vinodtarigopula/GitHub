public class nearHundread {
    public static void main(String []args){
        System.out.println(nearHundread(93));
        System.out.println(nearHundread(90));
        System.out.println(nearHundread(89));
    }
public  static boolean nearHundread(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
