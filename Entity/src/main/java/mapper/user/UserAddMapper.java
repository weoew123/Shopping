package mapper.user;

import java.util.Map;

import vo.UserDetail;

public interface UserAddMapper {
	
	public void addDefalutUser(Map<String, String> param);
	public void addDetailUser(UserDetail user);
	public int overlap(String id);
	public void addInfoUser(String id);
	public void makeDetailUser(String id);
}
