
# Spring Boot Demo
 
# Demonstrates Employee CRUD Operations through REST Controller with JSON Request/Responses.
# Updated with JPA/Apache Derby Persistence Layer
# Updated with Microservice related Annotations
# Updated Exception Handling
# Added postman collection for Testing
# Added Swagger documentation
# Added Springboot Actuator



**Pre Steps**
* Install latest version of Spring STS : https://spring.io/tools
* Install Postman plugin in Chrome for testing Rest calls
* Configure server.port = 8080 in application.properties

**Tech Stack**

**Implemented Versions**
*  Default Version		:   http://localhost:8080/employee
*  V1 Version     		:   http://localhost:8080/employee/v1/
*  Swagger UI	  		:	http://localhost:8080/swagger-ui.html
*  Swagger Contract		:	http://localhost:8080/v2/api-docs
*  Spring boot Actuator	:	http://localhost:8080/actuator/index.html#/actuator


**Invoking the Rest Controller**
* GET   		/employees 			Gets all the employees [http://localhost:8080/employee/employees](http://localhost:8080/employee/employees)
* GET    		/employees/id		Get the employee		 [http://localhost:8080/employee/employees/1](http://localhost:8080/employee/employees/1)
* POST   		/employees			Create new employees	 [http://localhost:8080/employee/employees](http://localhost:8080/employee/employees)
* PUT   		/employees/id		Update the employee		 [http://localhost:8080/employee/employees/](http://localhost:8080/employee/employees/)
* DELETE		/employees/id		Deletes the employee	 [http://localhost:8080/employee/employees/3](http://localhost:8080/employee/employees/3)


**JSON Request Sample**
* POST :  

```javascript 

{
  "id": 5,
  "name": "AbdulRaafay2",
  "age": 50,
  "salary": 5000
}

```

* GET  :  

```javascript
[
  {
    "id": 5,
    "name": "AbdulRaafay2",
    "age": 50,
    "salary": 5000
  },
  {
    "id": 1,
    "name": "AbdulRaafay1",
    "age": 10,
    "salary": 1000
  },
  {
    "id": 2,
    "name": "AbdulRaafay2",
    "age": 20,
    "salary": 2000
  }
]
```

* DELETE : 

```javascript 

http://localhost:8080/employees/5 

```

* PUT :  

```javascript 

{
  "id": 5,
  "name": "Shayan",
  "age": 5,
  "salary": 15000
} 

```

* Error Response :

```javascript
  
{
    "timestamp": 1578236232818,
    "status": 404,
    "error": "Not Found",
    "exception": "com.raq.springboot.employee.exception.EmployeeNotFoundException",
    "message": "EmpId 10",
    "path": "/employee/employees/10"
}

```

** Create Request JSON Array **

```javascript
[
    {
      "id": 5,
      "name": "AbdulRaquib11",
      "age": 50,
      "salary": 2001
    },
    {
      "id": 6,
      "name": "AbdulRaquib11",
      "age": 50,
      "salary": 2001
    }
  ]
```

**Refer for Application properties**

[Spring properties reference](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

[MD File Syntax](https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)




