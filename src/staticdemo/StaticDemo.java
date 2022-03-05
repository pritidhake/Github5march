package staticdemo;

/**Static keyword -
 * it can be variable, method, class
 * it can be used for memory management
 *
 *
 */
public class StaticDemo {
    int id;
    String name;
    static String companyName ="ABC";

    public StaticDemo(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id- "+id+" Name- "+name+" companyName- "+companyName);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo(1,"Priti");
        StaticDemo obj2 = new StaticDemo(2,"Tanuja");
        StaticDemo obj3 = new StaticDemo(3,"Anuja");
    }
}
