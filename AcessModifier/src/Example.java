//public method//
public class Example {
    public int a = 10;
    public void show(){
        System.out.println("public method");

    }
    public static void main(String[] args){
        Example obj = new Example();
        obj.show();
    }
}
