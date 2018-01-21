package com.ssm.dao;

import
		java.util.List;
import java.util.Map;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	public User getUserById(int id);
	
	public List<User> getUsers(Map map);
	
	public Long getTotalUser();
	
	public int updateUser(User user);
	
	public int addUser(User user);
	
	public int deleteUser(Integer id);
	  List<User> getAjaxUser();
}
