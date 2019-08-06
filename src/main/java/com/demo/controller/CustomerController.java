package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	/**********CREATING A CUSTOMER*********************/
	@RequestMapping(value="/create", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody Customer customer){
			customerService.createCustomer(customer);
	}
	
	/**********GETTING ALL CUSTOMERS*******************/
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomerById(@PathVariable("id") Integer customerId){
		Customer customer = customerService.getCustomerById(customerId);
		return customer;
	}
	
	/**********GETTING ALL CUSTOMERS*******************/
	@RequestMapping(value="/customers", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Customer> getAllCustomers(){
		List<Customer> customerList = customerService.getAllCustomers();
		return customerList;
	}
	
	/***********UPDATING A CUSTOMER********************/
	@RequestMapping(value="/update", method=RequestMethod.PUT, 
            produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
	}
	
	/*************DELETE A CUSTOMER************************/
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE,
            produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteCustomer(@PathVariable("id") Integer id){
		customerService.deleteCustomer(id);
	}

}
