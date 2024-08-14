package com.example.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findEmployeesByName(@Param("name") String name);

    @Query(name = "Employee.findByDepartmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

}
