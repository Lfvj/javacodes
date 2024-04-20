 import java.util.Scanner;
public class inputvalue {
    public static void main(String [] args){

        //scanner
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        //celsius
        double celsius=b-32/1.8;
        System.out.println(celsius);

        //fahrenheit
        double fahrenheit=a*1.8+32;
        System.out.println(fahrenheit);
    }
}
