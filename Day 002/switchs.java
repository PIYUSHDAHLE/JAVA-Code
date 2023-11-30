import java.util.Scanner;

public class switchs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter any one num (1, 2, 3) : ");
        int num = sc.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("hello boss");
                break;
            case 2:
                System.out.println("hey baby");
                break;
            case 3:
                System.out.println("hi bro");
                break;
            default:
                System.out.println("invalid button");
        }
    }
}
