package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
