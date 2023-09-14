import java.util.*;
public class loop12 {
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int lastdigit=0;
        int firstdigit=0;
        int sum=0;
        lastdigit=n%10;
        System.out.println("lastdigit is"+" "+lastdigit);
        while(n>0){
            firstdigit=n%10;
            n=n/10;
        }
        System.out.println("firstdigit is"+" "+firstdigit);
        sum=firstdigit+lastdigit;
        System.out.println("sum of firstdigit and lastdigit is"+" "+sum);
    }
    
}
