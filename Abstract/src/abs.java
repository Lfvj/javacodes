abstract class abs {
    private int a,b;

    public void run(){
        System.out.println("abs running");
    }
    abstract void call(int a,int b);
}

class m1 extends abs{
    public void call(int a,int b){
        System.out.println(a+b);
    }
}
