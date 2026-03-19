package com.elocode.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elocode.login.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
