package publisher;

import model.Veiculo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Server extends Remote {
    List<Veiculo> search2Ano(Integer anoVeiculo) throws RemoteException;
    void add(Veiculo v) throws RemoteException;
}
