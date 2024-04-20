import java.util.Scanner;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        class2 s = new class2();
        s.add(10, 20);
    }
   static class class2{
        public static void add(int a, int b) {
            System.out.println(a + b);
        }
        public static void add(int a, int b, int c) {
            System.out.println(a - b-c);
        }
        public static void add(int a, int b, int c, int d) {
            System.out.println(a - b-c-d);
        }
    }
}