import java.util.Scanner;
public class Button {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of button");
        int  button= sc.nextInt();
        if(button == 1){
            System.out.println("hello");
        }
        else if(button == 2){
            System.out.println("nameste");
        }
        else if(button == 3){
            System.out.println("brongous");
        }
        else{
            System.out.println("invalied");

        }

    }
}
