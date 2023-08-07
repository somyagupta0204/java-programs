import java.util.*;
public class loop{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int i=1,n;
        System.out.println("enter the value of n");
        n=input.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
