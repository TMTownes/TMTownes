package app.reimbursement;

import java.util.List;

import app.reimbursement.Employees;

public interface EmployeeRepository {
	
	List<Employees>findAllAssociates();
	
		/**
	 * This method inserts a new record into the employee table
	 * @param Employee 
	 */
	void save (Employees Employee);
	/**
	 * This method updates an existing Employee record
	 */	
	
	void update (Employees Employee);
	/**
	 * This method finds a single Employee record
	 * 
	 */

	Employees findById (int id);
}
