package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
    private CustomerService service;
   @RequestMapping(value="/")
   public String sayHello() {
       return "welcome";
   }
	
   @RequestMapping(value="/showcustomer")
   public List<Customer> list() {
       return service.showCustomer();
   }

   @GetMapping("/customer/{cus_id}")
   public ResponseEntity<Customer> get(@PathVariable Integer cus_id) {
       try {
           Customer customer = service.get(cus_id);
           return new ResponseEntity<Customer>(customer, HttpStatus.OK);
       } catch (NoSuchElementException e) {
           return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
       }      
   }
	
 
}
