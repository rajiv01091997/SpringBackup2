package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Model.User;

public interface userRepository extends JpaRepository<User, Integer>{

}
