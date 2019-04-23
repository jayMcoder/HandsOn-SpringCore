package com.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springapp.model.Customer;
import com.springapp.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	/* (non-Javadoc)
	 * @see com.springapp.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(final CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
