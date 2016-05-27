package intfc.user.entity;

import java.util.List;
import java.util.Map;

import vo.UserDetail;
import vo.UserInfo;

public interface UserAdminEntity {

	public String getPasswordById(String id);

	public boolean changeAuthority(String id, int authority);

	public boolean checkLastVisitTime(String id);

	public boolean addVisitCount(String id);

	public boolean addExitTime(String id);

	public List<UserDetail> getAllUserDetail(Map<String, Integer> param);

	public UserDetail getUserDetailById(String id);

	public UserInfo getUserInfoById(String id);

	
}
