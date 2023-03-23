package com.spring.quickstarts.services;

import java.util.List;

import com.spring.quickstarts.model.Employee;

 
public interface EmployeeService {
 
//    Employee findById(int id);
//     
//    void saveEmployee(Employee employee);
//     
//    void updateEmployee(Employee employee);
//     
//    void deleteEmployeeBySsn(String ssn);
 
    List<Employee> findAllEmployees(); 
    Employee findEmployee(Integer id);
    
//    Employee findEmployeeBySsn(String ssn);
// 
//    boolean isEmployeeSsnUnique(Integer id, String ssn);
     
}