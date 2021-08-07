package br.com.zupacademy.kevin.transacoes.kafka.record;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoRecord {

    @JsonProperty("id")
    private String id;
    @JsonProperty("valor")
    private BigDecimal valor;
    @JsonProperty("estabelecimento")
    private EstabelecimentoRecord estabelecimento;
    @JsonProperty("cartao")
    private CartaoRecord cartao;
    @JsonProperty("efetivadaEm")
    private LocalDateTime efetivadaEm;

    public TransacaoRecord(String id, BigDecimal valor, EstabelecimentoRecord estabelecimento, CartaoRecord cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    @Deprecated
    public TransacaoRecord(){}

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoRecord getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRecord getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoRecord{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
