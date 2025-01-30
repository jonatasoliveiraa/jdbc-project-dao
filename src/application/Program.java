package application;

import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "books");

        Seller seller = new Seller(21, "Alex", "alex@gmail.com", LocalDate.now(), 3000.0, department);
        System.out.println(seller);
    }
}
