
import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("equal");

        } else if (a > b ) {
            System.out.println("a is greater");

        }
        else{
            System.out.println("a is lesser");

    }
    }
}
