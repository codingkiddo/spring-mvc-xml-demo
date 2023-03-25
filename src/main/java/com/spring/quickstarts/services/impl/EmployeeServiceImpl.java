package com.spring.quickstarts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.EmployeeDTO;
import com.spring.quickstarts.model.EmployeeEMF;
import com.spring.quickstarts.services.EmployeeService;
 
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeDao dao;
     
    public List<EmployeeEMF> findAllEmployees() {
        return dao.findAllEmployees();
    }
 
    public EmployeeEMF findEmployee(Integer id) {
        return dao.findEmployee(id);
    }

	@Override
	public void saveEmployee(EmployeeDTO employee) {
		
	}
    
}