import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import vo.UserDetail;
import intfc.user.entity.UserAdminEntity;

public class UserAdmin {

	UserAdminEntity ua = new cls.user.entity.UserAdminEntity();

	@Test
	public void getpasswordTest() {
		System.out.println(ua.getPasswordById("test"));
	}

	@Test
	public void checkLast() {
		System.out.println(ua.checkLastVisitTime("admin"));
	}

	@Test
	public void getAll() {
		List<UserDetail> list = new ArrayList<UserDetail>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", 1);
		map.put("end", 6);

		list = ua.getAllUserDetail(map);

		for (UserDetail temp : list) {
			System.out.println(temp.toString());
		}
	}

	@Test
	public void getinfobyid() {
		System.out.println(ua.getUserInfoById("test").toString());
	}

	@Test
	public void getDetailbyid() {
	}
}
