import java.util.*;
public class ar{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);

        int n=a.nextInt();
        int b[]=new int[n];

        for(int i=0;i<n;i++){
            b[i]=a.nextInt();
        }

        int c[]=new int[n];

        for(int i=0;i<n;i++){
            c[i]=a.nextInt();
        }

        ArrayList<Integer> d=el(b,c);

        for(int i:d){
            System.out.print(i);
        }

    }

    public static ArrayList<Integer> el(int a1 [],int []a2){
        ArrayList<Integer> d1=new ArrayList<Integer>();
        for(int i:a1){
            d1.add(i);
        }
        for(int i:a2){
            d1.add(i);
        }
        return d1;
    }
}
