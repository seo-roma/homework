public class MyFirstApp {
public static void main (String[] args)  {
int c=33;  
    int a=c/10;  
    int b=c%10;  
    a = a ^ b;  
    b = b ^ a;
    a = a ^ b;    
    System.out.println(a+b);  
  }
 }
