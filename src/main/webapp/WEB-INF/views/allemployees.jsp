<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
    <title>University Enrollments</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of Employees</h2>  
    <table>
        <tr>
            <td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
            <td>${employee.name}</td>
            <td>${employee.joiningDate}</td>
            <td>${employee.salary}</td>
            <td><a href="<c:url value='/app/employee/edit-${employee.ssn}-employee' />">${employee.ssn}</a></td>
            <td><a href="<c:url value='/app/employee/delete-${employee.ssn}-employee' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/app/employee/new' />">Add New Employee</a>
</body>
</html>
