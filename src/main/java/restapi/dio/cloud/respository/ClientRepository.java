package restapi.dio.cloud.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restapi.dio.cloud.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsByAccountNumber(String accountNumber);
}