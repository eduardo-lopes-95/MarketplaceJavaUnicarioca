package br.com.unicarioca.cliente;

import br.com.unicarioca.historico.Historico;
import br.com.unicarioca.pedido.Pedido;
import br.com.unicarioca.usuario.Usuario;

import java.util.List;

public class Cliente extends Usuario {
    private String aniversario;
    private String CPF;
    private List<Pedido> listaPedidos;
    private List<Historico> listaHistorico;

    public Cliente(String nome, String endereco, String telefone, String email, String aniversario, String CPF) {
        super(nome, endereco, telefone, email);
        this.aniversario = aniversario;
        this.CPF = CPF;
        boasVindas();
    }

    public void boasVindas() {
        System.out.println("Cliente criado");
    }

    public void cancelar(Pedido pedido) {
        listaPedidos.remove(pedido);
        System.out.println("Pedido removido da lista");
    }

    public void historicoCompras(List<Pedido> itens) {
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
