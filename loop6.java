import java.util.*;
public class loop6 {
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the value of n");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum is" +" "+sum);
    }
    
}
