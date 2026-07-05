public class Copy {
    int a;
    int b;
    Copy(){
        a = 10;
        b = 50;
        System.out.println(a+ " " +b );

    }
    Copy(Copy ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a+ " " +b );



    }
    class Demo {
        public static void main(String[] args) {
          Copy obj = new Copy();
           Copy obj1 = new Copy(obj);
        }



    }
}
