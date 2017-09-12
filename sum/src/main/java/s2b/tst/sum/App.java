package s2b.tst.sum;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("A:");
        double a = in.nextDouble();
        System.out.println("B:");
        double b = in.nextDouble();
        in.close();
        double r=Sum.sum(a, b);
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("Soma:"+r);
        //
        System.out.println(" ");
    }
}
