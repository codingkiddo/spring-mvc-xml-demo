package com.spring.quickstarts.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.quickstarts.dao.AbstractDao;
import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {
 
	@Autowired
	private String testFactoryBean;
	
    public Employee findById(int id) {
        return getByKey(id);
    }
 
    public void saveEmployee(Employee employee) {
        persist(employee);
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query<Employee> query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setParameter("ssn", ssn);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
    	
    	System.out.println("&&&&&&&&&&&&&&&&&&&&& ------------ testFactoryBean: " + testFactoryBean);
    	
        CriteriaQuery<Employee> criteriaQuery = createEntityCriteria();
        Root<Employee> root = criteriaQuery.from(Employee.class);
        CriteriaQuery<Employee> all = criteriaQuery.select(root);
        TypedQuery<Employee> allQuery = this.getSession().createQuery(all);
        return allQuery.getResultList();
    }
 
//    public Employee findEmployeeBySsn(String ssn) {
//    	try {
//    		CriteriaBuilder builder = getSession().getCriteriaBuilder();
//            CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
//
//            Root<Employee> root = criteriaQuery.from(Employee.class);
//            criteriaQuery.select(root).where(builder.equal(root.get("ssn"), ssn));
//            Query<Employee> query = getSession().createQuery(criteriaQuery);
//            return (Employee) query.getSingleResult();
//    	} catch(Exception ex) {
//    		return null;
//    	}
//    }
    
    public Employee findEmployeeBySsn(String ssn) {
    	CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);

        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root).where(builder.equal(root.get("ssn"), ssn));
        Query<Employee> query = getSession().createQuery(criteriaQuery);
        return (Employee) query.getSingleResult();
    }
}