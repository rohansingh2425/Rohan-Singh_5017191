package com.example.employeemanagementsystem;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByDepartmentName(String departmentName);
}
