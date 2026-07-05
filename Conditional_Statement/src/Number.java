import java.util.Scanner;
public class Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd num");
        }
    }
}
