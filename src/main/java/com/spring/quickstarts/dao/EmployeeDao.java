package com.spring.quickstarts.dao;

import com.spring.quickstarts.model.Employee;
 
public interface EmployeeDao {
 
    Employee findByEmpNo(int id);
 
    void saveEmployee(Employee employee);
     
    void deleteEmployee(Integer emp_no);
     
}