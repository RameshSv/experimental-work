package com.exmp.app.restcontroller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exmp.app.restcontroller.dao.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
