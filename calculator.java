import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner input= new Scanner (System.in);
        double a,b;
        char operator;
        System.out.println("choose the operator: +,-,* and /");
        operator=input.next().charAt(0);
        System.out.println("enter the numbers");
         a=input.nextDouble();
         b=input.nextDouble();
        switch(operator)
        {
          case '+':
          System.out.println(a+b);
          break;
          case '-':
          System.out.println(a-b);
          break;
          case '*':
          System.out.println(a*b);
          break;
          case '/':
          System.out.println(a/b);
          break;
          default:
          System.out.println("invalid operator");
          break;
        }
    }
}
        

         
    
    

