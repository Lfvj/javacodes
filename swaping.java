public class swaping {
   public static void main (String[] args) {
       int a=10,b=20,temp;
       temp=b;
       b=a;
       a=temp;
       System.out.println(a+" "+b);
       temp=a+b;
       b=temp-b;
       a=temp-a;
       System.out.println(a+" "+b);

    }
}
