public class trys extends winner{
    void loss(int p1,int p2,int random,int chance,boolean val){
        int c=chance;
        if(!val) {
            if (c!=0){
                System.out.println("They both choose number like");
                if (p1 < random)
                    System.out.println("p1 choose small number than random");

                else if (p1 > random)
                    System.out.println("p1 choose big number than random");

                if (p2 < random)
                    System.out.println("p2 choose small number than random");

                else if (p2 > random)
                    System.out.println("p2 choose big number than random");
            }
        }
        if(!val){
        if(c==0) {
            System.out.println("Sorry retry completed no one wins \n       ..game over..");
        }
        }
    }
}
