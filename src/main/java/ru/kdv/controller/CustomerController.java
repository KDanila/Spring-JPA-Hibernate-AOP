package ru.kdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {

	@GetMapping(path = "/list")
	public String listCustomers(Model theModel) {
		return "list-customers";
	}
	
}


