package com.shopping.mall.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.mall.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}