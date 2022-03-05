package thisDemo;
/** this keyword -
 * 1. refers current class instance variable
 * 2. invoke current class methods
 * 3. invokes current class constructor
 * 4.
 */
public class ThisDemo {
//    instance variable or global variable
    private int id;
    private String name;
    private String address;

   public void setValues(int id, String name, String address) {
//       local variables
        id = 2;
        name = name;
        address = address;
        System.out.println("id:"+id+" Name:"+name+" Address:"+address);
    }
    public ThisDemo(){
       System.out.println("in constructor");
    }
    public ThisDemo(int i){
       this();
       System.out.println("in parameter constructor");

    }
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        obj.setValues(1,"Priti","Pune");

        ThisDemo obj1 = new ThisDemo(1);

// this constructor must be on first line
    }
}