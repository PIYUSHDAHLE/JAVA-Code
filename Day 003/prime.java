import java.util.*;
public class prime {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int i, count=0;
    for( i=1;i<=n;i++)
    {
        if(n%i==0)
        {
//            System.out.println(" i : "+i);
            count++;
        }
    }
    if(count==2){
        System.out.println(i+"Prime number");
    }else{
        System.out.println("Not prime Number");
    }
}
}
