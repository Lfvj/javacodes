import java.util.*;
public class max{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);

        int n = a.nextInt();
        int b[] = new int[n];
        System.out.println("arr1");
        for (int i = 0; i < n; i++) {
            b[i] = a.nextInt();
        }

        int max=b[0];
        for(int i=1;i<n;i++){
            if(max>=b[i]){
                max=max;
            }else{
                max=b[i];
            }
        }
    System.out.print(max);
    }
    }