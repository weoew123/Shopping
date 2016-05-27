package intfc.user.entity;

import vo.UserDetail;

public interface UserAddEntity {
	public boolean addDefalutUser(String id, String pwd);
	public boolean addDetailUser(UserDetail addUser);
	public boolean overlap(String id);
}
