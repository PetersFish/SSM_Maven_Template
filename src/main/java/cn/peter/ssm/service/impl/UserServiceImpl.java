package cn.peter.ssm.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.peter.ssm.mapper.UserMapper;
import cn.peter.ssm.pojo.User;
import cn.peter.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper mapper;
	
	//select users by attributes
	public List<User> getUser(User user) {
		
		return mapper.getUser(user);
	}

	//check user info
	public boolean checkIfo(User user) {
		List<User> list = getUser(user);
		System.out.println(list);
		if(list != null && list.size() != 0) {
			return true;
		}
		return false;
	}
}
