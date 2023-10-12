package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Model.Address;

public interface addressRepository extends JpaRepository<Address, Integer> {

}
