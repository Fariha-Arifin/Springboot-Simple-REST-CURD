package com.SpringBoot.RestCURD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.RestCURD.Model.Employee;

public interface CurdRepository extends JpaRepository<Employee, Long> {

}
