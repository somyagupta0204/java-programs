import java.util.*;
public class loop7 {
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the value of n");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
