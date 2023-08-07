import java.util.*;
public class palindrome {
    public static void main(String args[]){
       Scanner input=new Scanner(System.in);
       int n,rev=0,c,rem;
       System.out.println("enter the value of n");
       n=input.nextInt();
       c=n;
       while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
       }
       System.out.println(rev);
       if(rev==c){
        System.out.println("it is a palindrome");
       }
       else{
        System.out.println("it is not a palindrome");

       }
    }
    
}
