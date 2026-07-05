//parametrized constructor //
public class Demo {
    int a;
    String name;

    public Demo(int x, String y){
        a = x;
        name = y;



    }
    void show(){
        System.out.println(a+ " "+name);

    }
    public static void main(String[] args){
        Demo obj = new Demo(10, "Rajiv");
        obj.show();
    }
}
