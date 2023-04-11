package com.spring.quickstarts.services;

import com.spring.quickstarts.model.Employee;

 
public interface EmployeeService {
 
    Employee findByEmpNo(int id);
     
    void saveEmployee(Employee employee);
     
    void deleteEmployee(Integer emp_no);
     
}