package exceptionHandling;

public class stackOverflowDemo {
    public void recursive(int i){
        System.out.println("i==>"+i);
        if(i==0){
            System.out.println("in zero");
        }else{
           recursive(i);
        }
    }
    public static void main(String[] args) {
        stackOverflowDemo obj= new stackOverflowDemo();
        obj.recursive(3);
    }
}
