package com.web.computerservice.impl;

import com.web.computerservice.model.Employee;
import com.web.computerservice.repo.EmployeeRepository;
import com.web.computerservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @PersistenceContext
    private EntityManager entityManager;
    private EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository, PasswordEncoder passwordEncoder) {
        this.employeeRepository = employeeRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public Employee findEmployeeById(Long id) {
        return null;
    }

    @Override
    public Iterable<Employee> findAllEmployeesById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public Iterable<Employee> findAllEmployees() {
        return null;
    }

    @Override
    public Employee findEmployeeByName(String name) {
        return null;
    }

    @Override
    public Employee findEmployeeBySurname(String surname) {
        return null;
    }

    @Override
    public Employee findEmployeeByEmail(String email) {
        return null;
    }

    @Override
    public Employee findEmployeeByPhoneNumber(String phone) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Iterable<Employee> saveAllEmployees(Iterable<Employee> employees) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    @Override
    public void deleteAllEmployeesById(Iterable<Long> ids) {

    }

    @Override
    public void deleteAllEmployees() {

    }

    @Override
    public void deleteAllEmployees(Iterable<Employee> employees) {

    }

    @Override
    public boolean isEmployeeExists(Employee employee) {
        return false;
    }

    public Employee queryFindEmployeeById(Long id) {
        return (Employee) entityManager.createQuery("FROM employee as e where e.id = :id");
    }
}
