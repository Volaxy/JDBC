package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	
	void insert(Department department);
	void update(Department department);
	void deletById(Integer id);
	Department findById(Integer id);
	List<Department> listAll();
	
}
