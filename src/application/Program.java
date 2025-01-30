package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Department department = new Department(2, "books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        List<Seller> seller = sellerDao.findByDepartment(department);

        seller.forEach(System.out::println);
    }
}
