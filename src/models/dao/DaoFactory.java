package models.dao;

import models.dao.impl.DepartmentDaoJDBC;
import models.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    private static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }

    private static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC();
    }
}
