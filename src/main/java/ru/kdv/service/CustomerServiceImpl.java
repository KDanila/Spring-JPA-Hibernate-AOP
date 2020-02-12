package ru.kdv.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kdv.dao.CustomerDAO;
import ru.kdv.entity.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
