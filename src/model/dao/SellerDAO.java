package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {
	
	void insert(Seller department);
	void update(Seller department);
	void deletById(Integer id);
	Seller findById(Integer id);
	List<Seller> listAll();
	
}
