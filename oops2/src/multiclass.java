import java.util.*;
public class multiclass{
    public static void main(String args[]){
        Scanner d=new Scanner(System.in);
        int b=d.nextInt();
        int c=d.nextInt();

        main2 a=new main2(b,c);
        System.out.print(a.m1(b,c));
    }
}
class main2{
    //int a,b;

    main2(int e,int f){
       int a=e;
      int b=f;
    }

    public static int m1(int n, int m){
        return n+m;
    }
    public static int m2(int a,int b){
        return a*b;
    }
}