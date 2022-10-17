package com.qcustomers.customer;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
//public record CustomerService(CustomerRepository customerRepository) {
    public class CustomerService {
    private final CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
//        TODO: validation for all fields
        customerRepository.save(customer);
    }
}
