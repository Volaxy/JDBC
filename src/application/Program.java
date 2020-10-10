package application;

import java.util.Date;
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
		Department dep = new Department(2, null);
		List<Seller> sellers1 = sellerDao.findByDepartment(dep);
		for(Seller s : sellers1) {
			System.out.println(s);
		}
		
		System.out.println("\nTEST 3");
		List<Seller> sellers2 = sellerDao.listAll();
		for (Seller s : sellers2) {
			System.out.println(s);
		}
		
		System.out.println("\nTEST 4");
		Seller sel = new Seller(null, "Greg", "greg@gmail.com", new Date(), 2500.0, dep);
		sellerDao.insert(sel);
		System.out.println("Inserted! Id: " + sel.getId());
		
		System.out.println("\nTEST 5");
		sel = sellerDao.findById(1);
		sel.setName("Marta");
		sellerDao.update(sel);
		
		System.out.println("\nTEST 6");
		sellerDao.deletById(3);
		
	}

}
