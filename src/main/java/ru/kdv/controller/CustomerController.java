package ru.kdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kdv.dao.CustomerDAO;
import ru.kdv.entity.Customer;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerDAO customerDAO;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customers = customerDAO.getCustomers();
		System.out.println(customers);
		model.addAttribute("customers", customers);
		return "list-customers";
    }
}


