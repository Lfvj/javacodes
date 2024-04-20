class m{
    public static void man1(int a) {
        System.out.println(a);
    }
    static class d extends m{
        public static void main(String arg[]) {
            d s=new d();
            s.man1(10);

        }
    }
}