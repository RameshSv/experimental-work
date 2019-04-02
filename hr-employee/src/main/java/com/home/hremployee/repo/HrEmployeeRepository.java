package com.home.hremployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.hremployee.entity.HrEmployee;

public interface HrEmployeeRepository extends JpaRepository<HrEmployee, Long>{

}
