package com.web.computerservice.repo;

import com.web.computerservice.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
    Request findByName(String name);

    Request findBySurname(String surname);
}
