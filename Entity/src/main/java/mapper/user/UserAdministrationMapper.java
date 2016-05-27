package mapper.user;

import java.util.List;
import java.util.Map;

import vo.UserDetail;
import vo.UserInfo;

public interface UserAdministrationMapper {

	
	public String getPasswordById(String id);
	public void changeAuthority(Map<String, Object> param);
	public void checkLastVisitTime(String id);
	public void addVisitCount(String id);
	public void addExitTime(String id);
	
	public List<UserDetail> getAllUserDetail(Map<String, Integer> param);
	
	public UserDetail getUserDetailById(String id);
	public UserInfo getUserInfoById(String id);
}
