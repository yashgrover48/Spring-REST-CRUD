package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Customer;

@Service
public interface CustomerService {
	
	public void createCustomer(Customer customer);
	
	public Customer getCustomerById(int id);
	
	public List<Customer> getAllCustomers();
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);

}
