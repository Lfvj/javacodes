import java.util.Scanner;
public class casting {
    public static void main(String args[]){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        double sum=(double) a+(double) b;
        System.out.println(sum);
    }
}
