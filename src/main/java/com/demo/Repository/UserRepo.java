package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.SystemUser;

@Repository
public interface UserRepo extends JpaRepository<SystemUser, String> {

}
