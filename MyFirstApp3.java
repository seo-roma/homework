public class MyFirstApp {
public static void main (String[] args)  {
 int a = 1;
 int b = 2;
 int c = 3;
   a = a ^ c;  
   c = c ^ a;
   a = a ^ c;
   c = b; 
   b = a - c;

    	   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);

	  
  }
 }
