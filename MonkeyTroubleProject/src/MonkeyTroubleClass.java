public class MonkeyTroubleClass {

    public static void main(String[] args){

        System.out.println(MonkeyTrouble(true, true));
        System.out.println(MonkeyTrouble(false, false));
        System.out.println(MonkeyTrouble(true, false));
    }

    public static boolean MonkeyTrouble(boolean asmile, boolean bsmile){
        if (asmile == true && bsmile == true){
            return true;
        }
        else if (asmile == false && bsmile == false){
            return true;
        }
        else {
            return false;
        }
    }
}
