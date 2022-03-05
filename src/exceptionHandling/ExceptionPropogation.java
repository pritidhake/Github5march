package exceptionHandling;

public class ExceptionPropogation {
    public void a(){
        int a=10/0;
    }
    public void b(){
        a();
    }
    public void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        obj.c();
    }
}
