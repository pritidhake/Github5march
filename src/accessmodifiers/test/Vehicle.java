package accessmodifiers.test;

public class Vehicle {
    private String privateDataMember;
    public String publicDataMember;
    protected String protectedDataMember;
    String defaultDataMember;
}
class Bike extends Vehicle {
    void display(){
        //System.out.println(privateDataMember);
        System.out.println(publicDataMember); //accessible anywhere
        System.out.println(protectedDataMember);
        System.out.println(defaultDataMember);
    }
}
