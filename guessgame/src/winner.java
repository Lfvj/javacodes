public class winner extends players{
    boolean win(int p1,int p2,int randomnumber,int n) {
        int c = n;
        boolean value = false;
        if (p1 == randomnumber){
            System.out.println("Good choose!");
            System.out.println("player1 wins");
            value = true;
            c=0;
        }
        else if(p2==randomnumber){
            System.out.println("Good choose!");
            System.out.println("player2 wins");
            value=true;
            c=0;
        }
        if(c!=0){
            System.out.println("Wrong guess!");
            System.out.println("try again...");
        }
        return value;
    }
}
