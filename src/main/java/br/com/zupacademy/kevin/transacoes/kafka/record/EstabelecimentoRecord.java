package br.com.zupacademy.kevin.transacoes.kafka.record;

public class EstabelecimentoRecord {
    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoRecord(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Deprecated
    public EstabelecimentoRecord() {
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
