//supermethod example in java//

public class SuperMethod {
    void show(){
        System.out.println("hello dikxu");
    }
}

class Demo7 extends SuperMethod {
    void show(){
        super.show();
        System.out.println("hello rajiv");

    }

}

class test1{
    public static void main(String[] args){
        Demo7 obj = new Demo7() ;
        obj.show();
    }

}
