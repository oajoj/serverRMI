package publisher.service;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServerService {

    List<Veiculo> listaVeiculos = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo) {
        this.listaVeiculos.add(veiculo);
    }

    public List<Veiculo> findVeiculoByAno(Integer ano){
        return this.listaVeiculos.stream().filter(x -> x.getAno() == ano).collect(Collectors.toList());
    }
}
