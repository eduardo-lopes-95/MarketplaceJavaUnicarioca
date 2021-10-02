package br.com.unicarioca.fornecedor;

import br.com.unicarioca.historico.Historico;
import br.com.unicarioca.pedido.Pedido;
import br.com.unicarioca.usuario.Usuario;

import java.util.List;

public class Fornecedor extends Usuario {
    private String CNPJ;
    private String inscricao_estadual;
    private List<Pedido> listaPedidos;
    private List<Historico> listaHistorico;

    public Fornecedor(String nome, String endereco, String telefone, String email, String CNPJ, String inscricao_estadual) {
        super(nome, endereco, telefone, email);
        this.CNPJ = CNPJ;
        this.inscricao_estadual = inscricao_estadual;
        boasVindas();
    }

    public void boasVindas() {
        System.out.println("Fornecedor Criado");
    }

    public void vender(){
        System.out.println("Fornecedor habilitado para vender");
    }

    public void cancelar(Pedido pedido){
        listaPedidos.remove(pedido);
        System.out.println("Pedido removido da lista");
    }

    public void historicoVendas(List<Pedido> itens) {
        System.out.println("Pedidos que foram realizados");
        for (Pedido iten : itens) {
            System.out.println("  "+iten.getDescricaoProduto()+" - "+"Qtde: "+iten.getQuantidade());
        }
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public List<Historico> getListaHistorico() {
        return listaHistorico;
    }

    public void setListaHistorico(List<Historico> listaHistorico) {
        this.listaHistorico = listaHistorico;
    }
}
