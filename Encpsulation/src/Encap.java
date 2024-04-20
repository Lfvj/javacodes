import java.util.*;
public class Encap {
    public static   void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        int a=sc.nextInt();
        sc.nextLine();

        encap1 ob=new encap1(b,a);
        ob.setname(b);
        ob.setage(a);
        System.out.println(ob.get());
        System.out.println(ob.get2());
    }
}
