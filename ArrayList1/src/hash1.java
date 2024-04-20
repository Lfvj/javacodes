import java.util.*;
public class hash1{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);

        int n=a.nextInt();
        int b[]=new int[n];
        System.out.println("arr1");
        for(int i=0;i<n;i++){
            b[i]=a.nextInt();
        }

        int c[]=new int[n];
        System.out.println("arr2");
        for(int i=0;i<n;i++){
            c[i]=a.nextInt();
        }

        HashSet<Integer> d=el(b,c);

        for(int i:d){
            System.out.print(i+" ");
        }
    }

    public static HashSet<Integer> el(int a1 [],int []a2){
        HashSet<Integer> d1=new HashSet<Integer>();
        for(int i:a1){
            d1.add(i);
        }
        for(int i:a2){
            d1.add(i);
        }
        return d1;
    }
}
