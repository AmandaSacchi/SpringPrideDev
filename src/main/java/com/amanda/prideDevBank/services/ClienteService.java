package com.amanda.prideDevBank.services;

import static com.amanda.prideDevBank.util.ValidationUtil.validarCPF;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.prideDevBank.entity.ClienteEntity;
import com.amanda.prideDevBank.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRespository;


    public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
        validarCPF(cliente.getCpf());
        clienteRespository.save(cliente);

        return cliente;

    }


    public ClienteEntity pesquisaCliente(Integer id) {
        Optional<ClienteEntity> clienteOptional = clienteRespository.findById(id);

        if(clienteOptional.isPresent()) {
            return clienteOptional.get();
        }

        return  null;
    }

}
