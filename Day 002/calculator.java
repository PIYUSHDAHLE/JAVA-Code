import java.util.Scanner;

public class calculator {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number 1 : ");
            int n1 = sc.nextInt();
            System.out.print("Enter the Number 2 : ");
            int n2 = sc.nextInt();
            System.out.print(" Enter any one number (1 for +, 2 for -, 3 for *, 4 for /, 5 for % ) : ");
            int op = sc.nextInt();
            switch (op)
            {
                case 1:
                    System.out.println(n1+n2);
                    break;
                case 2:
                    System.out.println(n1-n2);
                    break;
                case 3:
                    System.out.println(n1*n2);
                    break;
                case 4:
                    System.out.println(n1/n2);
                    break;
                case 5:
                    System.out.println(n1%n2);
                    break;
                default:
                    System.out.println("invalid operator");
            }
        }


}
