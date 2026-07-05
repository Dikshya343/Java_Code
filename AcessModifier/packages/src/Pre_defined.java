//pre_defined package in java//
import java.lang.System;
import java.lang.String;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Pre_defined {
    public static void main(String [] args){
        try{
            File r = new File("C:users\\ lenvo\\desktop\\lc.txt");
            Scanner sc = new Scanner(r);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }

            }
        catch(IOException e){
            System.out.println("exception handling.......");
        }




        }


        }
