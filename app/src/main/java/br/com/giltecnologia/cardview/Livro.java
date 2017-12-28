package br.com.giltecnologia.cardview;

public class Livro {


    private String nome;
    private String valor;

    public Livro(String nome, String valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
