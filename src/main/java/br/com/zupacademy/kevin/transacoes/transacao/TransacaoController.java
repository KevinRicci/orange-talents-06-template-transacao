package br.com.zupacademy.kevin.transacoes.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping
    public ResponseEntity<Page<TransacaoResponse>> buscaTransacoes(@RequestParam String cartaoId,
            @PageableDefault Pageable pageable){

        Page<Transacao> transacoes =  transacaoRepository.findByCartaoId(cartaoId, pageable);
        if(transacoes.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Page<TransacaoResponse> transacoesResponses = new TransacaoResponse().converter(transacoes);
        return ResponseEntity.ok(transacoesResponses);
    }
}
