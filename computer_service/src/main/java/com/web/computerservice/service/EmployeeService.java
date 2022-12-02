package com.web.computerservice.service;

import com.web.computerservice.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee findEmployeeById(Long id);
    Iterable<Employee> findAllEmployeesById(Iterable<Long> ids);
    Iterable<Employee> findAllEmployees();
    Employee findEmployeeByName(String name);
    Employee findEmployeeBySurname(String surname);
    Employee findEmployeeByEmail(String email);
    Employee findEmployeeByPhoneNumber(String phone);
    void saveEmployee(Employee employee);
    Iterable<Employee> saveAllEmployees(Iterable<Employee> employees);
    void updateEmployee(Employee employee);
    void delete(Employee employee);
    void deleteEmployeeById(Long id);
    void deleteAllEmployeesById(Iterable<Long> ids);
    void deleteAllEmployees();
    void deleteAllEmployees(Iterable<Employee> employees);
    boolean isEmployeeExists(Employee employee);
}
