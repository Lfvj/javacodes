class hierarch{
    public static void man(int a, int b,int c, int d) {
        System.out.println("1");
    }
}
class e1 extends hierarch{
    public static void man(int a, int b) {
        System.out.println("2");
    }
}
class f1 extends e1{
    public static void man(int a, int b,int c){
        System.out.println("3");
    }
}

//parent
class m1{
    public static void main(String arg[]) {
        f1 s1=new f1();
        s1.man(10,20,30,40);
    }
}