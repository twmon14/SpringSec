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
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SpringSecController {
	@Autowired
	SpringSecService springService;
	
	@GetMapping("list")
	public List<UserDto> getUsers(){
		return this.springService.getUsers();
	}
	
	@GetMapping("account")
	public String account(){
		return "this is account.";
	}
	
	@GetMapping("balance")
	public String balance(){
		return "your balance is ...";
	}
	
	@GetMapping("update")
	public String update(){
		return "it is updated.";
	}
	
	
}



	

