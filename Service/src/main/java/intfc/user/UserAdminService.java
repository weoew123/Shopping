package intfc.user;

import vo.User;

public interface UserAdminService {

	
	public boolean Login(String id, String password);
	public boolean LogOut(String id);
	public boolean exitUser(String id);
	public boolean addUser(User user);
	public boolean addDetailUser(User user);
}
