package arrayproblem;

public class PrintArray {
    public static void main(String[] args) {

        int[] num = new int[5];
        num[0] = 23 ;
        num[1] = 47 ;
        num[2] = 74 ;
        num[3] = 47 ;
        num[4] = 27 ;

        System.out.println("Numbers =");
        for (int j : num) {
            System.out.println(j);
        }
    }
}

