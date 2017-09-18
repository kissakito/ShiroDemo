package mapper;

import pojo.UserInfo;

public interface UserInfoMapper {
	
	public void saveUserInfo(UserInfo userInfo);

	public void deleteUserInfo(String[] userIds);
}
