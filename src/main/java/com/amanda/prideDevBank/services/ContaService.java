package com.amanda.prideDevBank.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.amanda.prideDevBank.entity.ContaEntity;
import com.amanda.prideDevBank.repository.ContaRepository;

@Service
public class ContaService {
    @Autowired
    ContaRepository contaRepository;

    public ContaEntity savarConta(ContaEntity conta) {
        contaRepository.save(conta);

        return conta;
    }

    public ContaEntity getConta(String numeroAgencia, String numeroConta) {
        Optional<ContaEntity> contaOptional = contaRepository.findById(1);

        ContaEntity contaEntity = contaOptional.get();

        return contaEntity;

    }

}
