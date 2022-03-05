package exceptionHandling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        //    throws used to declare exception
        int age=15;
        try{
            if (age>=16){
                System.out.println("you can vote");
            }else{
                throw new Exception("you can not vote");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hi");
        System.out.println("Hi");
    }
}
/**
 *                 throw                                                                   Throws
 * 1. throw is used to throw exception                                          throws is  used to declare exception
 * 2. throw is used within a method                                             throws is used with method signature
 * 3. we can throw only one exception at a time                                 you can declare multiple exception at a time
 * 4. throw is used with  new instance                                          throws is used with class instance
 */
