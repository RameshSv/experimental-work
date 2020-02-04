package com.exmp.app.userprofile.repo;

import java.time.OffsetDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exmp.app.userprofile.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query(nativeQuery = true, value = "SELECT * FROM USER  where IS_ACTIVE='Y'")
	List<User> findAllActiveUsers();
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(nativeQuery = true, value = "UPDATE USER u SET u.IS_ACTIVE = 'N' and u.UPDATED_DATE=:updateTime where u.id=:id")
	void deleteByUserId(@Param("id")Long id, @Param("updateTime") OffsetDateTime updateTime);

}
