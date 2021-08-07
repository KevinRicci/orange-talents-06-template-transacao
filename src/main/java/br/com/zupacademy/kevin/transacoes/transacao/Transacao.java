package br.com.zupacademy.kevin.transacoes.transacao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank @Column(nullable = false)
    private String transacaoId;
    @NotNull
    private BigDecimal valor;
    @NotBlank @Column(nullable = false)
    private String estabelecimentoNome;
    @NotBlank @Column(nullable = false)
    private String estabelecimentoCidade;
    @NotBlank @Column(nullable = false)
    private String estabelecimentoEndereco;
    @NotBlank @Column(nullable = false)
    private String cartaoId;
    @NotBlank @Column(nullable = false)
    private String cartaoEmail;
    @NotNull
    private LocalDateTime efetivadaEm;

    public Transacao(String transacaoId, BigDecimal valor, String estabelecimentoNome, String estabelecimentoCidade, String estabelecimentoEndereco, String cartaoId, String cartaoEmail, LocalDateTime efetivadaEm) {
        this.transacaoId = transacaoId;
        this.valor = valor;
        this.estabelecimentoNome = estabelecimentoNome;
        this.estabelecimentoCidade = estabelecimentoCidade;
        this.estabelecimentoEndereco = estabelecimentoEndereco;
        this.cartaoId = cartaoId;
        this.cartaoEmail = cartaoEmail;
        this.efetivadaEm = efetivadaEm;
    }

    @Deprecated
    public Transacao(){}

    public long getId() {
        return id;
    }

    public String getTransacaoId() {
        return transacaoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getEstabelecimentoNome() {
        return estabelecimentoNome;
    }

    public String getEstabelecimentoCidade() {
        return estabelecimentoCidade;
    }

    public String getEstabelecimentoEndereco() {
        return estabelecimentoEndereco;
    }

    public String getCartaoId() {
        return cartaoId;
    }

    public String getCartaoEmail() {
        return cartaoEmail;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
