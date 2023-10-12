package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
