package com.ibm.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("FROM Employee WHERE hireDate < :joinUntil")
	List<Employee> findAllJoinedBefore(@Param("joinUntil") LocalDate joinUntil);
	
	List<Employee> findAllByHireDateBetween(LocalDate start, LocalDate end);
}
