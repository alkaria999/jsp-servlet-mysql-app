package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Employee;
import com.example.util.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String QUERY_INSERT_EMPLOYEE = "INSERT INTO employees (name, age, gender, department, yearOfJoining, salary) VALUES (?, ?, ?, ?, ?, ?);";
	private static final String QUERY_GET_EMPLOYEE_BY_ID = "select id,name, age, gender, department, yearOfJoining, salary from employees where id =?";
	private static final String QUERY_GET_ALL_EMPLOYEES = "select * from employees";
	private static final String QUERY_DELETE_EMPLOYEES = "delete from employees where id = ?;";
	private static final String QUERY_UPDATE_EMPLOYEES = "update employees set name = ?, age= ?, gender= ?, department= ?, yearOfJoining= ?, salary= ? where id = ?;";

	public EmployeeDAOImpl() {
	}

	@Override
	public void insertEmployee(Employee employee) throws SQLException {
		System.out.println(QUERY_INSERT_EMPLOYEE);
		try (Connection connection = DBConnectionUtil.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT_EMPLOYEE)) {
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setInt(2, employee.getAge());
			preparedStatement.setString(3, employee.getGender());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setInt(5, employee.getYearOfJoining());
			preparedStatement.setDouble(6, employee.getSalary());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = null;
		try (Connection connection = DBConnectionUtil.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_EMPLOYEE_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int age = Integer.parseInt(rs.getString("age"));
				String gender = rs.getString("gender");
				String department = rs.getString("department");
				int yearOfJoining = Integer.parseInt(rs.getString("yearOfJoining"));
				double salary = Double.parseDouble(rs.getString("salary"));
				employee = new Employee(id, name, age, gender, department, yearOfJoining, salary);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try (Connection connection = DBConnectionUtil.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_ALL_EMPLOYEES);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = Integer.parseInt(rs.getString("age"));
				String gender = rs.getString("gender");
				String department = rs.getString("department");
				int yearOfJoining = Integer.parseInt(rs.getString("yearOfJoining"));
				double salary = Double.parseDouble(rs.getString("salary"));
				employees.add(new Employee(id, name, age, gender, department, yearOfJoining, salary));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return employees;
	}

	@Override
	public boolean deleteEmployee(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = DBConnectionUtil.openConnection();
				PreparedStatement statement = connection.prepareStatement(QUERY_DELETE_EMPLOYEES);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = DBConnectionUtil.openConnection();
				PreparedStatement statement = connection.prepareStatement(QUERY_UPDATE_EMPLOYEES);) {
			statement.setString(1, employee.getName());
			statement.setInt(2, employee.getAge());
			statement.setString(3, employee.getGender());
			statement.setString(4, employee.getDepartment());
			statement.setInt(5, employee.getYearOfJoining());
			statement.setDouble(6, employee.getSalary());
			statement.setInt(7, employee.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
