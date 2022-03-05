public class ForEachLoopEg {
    public static void main(String[] args){
        int i []={10,-5,60,40,-20};
        int sum=0;
        for (int newi : i) {
            sum =sum+newi;
            System.out.println(newi);
        }
        System.out.println(sum);
    }
}
