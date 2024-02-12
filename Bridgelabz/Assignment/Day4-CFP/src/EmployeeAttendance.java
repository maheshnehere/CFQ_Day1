import java.util.*;
public class EmployeeAttendance {
    public static void main(String[] args) {
        // UC 1 = Check Employee is Present or Absent
        Random random = new Random();
        boolean num = random.nextBoolean();

        if (num == true) {
            System.out.println(" Employee is Present");
        } else {
            System.out.println(" Employee is Absent");
        }
    }
}
