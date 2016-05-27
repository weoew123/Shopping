package cls.user;

import intfc.user.entity.UserAddEntity;
import intfc.user.entity.UserAdminEntity;
import vo.User;

public class UserAdminService implements intfc.user.UserAdminService {

	UserAdminEntity userAd = new cls.user.entity.UserAdminEntity();
	UserAddEntity userAdd = new cls.user.entity.UserAddEntity();

	@Override
	public boolean Login(String id, String password) {

		String encrypted = userAd.getPasswordById(id);

		if (!encrypted.equals(password.trim())) {
			return false;
		}

		userAd.checkLastVisitTime(id);
		userAd.addVisitCount(id);
		return true;

	}

	@Override
	public boolean LogOut(String id) {
		return userAd.addExitTime(id);
	}

	@Override
	public boolean exitUser(String id) {
		return userAd.changeAuthority(id, 0);
	}

	@Override
	public boolean addUser(User user) {
		return userAdd.addDefalutUser(user.getId(), user.getPassword());
	}

	@Override
	public boolean addDetailUser(User user) {
		return userAdd.addDetailUser(user.getUserDetail());
	}
}
