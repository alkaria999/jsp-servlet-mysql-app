package com.example.dao;

import java.sql.SQLException;
import java.util.List;
import com.example.model.Employee;

public interface EmployeeDAO {
	public void insertEmployee(Employee employee) throws SQLException;
	public Employee getEmployeeById(int id) ;
	public List<Employee> getAllEmployees();
	public boolean deleteEmployee(int id) throws SQLException;
	public boolean updateEmployee(Employee employee) throws SQLException;
}
