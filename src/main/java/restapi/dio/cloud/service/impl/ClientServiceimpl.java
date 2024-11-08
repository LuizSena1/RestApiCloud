package restapi.dio.cloud.service.impl;

import org.springframework.stereotype.Service;
import restapi.dio.cloud.domain.Client;
import restapi.dio.cloud.respository.ClientRepository;
import restapi.dio.cloud.service.ClientService;

import java.util.NoSuchElementException;

@Service
public class ClientServiceimpl implements ClientService {



    private final ClientRepository clientRepository;

    public ClientServiceimpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Client create(Client newclient) {
        if (clientRepository.existsByAccountNumber(newclient.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already Exists.");
        }
        return clientRepository.save(newclient);
    }
}
