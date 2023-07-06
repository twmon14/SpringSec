package co.jp.hello.dto;

import lombok.Data;

@Data
public class UserDto {
	int userId;
	String userNm;
	String email;
	String password;
}
