public class NestedForLoop{
    public static void main(String[] args) {
        for (int i = 1; i <6; i++) {
            for (int j = 1; j <6; j++) {
                System.out.print("*");
            } System.out.println("");
        }
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
