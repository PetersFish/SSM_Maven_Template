package cn.peter.ssm.service;

import java.util.List;

import cn.peter.ssm.pojo.User;

public interface IUserService {

	List<User> getUser(User user);
	
	boolean checkIfo(User user);
}
