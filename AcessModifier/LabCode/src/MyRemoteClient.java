
import java.rmi.registry.*;

public class MyRemoteClient {
    public static void main(String args[]) throws Exception {
        Registry reg = LocateRegistry.getRegistry("localhost",1099);
        MyRemote obj = (MyRemote)  reg.lookup("myremote");
        boolean result = obj.CheckEven(9);
        System.out.println("result " +result);
    }
}
