package test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import mapper.UserMapper;
import pojo.User;

public class DaoTest extends BaseTest2{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void TestUserMapper(){
		System.out.println(userMapper);
		List<User> users=userMapper.findUserList();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
}
