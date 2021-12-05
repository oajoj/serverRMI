package publisher;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRunner {
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        LocateRegistry.createRegistry(1099);

        ServerImpl serv = new ServerImpl();

        Naming.bind("RmiServidor", serv);
        System.out.println("RmiServidor Conectado!!");
    }
}
