import java.util.Scanner;
import java.util.Arrays;



public class Array_Size {
    public static void main(String[] args){
        int  size;
        Scanner r = new Scanner(System.in);
        System.out.println("enter size of array");
        size = r.nextInt();
        int a[] = new int [size];
        for(int i = 0 ; i < size ; i ++){
           a[i]= r.nextInt();
        }
        System.out.println("sized");
        for(int i =0; i< size; i++){
            System.out.println(a[i]);
        }
        r.close();

    }
}
