package com.revature;

public class EmployeeDAOFactory {
	private static EmployeeDaoImpl dao;
	private EmployeeDAOFactory() {
		
	}
	public static EmployeeDao getEmployeeDao() {
		if (dao == null) 
			dao = new EmployeeDaoImpl();
			return dao;
			
	}
	
	

}
	
