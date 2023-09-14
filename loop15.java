import java.util.*;
    public class loop15 {
        public static void main(String args[]){
            Scanner input=new Scanner (System.in);
            System.out.println("enter the value of n");
            int n=input.nextInt();
            int mul=1,rem;
            while(n>0){
                rem=n%10;
                mul=mul*rem;
                n=n/10;
            }
            System.out.println("product of digit of a number is"+" "+mul);
    
}
    }
