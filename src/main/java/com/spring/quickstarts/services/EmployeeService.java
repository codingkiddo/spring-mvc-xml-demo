package com.spring.quickstarts.services;

import java.util.List;

import com.spring.quickstarts.model.EmployeeDTO;
import com.spring.quickstarts.model.EmployeeEMF;

 
public interface EmployeeService {
 
    void saveEmployee(EmployeeDTO employee);
 
    List<EmployeeEMF> findAllEmployees();
    
    EmployeeEMF findEmployee(Integer id);
     
}