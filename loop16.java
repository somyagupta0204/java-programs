import java.util.*;
    public class loop16 {
        public static void main(String args[]){
            Scanner input=new Scanner (System.in);
            System.out.println("enter the value of n");
            int n=input.nextInt();
            int rem,rev=0;
            while(n>0){
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            System.out.println(rev);
    
}
    
    
}
