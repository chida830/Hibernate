package com.example.Spring_Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Employee_Entity.Employee;
import com.example.Spring_Employee_repository.EmployeeRepository;





@RestController
public class Controller {
	@Autowired
	EmployeeRepository e1;
	
	@PostMapping("/hiii")
	public String m1() {
		return "Hellllo";
		
	}
	
	@PostMapping("/saveuser") 
	public void saveuser(@RequestBody Employee e)
	
	{
	e1.save(e);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
	@GetMapping("/getuserdata")
	public Employee getUser(@RequestParam int id) {
		Optional<Employee> ou=e1.findById(id);
		return ou.get();
	}
	@GetMapping("/getalldata")
	public List<Employee> getallUsers() {
		return e1.findAll();
	}
	@DeleteMapping("/delete") 
	public String deleteEmployee(@RequestParam int id) {
		e1.deleteById(id);
		return "Deleted succesfully";
	}
	@PutMapping("/Updatedata") 
	public Employee UpdateEmployee( @RequestBody Employee e ) {
		return e1.save(e);
	}
	
	
	
		
		
		
		
		
		
		
		
	

		
	
		
	
	
	
	

}







