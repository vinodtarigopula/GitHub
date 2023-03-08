public class BooleanExampleclass {
    public static void main(String []args)
    {
        canfly(true);
        canfly(false);
    }
    public static void canfly(boolean isBird)
    {
        if(isBird)
        {
            System.out.println("CanFly");
        }
            else{
            System.out.println("Cantfly");
        }
    }
}
