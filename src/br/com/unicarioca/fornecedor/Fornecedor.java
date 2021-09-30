package br.com.unicarioca.fornecedor;

import br.com.unicarioca.usuario.Usuario;

public class Fornecedor extends Usuario {
    private String CNPJ;
    private String inscricao_estadual;

    public Fornecedor(String nome, String endereco, String telefone, String email, String CNPJ, String inscricao_estadual) {
        super(nome, endereco, telefone, email);
        this.CNPJ = CNPJ;
        this.inscricao_estadual = inscricao_estadual;
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
