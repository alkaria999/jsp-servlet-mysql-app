CREATE DATABASE employee_db;
USE employee_db;

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
    	