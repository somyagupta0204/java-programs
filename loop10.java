import java.util.*;
public class loop10 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=input.nextInt();
        int count=0,rem,rev=0;
       while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        count++;
       }
       System.out.println(count);
    }
    
}
