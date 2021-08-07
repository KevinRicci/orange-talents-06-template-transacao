package br.com.zupacademy.kevin.transacoes.kafka;

import br.com.zupacademy.kevin.transacoes.kafka.record.TransacaoRecord;
import br.com.zupacademy.kevin.transacoes.transacao.Transacao;
import br.com.zupacademy.kevin.transacoes.transacao.TransacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoListener {

    @Autowired
    private TransacaoRepository transacaoRepository;

    private final Logger logger = LoggerFactory.getLogger(TransacaoListener.class);

    @KafkaListener(topics = "transacoes")
    public void listen(TransacaoRecord transacaoRecord){
        logger.info(transacaoRecord.toString());

        Transacao transacao = new Transacao(
                transacaoRecord.getId(),
                transacaoRecord.getValor(),
                transacaoRecord.getEstabelecimento().getNome(),
                transacaoRecord.getEstabelecimento().getCidade(),
                transacaoRecord.getEstabelecimento().getEndereco(),
                transacaoRecord.getCartao().getId(),
                transacaoRecord.getCartao().getEmail(),
                transacaoRecord.getEfetivadaEm()
        );

        transacaoRepository.save(transacao);
    }
}
