package com.spring.quickstarts.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
 
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private JtaTransactionManager txManager;
	
    public Employee findByEmpNo(int id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }
 
    public void saveEmployee(Employee employee) {
    	sessionFactory.getCurrentSession().persist(employee);
    }
 
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteEmployee(Integer emp_no) {
        Query<Employee> query = sessionFactory.getCurrentSession().createSQLQuery("delete from Employee where emp_no = :emp_no");
        query.setParameter("emp_no", emp_no);
        query.executeUpdate();
    }
 
   
}