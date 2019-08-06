package com.demo.dao;

import java.util.List;

//import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	//Session session=HibernateUtil.getSessionFactory().openSession();
	
	@Override
	@Transactional
	public void createCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		session.save(customer);
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		Query<Customer> query = session.createQuery("from Customer where id=:id", Customer.class);
		query.setParameter("id",id);
		Customer customer = null;
		customer = query.getSingleResult();
		return customer;
		
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		session.update(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.openSession();
		Query<Customer> query = session.createQuery("from Customer where id=:id",Customer.class);
		query.setParameter("id", id);
		Customer customer = query.getSingleResult();
		session.delete(customer);		
	}
}
