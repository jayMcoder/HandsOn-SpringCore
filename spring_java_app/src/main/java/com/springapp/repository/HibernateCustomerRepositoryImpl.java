package com.springapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.springapp.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.springapp.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("jay");
		customer.setLastName("m");
		
		customers.add(customer);
		
		return customers;
	}

}
