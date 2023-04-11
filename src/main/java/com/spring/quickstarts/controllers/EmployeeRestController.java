package com.spring.quickstarts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.services.EmployeeService;

@RestController
@RequestMapping("/employee-rest")
public class EmployeeRestController {

	@Autowired
    EmployeeService service;
     
    @Autowired
    MessageSource messageSource;
	 /*
     * This method will be called on form submission, handling POST request for
     * updating employee in database. It also validates the user input
     */
    @RequestMapping(value = { "/delete-employee/{emp_no}" }, method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable Integer emp_no) {
        service.deleteEmployee(emp_no);
        return "success";
    }
}
