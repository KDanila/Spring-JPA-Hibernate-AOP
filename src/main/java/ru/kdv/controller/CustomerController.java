package ru.kdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String listCustomers(Model model) {
		return "list-customers";
	}
}


