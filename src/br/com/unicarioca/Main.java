package br.com.unicarioca;

import br.com.unicarioca.cliente.Cliente;
import br.com.unicarioca.fornecedor.Fornecedor;
import br.com.unicarioca.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente c1 = new Cliente("Eduardo", "Rua A", "0000", "0000", "0000", "0000");
        Fornecedor f1 = new Fornecedor("ABS Mercado", "Rua B", "(21)00000-0000", "contato@abs.com", "000.000.000/00-00", "0000.0000.0000");

        Pedido pe1 = new Pedido("Arroz Branco", 20, c1, f1);
        Pedido pe2 = new Pedido("Arroz Negro", 21, c1, f1);
        Pedido pe3 = new Pedido("Arroz Integral", 22, c1, f1);

        List<Pedido> ListaPedidosCliente1 = new ArrayList<>();
        ListaPedidosCliente1.add(pe1);
        ListaPedidosCliente1.add(pe2);
        ListaPedidosCliente1.add(pe3);

        f1.historicoVendas(ListaPedidosCliente1);
    }
}
