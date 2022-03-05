package accessmodifiers;

public class p4 {
    void getMsg(){
        System.out.println("*");
    }
}
class p4Impl{
    public static void main(String[] args) {
        p4 p = new p4();
        p.getMsg();
    }
}
