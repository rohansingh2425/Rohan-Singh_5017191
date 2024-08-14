package com.example.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long>
{
    @Query(name = "Department.findByName")
    List<Department> findDepartmentsByName(@Param("name") String name);

    List<DepartmentNameProjection> findAllProjectedBy();
}
