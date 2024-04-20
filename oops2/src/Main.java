import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner a =new Scanner(System.in);
          int b=a.nextInt();
          int c=a.nextInt();
          in(b,c);
          int d=back(b,c);
          System.out.print(d);
    }

    public static void in(int a,int b){
        System.out.println(a+b);
    }

    public static int back(int a,int b){
        return a-b;
    }
}