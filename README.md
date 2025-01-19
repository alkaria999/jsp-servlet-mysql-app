# JSP, Servlet, MySQL Database CRUD Application

_Employee Managemnet App_ is a web application developed using **JSP and Servlets**. The goal of the application is to keep track of the employees and the application involves the basic **CRUD** operations, it also involves the **MVC Design pattern**. 

## Tools and Technologies used

1. JSP
2. Servlets
3. MVC Design Pattern
4. MySQL Workbench
5. Eclipse J2EE
6. Apache tomcat 9

## Steps to install

1.Clone the application

```javascript
https://github.com/alkaria999/jsp-servlet-mysql-app.git
```

2.Create a MySQL Database

```sql
CREATE DATABASE employee_db;
USE employee_db;
```

3.Create a table and insert values

```sql
CREATE TABLE employees (
	id  int(3) NOT NULL AUTO_INCREMENT,
	name varchar(120) NOT NULL,
    age int(2) NOT NULL,
    gender varchar(20) NOT NULL,
	department varchar(220) NOT NULL,
	yearOfJoining int(4),
    salary int8(10),
	PRIMARY KEY (id)
);

INSERT INTO employees(name, age, gender, department, yearOfJoining, salary) values 
("Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
("Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
("Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
("Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
("Nima Roy", 27, "Female", "HR", 2013, 22700.0),
("Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
("Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0),
("Wang Liu", 31, "Male", "Product Development", 2015, 34500.0),
("Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0),
("Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5),
("Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),
("Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0),
("Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0),
("Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5),
("Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0),
("Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),
("Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0);
```



Screenshot : 
<img width="950" alt="image" src="https://github.com/user-attachments/assets/a7492aea-a84d-42d9-9226-7858b50322aa" />


If any issue occurs, do the following changes and issue will be fixed.
<img width="611" alt="image" src="https://github.com/user-attachments/assets/edce86a3-de3b-4d5e-aa46-786e0fd37f9d" />

