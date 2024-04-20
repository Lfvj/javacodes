import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        trys ob=new trys();

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the guess value");
        int gu=sc.nextInt();
        System.out.println("number of chances");
        int chance = sc.nextInt();
        int n=chance-1;
        System.out.println("enter the player1 guess");
        int p1=sc.nextInt();
        System.out.println("enter the player2 guess");
        int p2=sc.nextInt();

        int random=ob.guess(gu);
        int player1=ob.player1(p1);
        int player2=ob.player2(p2);
        boolean val=ob.win(player1,player2,random,chance);

        if(!val) {
               ob.loss(player1, player2, random,chance,val);
               int j=n;
            for(int i=0;i<=n;i++) {
                if(!val) {
                    System.out.println("again enter the player1 guess");
                    p1 = sc.nextInt();
                    System.out.println("again enter the player2 guess");
                    p2 = sc.nextInt();

                    val = ob.win(p1, p2, random, j);
                    ob.loss(p1, p2, random, j, val);
                }
                j--;
            }
        }

    }
}
