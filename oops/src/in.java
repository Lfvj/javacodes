import java.util.Scanner;
public class in{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str = input.nextLine();
        String uppercase = "";
        String lowercase = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if(Character.isUpperCase(ch)) {
                uppercase += ch;
            }
            else {
                lowercase += ch;
            }
        }
        String output = lowercase + uppercase;
        System.out.println(output);
    }
}