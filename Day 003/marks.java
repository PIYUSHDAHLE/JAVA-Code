import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int loop = 1, mark ;
        if (n == 1) {
            do {
                System.out.print("Enter your marks : ");
                 mark = sc.nextInt();
                if (mark >= 90) {
                    System.out.println("Excellent");
                } else if (89 >= mark && mark >= 60) {
                    System.out.println("very good");
                } else if (59 >= mark && mark >= 0) {
                    System.out.println("Good");
                }
                loop++;
            }
            while (loop<5);
        } else {
            System.out.println("Not entered the marks");
        }
    }
}