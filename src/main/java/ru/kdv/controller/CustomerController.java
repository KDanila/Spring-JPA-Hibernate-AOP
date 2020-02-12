package ru.kdv.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kdv.dao.CustomerDAO;
import ru.kdv.entity.Customer;
import ru.kdv.service.CustomerService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.getCustomers();
        System.out.println(customers);
        model.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }
}


