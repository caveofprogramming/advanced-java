package app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entities.User;
import app.services.UserService;

@RestController
public class HelloController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userService.getAll();
	}
	
	@PostMapping("/users")
	public String test() {
		return "hello";
	}
}
