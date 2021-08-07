package br.com.zupacademy.kevin.transacoes.transacao;

import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

    private BigDecimal valor;
    private String estabelecimento;
    private LocalDateTime efetivadaEm;

    public TransacaoResponse(Transacao transacao) {
        this.valor = transacao.getValor();
        this.estabelecimento = transacao.getEstabelecimentoNome();
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public TransacaoResponse() {
    }

    public Page<TransacaoResponse> converter(Page<Transacao> transacoes){
        return transacoes.map(transacao -> new TransacaoResponse(transacao));
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
