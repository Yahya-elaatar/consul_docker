package org.ensaj.client.services;

import org.ensaj.client.entities.Client;
import org.ensaj.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(Long id) throws Exception {
        return clientRepository.findById(id).orElseThrow(()-> new Exception("Inv Client Id"));
    }

    public void addClient(Client client){
        clientRepository.save(client);
    }
}
