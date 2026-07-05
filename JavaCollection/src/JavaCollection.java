
//arraylist example//
import java.util.ArrayList;
public class JavaCollection {
    public static void main(String[] args){
        ArrayList<String > name =  new ArrayList<String>();
        name.add("dikxu");
        name.add("rajiv");
        name.add("rajish");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        name.set(1,"love");
        System.out.println(name);
        System.out.println(name.get(0));
        name.clear();
        System.out.println(name);

    }
}
