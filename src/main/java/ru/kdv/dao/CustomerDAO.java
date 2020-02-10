package ru.kdv.dao;

import org.springframework.stereotype.Repository;
import ru.kdv.entity.Customer;

import java.util.List;

@Repository
public interface CustomerDAO {
    public List<Customer> getCustomers();
}
