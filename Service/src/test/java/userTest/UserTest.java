package userTest;

import intfc.user.UserAdminService;

import org.junit.Test;

import encryption.UserServiceImp;

public class UserTest {

	
	@Test
	public void filereadTest() throws Exception {
		UserServiceImp usi = new UserServiceImp();
		
		String pwd = "qkrgusdnd1!";
		System.out.println(pwd);
		System.out.println(usi.encrypt(pwd));
	}
	
	@Test
	public void login() {
		UserAdminService uas = new cls.user.UserAdminService();
		
		System.out.println(uas.Login("admin", "12341234"));
		System.out.println(uas.LogOut("admin"));
	}
}
