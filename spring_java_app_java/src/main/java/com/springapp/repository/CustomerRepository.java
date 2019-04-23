package com.springapp.repository;

import java.util.List;

import com.springapp.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}