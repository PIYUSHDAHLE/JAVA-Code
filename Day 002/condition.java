import java.util.*;

public class condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a= sc.nextInt();
        System.out.print("Enter the number : ");
        int b= sc.nextInt();
        if (a<b){
            System.out.println(a+" is less then "+b);
        } else if(a>b){
            System.out.println(a+" is grater then "+b);
        } else{
            System.out.println(a+" is equal to "+b);
        }
    }
}