import java.rmi.*;
import java.rmi.server.*;
public class MyRemoteImpL extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpL() throws RemoteException {
        super();
    }
    public boolean  CheckEven(int a) throws RemoteException {
        return (a % 2 == 0);
    }
}
