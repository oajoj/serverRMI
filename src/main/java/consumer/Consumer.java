package consumer;

import model.Veiculo;
import publisher.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Consumer {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String urlServidor = "rmi://localhost/RmiServidor";
        Server serv = (Server) Naming.lookup(urlServidor);
        serv.add(new Veiculo("João Paulo", "Chevrolet", 1200d, 2010));
        System.out.println(serv.search2Ano(2010));
    }
}
