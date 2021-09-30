package br.com.unicarioca.produto;

public class Produto {
    private long id;
    private String nome;
    private float preco;
    private long qtde;
    private String descricao;

    public Produto(long id, String nome, float preco, long qtde, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public long getQtde() {
        return qtde;
    }

    public void setQtde(long qtde) {
        this.qtde = qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
