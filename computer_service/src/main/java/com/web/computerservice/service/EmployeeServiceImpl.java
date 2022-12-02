package com.web.computerservice.service;

import com.web.computerservice.model.Employee;
import com.web.computerservice.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;
    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Employee> findAllEmployeesById(Iterable<Long> ids) {
        return employeeRepository.findAllById(ids);
    }

    @Override
    public Iterable<Employee> findAllRequests() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> saveAllEmployees(Iterable<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    @Override
    public void updateEmployee(Employee employee) {
        saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmployeesById(Iterable<Long> ids) {
        employeeRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

    @Override
    public void deleteAllEmployees(Iterable<Employee> employees) {
        employeeRepository.deleteAll(employees);
    }

    @Override
    public Employee queryFindEmployeeById(Long id) {
        return (Employee) entityManager.createQuery("FROM employee as e where e.id = :id");
    }


}
