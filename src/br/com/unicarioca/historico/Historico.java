package br.com.unicarioca.historico;

import br.com.unicarioca.cliente.Cliente;
import br.com.unicarioca.fornecedor.Fornecedor;
import br.com.unicarioca.pedido.Pedido;

import java.util.List;
import java.util.Random;

public class Historico {
    Random r = new Random();
    private int id;
    Cliente cliente;
    Fornecedor fornecedor;
    List<Pedido> listaPedido;
    private String cpfCliente;
    private String nomeCliente;
    private String informacoesPedido;

    public Historico(String cpfCliente, String nomeCliente, String informacoesPedido, List<Pedido> listaPedido) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.informacoesPedido = informacoesPedido;
        this.listaPedido = listaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getInformacoesPedido() {
        return informacoesPedido;
    }

    public void setInformacoesPedido(String informacoesPedido) {
        this.informacoesPedido = informacoesPedido;
    }
}
