import java.util.Scanner;

public class Switch_Class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter number");
        int buttom = sc.nextInt();
        switch(buttom){
            case 1:  System.out.println("hello");
            break;
            case 2:
                System.out.println("nameste");
                break;

            case 3:
                System.out.println("nojungor");
                break;
            default:
                System.out.println("invalid buttom");

        }
    }
}
