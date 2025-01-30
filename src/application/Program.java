package application;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        List<Seller> listSeller = sellerDao.findAll();

        Department department = new Department(4, "Fitness");
        Seller seller = new Seller(9, "Jones Red", "jones@gmail.com", LocalDate.now(), 4000.0, department);

        sellerDao.insert(seller);
        System.out.println("New Seller Id: " + seller.getId());
        sellerDao.update(seller);
        sellerDao.deleteById(3);
        System.out.println(sellerDao.findById(6));
        listSeller.forEach(System.out::println);

        System.out.println();
        System.out.println();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        List<Department> departmentList = departmentDao.findAll();

        Department dep = new Department(8, "Phones");

        departmentDao.insert(dep);
        System.out.println("New Department Id: " + dep.getId());
        departmentDao.update(department);
        departmentDao.deleteById(6);
        System.out.println(departmentDao.findById(3));
        departmentList.forEach(System.out::println);
    }
}
