package com.spring.quickstarts.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.services.EmployeeService;
 
@Service
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeDao employeeDao;
     
    public Employee findByEmpNo(int id) {
        return employeeDao.findByEmpNo(id);
    }
 
    public void saveEmployee(Employee employee) {
    	employeeDao.saveEmployee(employee);
    }
 
    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */
    public void deleteEmployee(Integer emp_no) {
    	employeeDao.deleteEmployee(emp_no);
    }
 
    
     
}