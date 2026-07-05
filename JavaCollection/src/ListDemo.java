//linkedlist example//


import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args){
        LinkedList<String>  name = new LinkedList<String>();
        name.add("dikxu");
        name.add("yadav");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
        System.out.println(name.get(0));
        name.clear();
        System.out.println(name);

    }
}
