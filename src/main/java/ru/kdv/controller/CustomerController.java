package ru.kdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	@GetMapping("/list")
	public String listCustomers(Model model) {
		return "list-customers";
	}
}


