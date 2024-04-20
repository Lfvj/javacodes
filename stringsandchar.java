import java.util.Scanner;
public class stringsandchar {
    public static void main(String [] args){
        //user detail
        String name;
        int year;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        year=sc.nextInt();
        System.out.println("name-"+name);
        System.out.println("year of joining-"+year);

        //char
        char a='5';
        System.out.println(a);
    }
}
