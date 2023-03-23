package com.spring.quickstarts.dao;

import java.util.List;

import com.spring.quickstarts.model.Employee;
 
public interface EmployeeDao {
 
//    Employee findById(int id);
// 
//    void saveEmployee(Employee employee);
//     
//    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();

	Employee findEmployee(Integer id);
 
//    Employee findEmployeeBySsn(String ssn);
 
}