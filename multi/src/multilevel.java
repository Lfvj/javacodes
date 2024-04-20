public class multilevel {
    public static void main(String args[]){
        inner ob=new m1(10,20);
        ob.me1();
        inner1 ob1=new m1(20,10);
        ob1.me2();
    }
}


interface inner{
    void me1();
}
interface inner1{
    void me2();
}

class m1 implements inner,inner1{
    int a;
    int b;
    m1(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void me1() {
        System.out.println(a);
    }

    public void me2() {
        System.out.println(b);
    }

}