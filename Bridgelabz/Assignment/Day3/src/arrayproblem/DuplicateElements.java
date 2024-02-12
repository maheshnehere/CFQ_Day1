package arrayproblem;

public class DuplicateElements {
        public static void main(String[] args) {
            int[] num = new int[7];
            num[0] = 2 ;
            num[1] = 1 ;
            num[2] = 5 ;
            num[3] = 2 ;
            num[4] = 5 ;
            num[5] = 1 ;
            num[6] = 7 ;

            System.out.println("Duplicate Elements =");
            for(int i=0 ; i<num.length ; i++) {
                for(int j=i+1; j<num.length ; j++) {
                    if(num[i]==num[j]) {
                        System.out.println(num[i]);
                    }
                }

            }

        }
    }

