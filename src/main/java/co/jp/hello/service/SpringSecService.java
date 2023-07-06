package co.jp.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.hello.dto.UserDto;
import co.jp.hello.repository.SpringSecRepository;

@Service
public class SpringSecService {
	@Autowired
	SpringSecRepository  springRepo;
	public List<UserDto> getUsers() {
		List<UserDto> userList = this.springRepo.getUserList();
		System.out.println("attlist   "+userList);
		return userList;
	}

}
