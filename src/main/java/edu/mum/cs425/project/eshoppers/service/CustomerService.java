package edu.mum.cs425.project.eshoppers.service;

import java.util.List;

import edu.mum.cs425.project.eshoppers.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
	public List<Customer> findAll();

	public Customer save(Customer customer);

	public Customer findOne(Long id);

	public void delete(Long id);
	public Customer findCustomerByEmail(String email);
}
