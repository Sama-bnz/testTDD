package com.example.testtdd.service;
import com.example.testtdd.entity.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client) throws Exception;

    List<Client> addClients(List<Client> clients) throws Exception;

    List<Client> getAllClients();

    Client getClientById(Integer id) throws Exception;

    Client getClientByEmail(String email) throws Exception;

    List<Client> getClientsBySexe(Client.Sexe sexe) throws Exception;

    void deleteClient(Integer id) throws Exception;

    Client disableClient(Integer id) throws Exception;

    Client updateClient(Client client) throws Exception;
}
