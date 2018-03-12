
# Spring Boot Demo 
# Demonstrates Employee CRUD Operations through REST Controller with JSON Request/Responses.
# Updated with JPA/Apache Derby Persistence Layer
# Updated with Microservice related Annotations


**Pre Steps**
* Install latest version of Spring STS : https://spring.io/tools
* Install Postman plugin in Chrome for testing Rest calls
* Configure server.port = 8080 in application.properties

**Tech Stack**

**Implemented Versions**
* http://localhost:8080/v1/microservice/employees
* http://localhost:8080/v2/microservice/employees


**Invoking the Rest Controller**
* GET   		/employees 			Gets all the employees   http://localhost:8080/v1/employee/employees
* GET    		/employees/id		Get the employee		 http://localhost:8080/v1/employee/employees/1
* POST   		/employees			Create new employee		 http://localhost:8080/v1/employee/employees
* PUT   		/employees/id		Update the employee		 http://localhost:8080/v1/employee/employees/
* DELETE		/employees/id		Deletes the employee	 http://localhost:8080/v1/employee/employees/3


**JSON Request Sample**
* POST : {"id":5,"name":"AbdulRaafay2","age":50,"salary":5000.0}
* GET  : [{"id":5,"name":"AbdulRaafay2","age":50,"salary":5000.0},{"id":1,"name":"AbdulRaafay1","age":10,"salary":1000.0},{"id":2,"name":"AbdulRaafay2","age":20,"salary":2000.0}]
* DELETE : http://localhost:8080/employees/5
* PUT : {"id":5,"name":"Shayan","age":5,"salary":15000.0}



**Refer for Application properties**

[https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)



