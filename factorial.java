import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,fact=1;
      System.out.println("enter the value of n");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
           
        }
        System.out.println(fact);
    }
    

    
}
