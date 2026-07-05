import java.rmi.*;
import java.rmi.registry.*;
public class MyRemoteServer {
    public static void main(String args[]) throws Exception {


        MyRemoteImpL obj = new MyRemoteImpL();
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("myremote",obj);
        System.out.println("RMI Serever Started....");

    }
}