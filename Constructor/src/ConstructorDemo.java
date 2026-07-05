public class ConstructorDemo {
    int a;
    String name;
   public  ConstructorDemo(){
         a = 10;
        name = "dikxu";

    }
    void show(){
        System .out.println(a+ " "+name);

    }
    public static void main(String[] args){
       ConstructorDemo Obj = new ConstructorDemo();
       Obj.show();
    }

}
