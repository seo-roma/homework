public class MyFirstApp {
public static void main (String[] args)  {
int n = 222;
int s = 0, m = 1;
for (int i = 0; i < 3; i++) {
    m *= n % 10;
    s += n % 10;
    n /= 10;
    }
System.out.println("Symma: " + s);
System.out.println("Ymnojenie: " + m);
  }
 }
