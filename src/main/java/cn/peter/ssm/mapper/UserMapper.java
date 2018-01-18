package cn.peter.ssm.mapper;


import java.util.List;

import cn.peter.ssm.pojo.User;

public interface UserMapper {

	//select user by user attributes
	List<User> getUser(User user);
}
