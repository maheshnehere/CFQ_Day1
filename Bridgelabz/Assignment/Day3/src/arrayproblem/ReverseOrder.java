package arrayproblem;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] numbers = new int[] {56,14,27,74,83,97,24,7,47,5,32,79};

        System.out.println("Reverse Numbers =");
        for(int i =numbers.length-1; i>=0 ; i--) {
            System.out.println(numbers[i]);
        }
    }
}
