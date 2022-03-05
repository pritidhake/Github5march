public class opraters{
    public static void main(String[] args){
        //Unary operaters
        int n=25;
        System.out.println(n);
        System.out.println(n++);
        System.out.println(++n);
        System.out.println(n--);
        System.out.println(--n);
        System.out.println(-n);
        System.out.println(n++ + ++n);

        //Tilt operaters, negation
        int a=25;
        int b=-25;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);

        //Arithmetic operaters
        int p=10;
        int q=2;
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);

        System.out.println(15*5/2+3-4+25*6/3);

        //Left shift operaters
        System.out.println(p>>2);
        System.out.println(q>>2);
        System.out.println(48>>2);
        System.out.println(20>>2);

        //Right shift operaters
        System.out.println(p<<2);
        System.out.println(q<<2);
        System.out.println(48<<2);
        System.out.println(20<<2);

        //Logical | Bitwise operaters
        int e = 20;
        int f = 5;
        int g = 25;
        System.out.println(e<f && e<g);
        System.out.println(e<f & e<g);
        System.out.println(e<f || e<g);
        System.out.println(e<f | e<g);

        //Ternary operaters
        int l = 7;
        int m = 9;
        int min = a<b?a:b;
        int max = l>m?l:m;
        System.out.println("minimum " +min);
        System.out.println("maximum " +max);




    }
}
