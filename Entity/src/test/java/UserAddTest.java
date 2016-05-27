import org.junit.Test;

import vo.User;
import vo.UserDetail;
import cls.user.entity.UserAddEntity;


public class UserAddTest {

	UserAddEntity ua = new UserAddEntity();

	UserDetail ud = new UserDetail();
	User user = new User();
	
	@Test
	public void addtest() {
	
		user.setId("addtest2");
		user.setPassword("asdf");
		
		
		ud.setId(user.getId());
		ud.setStatus(0);
		
		
		System.out.println(ua.addDefalutUser(user.getId(), user.getPassword()));
	}
	
	@Test
	public void userdetail() {
		ud.setAddress("add");
		ud.setAge(10);
		ud.setEmail("email");
		ud.setId("addtest2");
		ud.setLanguage("kor");
		ud.setName("name");
		ud.setNickname("nickname");
		ud.setPhone("010-2122-2222");
		
		System.out.println(ua.addDetailUser(ud));
	}
	
	
//	@Test
//	public void userdefalutadd() {
//		ua.addDefalutUser("test2", "4444");
//	}
//	
//	@Test
//	public void userdetailadd() {
//		ua.addDetailUser(user);
//	}
	
//	@Test
//	public void overlap() {
//		System.out.println(ua.overlap("test"));
//	}
}
