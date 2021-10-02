package br.com.unicarioca.pedido;

import br.com.unicarioca.cliente.Cliente;
import br.com.unicarioca.fornecedor.Fornecedor;
import java.util.Random;

public class Pedido {
    Random r = new Random();
    private int id;
    Cliente cliente;
    Fornecedor fornecedor;
    private String descricaoProduto;
    private int quantidade;

    public Pedido(String descricaoProduto, int quantidade, Cliente cliente, Fornecedor fornecedor) {
        this.id = r.nextInt(100);
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        //Status();
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

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void Status() {
        System.out.println( "Pedido Gerado{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", quantidade=" + quantidade +
                '}');
    }
}
