package co.jp.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.jp.hello.dto.UserDto;
import co.jp.hello.service.SpringSecService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class SpringSecController {
	@Autowired
	SpringSecService springService;
	
	@GetMapping("/list")
	public List<UserDto> getUsers(){
		return this.springService.getUsers();
	}
}



	

