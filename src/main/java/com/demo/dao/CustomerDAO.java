package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public interface CustomerDAO {
	
public void createCustomer(Customer customer);
	
	public Customer getCustomerById(int id);
	
	public List<Customer> getAllCustomers();
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
}
