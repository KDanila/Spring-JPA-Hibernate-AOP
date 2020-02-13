package ru.kdv.service;

import ru.kdv.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomer(int id);
}
