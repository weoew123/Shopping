package emailTest;

import org.junit.Test;

import emailing.EmailService;

public class EmailTest {
	@Test
	public void emailsend(){
		EmailService emailService = new EmailService();
		emailService.emailSend();
		System.out.println("메일전송을 완료했습니다");
	}
}
