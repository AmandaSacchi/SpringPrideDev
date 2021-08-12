package com.amanda.prideDevBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.prideDevBank.entity.ContaEntity;
import com.amanda.prideDevBank.entity.TransacaoEntity;
import com.amanda.prideDevBank.repository.TransacaoRepository;

@Service
public class TransacaoService {


    @Autowired
    TransacaoRepository transacaoRepository;

    @Autowired
    ContaService contaService;


    public void criaTransacao(TransacaoEntity transacao, String numeroConta, String numeroAgencia) {
        String tipoTransacao = transacao.getTipo();

        ContaEntity contaOrigem = contaService.getConta(numeroAgencia,numeroConta);


        if(tipoTransacao.equals("Deposito")) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() + transacao.getValor());
        }

        //saque

        transacao.setContaOrigem(contaOrigem);

        transacaoRepository.save(transacao);
    }
}
