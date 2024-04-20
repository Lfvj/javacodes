public class tr {
    public static void main(String args[]){
        int a=10;
        int b=0;
        try{
            if(a>=10){
                System.out.println("change value of a");
            }else{
                System.out.println("change the value");
            }
        }catch(Exception e){
            System.out.println("error : "+e.getMessage());
          // throw new Exception("error : "+e.getMessage());
        }finally{
            System.out.println("Always execute");
        }
    }
}
