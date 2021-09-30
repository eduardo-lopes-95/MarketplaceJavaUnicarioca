package br.com.unicarioca.usuario;

import br.com.unicarioca.operacoes.Operacoes;

public abstract class Usuario implements Operacoes {
    private String nome;
    private String aniversario;
    private String CPF;
    private String endereco;
    private String telefone;
    private String email;

    public Usuario(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

}
