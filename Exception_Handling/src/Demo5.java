public class Demo5 {
    public  static void main(String[] args){
        System.out.println("main method");
        int a = 10, b = 0 , c;
        try{
            c = a / b;
            System.out.println(c);

        }catch(ArithmeticException e){
            System.out.println("cant divided by zero");
        }
        System.out.println("main method ende");


        }

    }

