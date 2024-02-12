package arrayproblem;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] inputs = new int[] {4,71,93,56,74,12,39,54,27};
        int swap;
        for(int i =0 ; i<inputs.length ;i++){
            for(int j=i+1 ; j<inputs.length ; j++) {
                if(inputs[i] > inputs[j]) {
                    swap = inputs[i];
                    inputs[i]= inputs[j];
                    inputs[j]= swap;
                }
            }
        }
        System.out.println("Ascending Order =");
        for(int i=0 ; i<inputs.length ;i++) {
            System.out.println(inputs[i]);
        }
    }
}
