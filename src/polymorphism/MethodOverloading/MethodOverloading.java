package polymorphism.MethodOverloading;

public class MethodOverloading {
    int product(int a,int b){
        int product=a * b;
        return product;
    }
    int product(int a,int b,int c){
        int product=a * b * c;
        return product;
    }
    float product(int a, float f){
        return a * f;
    }
    float product(float a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        System.out.println(mo.product(3,4));
        System.out.println(mo.product(4,3,2));
        System.out.println(mo.product(10,1.5f));
        System.out.println(mo.product(2.5f,6));
    }
}
