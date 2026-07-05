
//super constructor example//
public class SuperConstructor {
    SuperConstructor(){
        System.out.println("love you");
    }
}
 class ConstructorDemo extends SuperConstructor {
    ConstructorDemo(){
        super();
        System.out.println("hate you");
    }
 }

class Test {
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();


    }

}