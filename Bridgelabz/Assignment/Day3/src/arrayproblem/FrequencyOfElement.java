package arrayproblem;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 5, 3, 9, 2, 1,1, 3};
        int[] frequency = new int[list.length];
        int visited = -1;


        for (int i = 0; i < list.length; i++) {
            int count = 1;

            for (int j = i + 1; j < list.length; j++) {

                if (list[i] == list[j]) {
                    count++;
                    frequency[j] = visited;
                }
                if (frequency[i] != visited) {
                    frequency[i] = count;
                }
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println("Elements  |||  Frequency");
                System.out.println(list[i]+"  |||  "+frequency[i]);
            }
        }
    }
}
