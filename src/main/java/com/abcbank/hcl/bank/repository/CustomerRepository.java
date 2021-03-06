package com.abcbank.hcl.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


	Customer findByCustomerName(Long cusAccNam);

	Customer findByCustomerName(String customerName);

	Customer findByAccountNumber(Long accountNumber);

	@Query(value = "update customer set customer_ph_num = phoneNumber",nativeQuery = true)
	void updatePhoneNumber(Long accNo, Long phoneNumber);
	
	@Query(value = "update customer set customer_email = customerEmail",nativeQuery = true)
	void updateEmail(Long accNo, String customerEmail);


}
