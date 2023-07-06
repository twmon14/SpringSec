package co.jp.hello.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.jp.hello.dto.UserDto;

@Mapper
public interface SpringSecRepository {

	List<UserDto> getUserList();

}
