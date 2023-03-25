package com.spring.quickstarts.dao;

import java.util.List;

import com.spring.quickstarts.model.EmployeeEMF;
 
public interface EmployeeDao {
 
    List<EmployeeEMF> findAllEmployees();

    EmployeeEMF findEmployee(Integer id);
 
    void saveEmployee(EmployeeEMF employee);
}