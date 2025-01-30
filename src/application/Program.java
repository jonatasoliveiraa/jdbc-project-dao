package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Department department = new Department(4, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        List<Seller> listSeller = sellerDao.findAll();

        Seller seller = new Seller("Jones Red", "jones@gmail.com", LocalDate.now(), 4000.0, department);

        sellerDao.insert(seller);
        System.out.println("New Id: " + seller.getId());
    }
}
