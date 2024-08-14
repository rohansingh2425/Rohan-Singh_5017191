package com.example.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    //List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findEmployeesByName(@Param("name") String name);

    @Query(name = "Employee.findByDepartmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);

    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT new com.example.employeemanagementsystem.EmployeeDTO(e.name, e.email) FROM Employee e WHERE e.department.name = :departmentName")
    List<EmployeeDTO> findDTOByDepartmentName(String departmentName);


}
