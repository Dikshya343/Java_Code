public class private_class {
    int a;
    String name;
    private   private_class() {
        a = 50;
         name = "rajiv";


    }
    void show(){
        System.out.println(a+ " " + name);
    }
    public static void main(String[] args){

        private_class obj = new private_class();
        obj.show();




    }
}
