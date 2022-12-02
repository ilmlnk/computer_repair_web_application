package com.web.computerservice.repo;

import com.web.computerservice.model.ClientRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRequestRepository extends CrudRepository<ClientRequest, Long> {
    ClientRequest findByName(String name);

    ClientRequest findBySurname(String surname);
}
