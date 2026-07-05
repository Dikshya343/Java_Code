//defULT CONSTRUCTOR//
public class Default {
    int a;
    String name;
    public Default(){
        a = 10;
        name = "dikshya";


    }
    void display(){
        System.out.println( a +" "  + name );

    }
    public static void main(String[] args){
        Default obj = new Default();
        obj.display();
    }
}
