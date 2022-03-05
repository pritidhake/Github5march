package polymorphism.MethodOverloading;

public class MethodOverloading1 {
    int add(int a,int b){
        int result = a +b;
        return result;
    }
    int add(int a,int b,int c){
        int result = a+b+c;
        return result;
    }
    float add(int a,float f){
        return a+f;
    }
    float add(float a,int b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading1 demo = new MethodOverloading1();
        System.out.println(demo.add(10,20));
        System.out.println(demo.add(10,20,30));
        System.out.println(demo.add(10,20.5f));
        System.out.println(demo.add(10.5f,20));
        System.out.println(demo.add(10.5f,20.5f));
    }
}
