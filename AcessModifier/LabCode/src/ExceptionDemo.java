
public class ExceptionDemo {
    public static void main(String args[]){
        try{
            String data = null;
            data.toUpperCase();
        }
        catch(NullPointerException e){
            System.out.println("plz give initialized data");
        }
        catch(NumberFormatException e){
            System.out.println("plz give valid number");
        }
    }
    }
