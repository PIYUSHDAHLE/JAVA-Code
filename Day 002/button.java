import java.util.*;

public class button {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print(" Enter any one num (1, 2, 3) : ");
        int num = sc.nextInt();
        if(num==1){
            System.out.println("Hello");
        } else if (num==2) {
            System.out.println("Namaste");
        } else if (num==3) {
            System.out.println("hey");
        }else{
            System.out.println("You entered the incorrect number.");
            System.out.print("Please enter the correct one : ");
            num = sc.nextInt();
        }

    }
}
