package com.web.computerservice.service;

import com.web.computerservice.model.Employee;

public interface EmployeeService {
    Employee findEmployeeById(Long id);
    Iterable<Employee> findAllEmployeesById(Iterable<Long> ids);
    Iterable<Employee> findAllRequests();
    void saveEmployee(Employee employee);
    Iterable<Employee> saveAllEmployees(Iterable<Employee> employees);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void deleteEmployeeById(Long id);
    void deleteAllEmployeesById(Iterable<Long> ids);
    void deleteAllEmployees();
    void deleteAllEmployees(Iterable<Employee> employees);
    Employee queryFindEmployeeById(Long id);
}
