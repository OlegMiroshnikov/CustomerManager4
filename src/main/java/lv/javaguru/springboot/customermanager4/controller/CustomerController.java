package lv.javaguru.springboot.customermanager4.controller;

import lv.javaguru.springboot.customermanager4.model.Customer;
import lv.javaguru.springboot.customermanager4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    //Get all Customers (GET /api/customers)
    @GetMapping("/customers")
    public List<Customer> getAllNotes() {
        return customerRepository.findAll();
    }

    //Create a new Customer (POST /api/customers)
    @PostMapping("/customers")
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    //Get a single Customer (Get /api/customers/{customerId})
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Integer customerId) {
        Customer customer = customerRepository.findOne(customerId);
        if (customer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(customer);
    }

    //Update a Customer (PUT /api/customers/{customerId})
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "id") Integer customerId,
                                                   @Valid @RequestBody Customer customerDetails) {
        Customer customer = customerRepository.findOne(customerId);
        if (customer == null) {
            return ResponseEntity.notFound().build();
        }
        customer.setRegNr(customerDetails.getRegNr());
        customer.setName(customerDetails.getName());
        customer.setAddress(customerDetails.getAddress());
        customer.setEmail(customerDetails.getEmail());
        Customer updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }

    //Delete a Customer (DELETE /api/customers/{customerId})
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable(value = "id") Integer customerId) {
        Customer customer = customerRepository.findOne(customerId);
        if(customer == null) {
            return ResponseEntity.notFound().build();
        }
        customerRepository.delete(customer);
        return ResponseEntity.ok().build();
    }

}
