package publisher;

import model.Veiculo;
import publisher.service.ServerService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServerImpl extends UnicastRemoteObject implements Server{

    private ServerService service;

    public ServerImpl() throws RemoteException {
        super();
        this.service = new ServerService();
    }

    @Override
    public List<Veiculo> search2Ano(Integer anoVeiculo) throws RemoteException {
        return service.findVeiculoByAno(anoVeiculo);
    }

    @Override
    public void add(Veiculo v) throws RemoteException {
        this.service.addVeiculo(v);
    }
}
