package br.com.unicarioca.cliente;

import br.com.unicarioca.usuario.Usuario;

public class Cliente extends Usuario {

    private String aniversario;
    private String CPF;

    public Cliente(String nome, String endereco, String telefone, String email, String aniversario, String CPF) {
        super(nome, endereco, telefone, email);
        this.aniversario = aniversario;
        this.CPF = CPF;
    }

    @Override
    public void Vender() {

    }

    @Override
    public void Comprar() {

    }

    @Override
    public void Cancelar() {

    }

    @Override
    public void Devolucao() {

    }

    @Override
    public void StatusVenda() {

    }

    @Override
    public void HistoricoVendas() {

    }
}
