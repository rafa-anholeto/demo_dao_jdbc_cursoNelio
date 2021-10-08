package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);

        System.out.println(department);

        System.out.println("=== TEST 2: department insert ===");
        Department dep = new Department(null,"Books");
        departmentDao.insert(dep);
        System.out.println("Inserted "+ dep.getName());

        System.out.println("\n=== TEST 3: department update ===");
        department = departmentDao.findById(1);
        department.setName("Comics");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 4: department deleteById ===");
        System.out.println("Enter id for delete test: ");
        int id =sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }
}
