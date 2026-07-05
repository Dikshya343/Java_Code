import java.rmi.*;
public interface MyRemote extends Remote {
    public boolean  CheckEven(int a) throws  RemoteException ;
}
