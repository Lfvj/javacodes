public class primenum{
    public static void main(String[ ] args){
        int a;
        for(a=2;a<=1000;a++){
            boolean isprime=true;
            for(int b=2;b<=Math.sqrt(a);b++){
                if (a % b == 0) {
                    isprime = false;
                    break;
                }
            }
        if(isprime==true){
            System.out.println(a);
        }
    }
    }
}