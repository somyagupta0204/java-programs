import java.util.*;
    public class loop14 {
        public static void main(String args[]){
            Scanner input=new Scanner (System.in);
            System.out.println("enter the value of n");
            int n=input.nextInt();
            int sum=0,rem;
            while(n>0){
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            System.out.println(sum);
    
}
    }
