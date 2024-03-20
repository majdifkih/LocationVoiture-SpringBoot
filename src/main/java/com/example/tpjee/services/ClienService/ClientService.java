package com.example.tpjee.services.ClienService;

import com.example.tpjee.Entity.Client;

import java.util.List;

public interface ClientService {
    Client getClientByNom(String nom);

    List<Client> getAllClient();

    Client createClient(Client client);

    Client getClientByID(Long id);

    Client updateClient(Client client);

    void deleteClient(Long id);

    Client getOne(long id);
}
