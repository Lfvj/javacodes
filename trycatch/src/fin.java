public class fin {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        try {
            if (a >= 10) {
                throw new Exception("change value of a");
            } else {
                System.out.println("change the value");
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("Always execute");
        }
    }
}
