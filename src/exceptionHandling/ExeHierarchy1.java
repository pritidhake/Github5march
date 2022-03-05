package exceptionHandling;

public class ExeHierarchy1 {
    public static void main(String[] args) {
        int i=4;
        int j=10;

        try{
            int k=i/j;  //critical condition
            System.out.println();
        } catch (ArithmeticException e){
            System.out.println(e);
            e.getMessage();
        }
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");

    }
}
