package bene.tesla.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bene.tesla.vendas.repository.ClientesRepository;

@Service
public class Services {
    private ClientesRepository repository;

    @Autowired
    public Services (ClientesRepository repository){
        this.repository = repository;
    }

    public void salvaCliente(Object cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Object cliente){
        validarCliente(cliente);
    }
}


