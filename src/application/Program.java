package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("TEST 1");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\nTEST 2");
		List<Seller> sellers1 = sellerDao.findByDepartment(new Department(2, null));
		for(Seller s : sellers1) {
			System.out.println(s);
		}
		
		System.out.println("\nTEST 3");
		List<Seller> sellers2 = sellerDao.listAll();
		for (Seller s : sellers2) {
			System.out.println(s);
		}
		
	}

}
