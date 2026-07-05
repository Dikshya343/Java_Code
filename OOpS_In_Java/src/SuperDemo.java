
//example of superkeyword//
public class SuperDemo {

        int a = 10;


}

class  Demo extends SuperDemo {

        int a = 20;
        void show(){
            System.out.println(a);
            System.out.println(super.a);
        }


}
class test {
    public static void main(String [] args){
        Demo obj = new Demo() ;
        obj.show();



    }
}