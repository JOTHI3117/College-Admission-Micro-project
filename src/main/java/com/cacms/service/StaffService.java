package com.cacms.service;

import java.util.List;

import com.cacms.model.Staff;

public interface StaffService {
	
	public void addStaff(Staff staff);


	public List<Staff> getAllStaff();

	public boolean updateStaff(Staff staff);
	
	public void deleteStaff(int staffId);
	
	public Staff staffLogin(String staffName, String password);

}
