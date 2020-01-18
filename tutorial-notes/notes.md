** Static Filtering **
* @JsonIgnoreProperties(value={"field1","field2",..}) at the class level
* @JsonIgnore at the field level

** Dynamic Filtering **
* Use Filter providers and MappingJacksonValue inside the controller method

** For Swagger Documentation **

``` 	
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>
		
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>
```
* Create SwaggerConfig class with annotations @Configuration @EnableSwagger2
* create api() method 



** For Spring Boot Actuator **

* # This is for enabling spring boot actuator, note there will be performance impact due to this configuration
*  management.endpoints.web.exposure.include=*

```	
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-rest-hal-browser</artifactId>
		</dependency>
		 
```

** Versioning aspects**

* Versioning strategy 1 using simple URI mapping
* Versioning strategy 2 using param
* Versioning strategy 3 using headers
* Versioning strategy 4 using content-negotiations or accept versioning, also known as MIME Type versioning

--  ![Alt text](Microservice-Versioning-notes1.JPG)
 
**  basic security **



* # Configuration for basic security
* security.user.name=user
* security.user.password=password

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>


```


# JPA Repository Configuration

* # Configuration for JSP
* spring.jpa.show-sql=true
* spring.h2.console.enabled=true
* We could dml in src/main/resources/data.sql, springboot will load the data


```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		 
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>


```
