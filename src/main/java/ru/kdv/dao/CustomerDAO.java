package ru.kdv.dao;

import org.springframework.stereotype.Repository;
import ru.kdv.entity.Customer;

import java.util.List;

@Repository
public interface CustomerDAO {
    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomer(int id);
}
