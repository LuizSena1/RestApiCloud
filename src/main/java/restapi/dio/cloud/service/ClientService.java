package restapi.dio.cloud.service;


import restapi.dio.cloud.domain.Client;

public interface ClientService {
    Client findById(Long id);

    Client create(Client nclient);
}
