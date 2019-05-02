package com.abcbank.hcl.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abcbank.hcl.bank.model.*;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	Customer findByCustomerName(Long cusAccNam);

}
