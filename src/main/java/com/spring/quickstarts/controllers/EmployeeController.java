package com.spring.quickstarts.controllers;

import java.util.Date;
import java.util.List;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jms.JmsException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.jms.SpringJmsConsumer;
import com.spring.quickstarts.jms.SpringJmsProducer;
import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    EmployeeService service;
     
    @Autowired
    MessageSource messageSource;
 
    @Autowired
    SpringJmsProducer springJmsProducer;
    
    @Autowired 
    SpringJmsConsumer springJmsConsumer;
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public List<Employee> listEmployees() {
        List<Employee> employees = service.findAllEmployees();
        return employees;
    }
    
    @RequestMapping(value = { "/{id}" }, method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable Integer id) {
        Employee employee = service.findById(id);
        springJmsProducer.sendMessage("Read employee : " + employee.getEmp_no());
        return employee;
    }
 
    @RequestMapping(value = { "/message" }, method = RequestMethod.GET)
    public String readJmsMessage() throws JmsException, JMSException {
    	springJmsConsumer.readMessage();
        return "OK !!!!";
    }
    
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee() {
    	Employee employee = new Employee();
//    	employee.setEmp_no(500000);
        Date date = new Date();  
    	employee.setBirth_date(date);
    	employee.setFirst_name("VINOD");
    	employee.setLast_name("KUMAR");
    	employee.setGender('M');
    	employee.setHire_date(date);
        service.saveEmployee(employee);
        return "Saved !!!!";
    }
    
    @ExceptionHandler(value = EmptyResultDataAccessException.class)
    public String emptyResultDataAccessExceptionHandler(Model theModel) {       
        theModel.addAttribute("err", "EmptyResultDataAccessException");
        return "error";
    }
}
