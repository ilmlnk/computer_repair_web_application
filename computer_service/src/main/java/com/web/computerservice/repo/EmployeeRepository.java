package com.web.computerservice.repo;

import com.web.computerservice.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByName(String name);
    Employee findBySurname(String surname);
    Employee findByPhoneNumber(String phone);
    Employee findByEmail(String email);
}
