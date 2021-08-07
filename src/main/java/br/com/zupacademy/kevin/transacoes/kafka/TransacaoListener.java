package br.com.zupacademy.kevin.transacoes.kafka;

import br.com.zupacademy.kevin.transacoes.kafka.record.TransacaoRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoListener {

    @KafkaListener(topics = "transacoes")
    public void listen(TransacaoRecord transacaoRecord){
        System.out.println(transacaoRecord.toString());
    }
}
