import java.util.Random;
public class numbers extends input{
    public int guess(int num){
        Random r=new Random();
        int randomnum=1+r.nextInt(num);
        return randomnum;
    }
}
