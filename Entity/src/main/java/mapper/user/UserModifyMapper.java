package mapper.user;

import vo.User;

public interface UserModifyMapper {

	public void modifyUser(User user);
	
	public void addModifyLog();
}
