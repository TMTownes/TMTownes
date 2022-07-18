package app.reimbursement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.reimbursement.Employees;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	public List<Employees> findAllEmployees(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		List<Employees> Employee = new ArrayList<>();
		
		final String SQL = "select * from employees";
				
	}

}
