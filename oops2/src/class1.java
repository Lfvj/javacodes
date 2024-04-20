import java.util.*;
public class class1 {
    public static void main(String args[]){
        Scanner d=new Scanner(System.in);

        int b=d.nextInt();
        int c=d.nextInt();
        main1 a=new main1(b,c);
        System.out.print(a.m1(b,c));
        System.out.print(a.m2(b,c));

    }
}
class main1{
    int a,b;


    main1(int e,int f){
        a=e;

        b=f;
    }
    public static int m1(int n, int m){
       return n+m;
    }
    public static int m2(int a,int b){
        return a*b;
    }
}