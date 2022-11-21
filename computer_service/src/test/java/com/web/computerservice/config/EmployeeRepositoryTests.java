package com.web.computerservice.config;

import com.web.computerservice.model.Employee;
import com.web.computerservice.repo.EmployeeRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class EmployeeRepositoryTests {
    @Autowired
    private final EmployeeRepository employeeRepository;

    @Autowired
    private TestEntityManager entityManager;

    public EmployeeRepositoryTests(EmployeeRepository employeeRepository, TestEntityManager testEntityManager) {
        this.employeeRepository = employeeRepository;
    }

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setSurname("Smith");
        employee.setPhoneNumber("+48759856562");
        employee.setLogin("johnsmith123");
        employee.setPassword("root");

        Employee savedEmployee = employeeRepository.save(employee);


    }
}
