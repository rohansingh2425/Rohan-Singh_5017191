package com.example.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.List;


@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Department dept = new Department();
        dept.setName("IT");
        departmentRepository.save(dept);

        Employee emp = new Employee();
        emp.setName("Rohan Singh");
        emp.setEmail("rohansingh1527contai@gmail.com");
        emp.setDepartment(dept);
        employeeRepository.save(emp);

        List<Employee> employees = employeeRepository.findByDepartmentName("IT");
        employees.forEach(System.out::println);
    }
}
