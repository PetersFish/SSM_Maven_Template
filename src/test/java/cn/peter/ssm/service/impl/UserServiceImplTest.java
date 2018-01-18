package cn.peter.ssm.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.peter.ssm.pojo.User;
import cn.peter.ssm.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml","classpath:spring-context.xml","classpath:mybatis-config.xml"})
public class UserServiceImplTest {
	
	@Autowired
	IUserService service;
	
	@Autowired
	User user;

	@Test
	public void testGetUser() {
		user.setUsername("Gaga");
		user.setPassword("666");
		List<User> list = service.getUser(user);
		System.out.println(list);
		System.out.println("========");
	}

	@Test
	public void testCheckIfo() {
		user.setUsername("Gaga");
		user.setPassword("111");
		boolean checkIfo = service.checkIfo(user);
		System.out.println(checkIfo);
		System.out.println("========");
	}

}
