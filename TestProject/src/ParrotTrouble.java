public class ParrotTrouble {
    public static void main(String []args){
        System.out.println(ParrotTrouble(true, 6));
        System.out.println(ParrotTrouble(true, 7));
        System.out.println(ParrotTrouble(false, 6));
    }
    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are
    //in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean ParrotTrouble(boolean talking, int hour){
        return(talking && (hour < 7 || hour > 20));
    }
}
