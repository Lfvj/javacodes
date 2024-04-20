import java.util.*;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        StringBuilder b = new StringBuilder();

        int c = a.length();
        char e= a.charAt(0);
        int count = 0;

            for (int i = 0; i<c; i++) {
                if (e == a.charAt(i)) {
                    count++;
                } else {
                    b.append(e);
                    b.append(count);
                    count = 1;
                    e = a.charAt(i);
                }
            }
                b.append(e);
                b.append(count);
                System.out.print(b);

        }
    }

