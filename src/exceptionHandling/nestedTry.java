package exceptionHandling;

public class nestedTry {
//    finally block
    public static void main(String[] args) {
        try {
//            System.exit(0);
            int i=10;
            int j=i/0;
            System.out.println("In first try block");
            try {
                System.out.println("In second try block");
                String str = null;
                System.out.println(str.length());
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
        }catch (NullPointerException e){
            System.out.println("Null pointer exception"+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("In number format exception"+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception"+e.getMessage());
        }finally {
//            int i= 1/0;
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
        }
//exception propagation throw throws
    }
}
