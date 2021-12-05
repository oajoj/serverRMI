package model;

import java.io.Serializable;

public class Veiculo implements Serializable {

    private String nomeCliente;
    private String marcaVeiculo;
    private Double valorVenda;
    private Integer ano;

    public Veiculo() {
    }

    public Veiculo(String nomeCliente, String marcaVeiculo, Double valorVenda, Integer ano) {
        this.nomeCliente = nomeCliente;
        this.marcaVeiculo = marcaVeiculo;
        this.valorVenda = valorVenda;
        this.ano = ano;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
