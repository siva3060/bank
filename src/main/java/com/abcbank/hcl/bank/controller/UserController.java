package com.abcbank.hcl.bank.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abcbank.hcl.bank.model.*;

import com.abcbank.hcl.bank.service.CustomerService;
@RestController
@RequestMapping("/customer")
public class UserController {

	
	@Autowired
	CustomerService customerService;
	
	@PutMapping("/updateCustomer")
	public void updateCustomerDetails(String customerEmail,Long customerPhoneNum,Long customerAccountName) {
		customerService.updateCustomerDetails(customerEmail,customerPhoneNum,customerAccountName);
	}
	
	
}
