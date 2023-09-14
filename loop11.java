import java.util.*;

public class loop11 {
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int firstdigit=0,lastdigit=0;
        lastdigit=n%10;
        System.out.println("last digit"+" "+lastdigit);
        while(n!=0){
         firstdigit=n%10;
         n=n/10;
     }
    System.out.println("first digit"+" "+firstdigit);
        
    }
    
}
