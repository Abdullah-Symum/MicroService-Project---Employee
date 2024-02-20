package com.symum.springboot.thymeleafdemo.controller;

import com.symum.springboot.thymeleafdemo.entity.Employee;
import com.symum.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService theEmployeeService){
		employeeService = theEmployeeService;

	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		// get the employees from the db
		List<Employee> theEmployees = employeeService.findAll();
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		// Create model attribute to bind from data
		Employee theEmployee = new Employee();

		theModel.addAttribute("employee", theEmployee);

		return "employees/employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
		// get the employee from the service
		Employee theEmployee = employeeService.findById(theId);

		// set employee in the model to prepopulate the form
		theModel.addAttribute("employee", theEmployee);
		// send over to our form

		return "employees/employee-form";
	}


	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
		// Save the employee
		employeeService.save(theEmployee);

		// Use a redirect to prevent duplicate submissions
		return "redirect:/employees/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId){
		// Delete the employee
		employeeService.deleteById(theId);

		// Redirect to the employees_list
		return "redirect:/employees/list";

	}
}









